
package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Controle.HospedeDao;
import Controle.ReservaDao;
import modelo.Endereco;
import modelo.Hospede;
import modelo.Reserva;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTree;
import javax.swing.JSpinner;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Button;
import java.awt.SystemColor;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.Scrollbar;
import java.awt.ScrollPane;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Label;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;

public class TelaReserva extends JFrame {

	private JPanel contentPaneTela;
	private JPanel contentPaneTela_1;
	private JTextField txtNomecomple_1;

	/**
	 * Launch the application.
	 */
	ArrayList<Hospede> hospede = new ArrayList<>();
	private JTextField txtQuantidadeDias;
	private JTextField txtCpf;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnSim;
	private JRadioButton rdbtnNao;
	private ArrayList<Reserva> listaReserva;
	private JTextField txtNomecomple;
	private JTextField txtQuantidadeHospedes;
	private JTextField txtFormaPagamento;
	private JTextField txtquantDias;
	private JTextField txtValorDiaria;
	private JButton salvar;
	private Reserva reservaSelecionado;
	private JButton btnRealizarReserva;

	/**
	 * Create the frame.
	 */
	public TelaReserva() {
		setBackground(new Color(255, 255, 255));
		setTitle("Tela Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 2000, 1500);

		contentPaneTela_1 = new JPanel();
		contentPaneTela_1.setForeground(new Color(0, 0, 0));
		contentPaneTela_1.setBackground(new Color(135, 206, 250));
		contentPaneTela_1.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneTela_1);
		contentPaneTela_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Quantidade de Dias: ");
		lblNewLabel_2.setBounds(189, 358, 221, 26);
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.BOLD, 20));

		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPaneTela_1.add(lblNewLabel_2);

		/**********/
		MaskFormatter mascaraNumReserva = null;
		try {
			mascaraNumReserva = new MaskFormatter("###");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		JLabel lblNewLabel_5 = new JLabel("Quantidade de Pessoas:");
		lblNewLabel_5.setBounds(189, 503, 233, 27);
		lblNewLabel_5.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 20));

		contentPaneTela_1.add(lblNewLabel_5);

		/**********/
		MaskFormatter mascaraQuantdPessoa = null;

		JLabel lblNewLabel_6 = new JLabel("Nome Completo:");
		lblNewLabel_6.setBounds(189, 310, 188, 20);
		lblNewLabel_6.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		contentPaneTela_1.add(lblNewLabel_6);

		txtNomecomple = new JTextField();
		txtNomecomple.setBounds(283, 227, 936, 20);
		lblNewLabel_6.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPaneTela_1.add(lblNewLabel_6);
		contentPaneTela_1.add(lblNewLabel_6);

		txtNomecomple_1 = new JTextField();
		txtNomecomple_1.setBounds(361, 310, 310, 26);
		contentPaneTela_1.add(txtNomecomple_1);
		txtNomecomple_1.setColumns(10);

		JComboBox DataSaidabox = new JComboBox();
		DataSaidabox.setBounds(980, 318, 239, 22);
		DataSaidabox.setEditable(true);

		btnRealizarReserva = new JButton("Realizar Reserva");
		btnRealizarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nomecompleto = txtNomecomple_1.getText();
				String cpf = txtCpf.getText().replace("-", "");
				String formaPagamento = txtFormaPagamento.getText();
				String quantaspesssoas = txtQuantidadeHospedes.getText();
				String servicoQuarto = "";
				String valorDiaria = txtValorDiaria.getText().replace("", "");
				String quantidadeDias = txtquantDias.getText();

				String erros = "";

				Hospede hospede = new Hospede();
				Reserva reserva = new Reserva();

				if (nomecompleto == null || nomecompleto.trim() == "" || nomecompleto.isEmpty()) {
					erros += "nome\n";
				} else {
					hospede.setNome(nomecompleto);
				}

				if (cpf == null || cpf.trim() == "" || cpf.isEmpty()) {
					erros += "cpf\n";
				} else {
					Long cpfLong = Long.valueOf(cpf);
					hospede.setCpf(cpfLong);
				}

				if (rdbtnSim.isSelected()) {
					servicoQuarto = "S";
					reserva.setServicoQuarto("S");
				}
				if (rdbtnNao.isSelected()) {
					servicoQuarto = "N";
					reserva.setServicoQuarto("N");
				}
				if (servicoQuarto.trim() == "") {
					erros += "servico de quarto\n";
				}

				if (valorDiaria == null || valorDiaria.trim() == "" || valorDiaria.isEmpty()) {
					erros += "valorDiaria \n";
				} else {
					reserva.setDiaria(Long.valueOf(valorDiaria));
				}

				if (quantidadeDias == null || quantidadeDias.trim() == "" || quantidadeDias.isEmpty()) {
					erros += "quantidade Dias \n";
				} else {
					reserva.setQuantidadeDedias(Integer.valueOf(quantidadeDias));
				}
				if (formaPagamento == null || formaPagamento.trim() == "" || formaPagamento.isEmpty()) {
					erros += "formaPagamento\n";
				} else {
					reserva.setFormaPagamento(formaPagamento);
				}
				if (quantaspesssoas == null || quantaspesssoas.trim() == "" || quantaspesssoas.isEmpty()) {
					erros += "quantas pesssoas\n";
				} else {
					reserva.setQuantidadeHospede(Integer.valueOf(quantaspesssoas));
				}
				if (erros.trim() != "") {
					JOptionPane.showMessageDialog(null, "Dados invalidos" + erros);
					return;
				}
				var reservaDao = new ReservaDao();
				reservaDao.getIntancia();
				reserva.setHospede(hospede);
				boolean resultado = reservaDao.inserirReserva(reserva);
				if (resultado == true) {
					JOptionPane.showMessageDialog(null, "Reserva cadastrada");
					atualizarTabela();
					limparDados();
					txtCpf.setEditable(true);

				} else {
					JOptionPane.showMessageDialog(null, "Reserva não cadastrada");
					atualizarTabela();
					limparDados();
					txtCpf.setEditable(true);
				}

			}
		});
		btnRealizarReserva.setBounds(318, 683, 201, 53);
		btnRealizarReserva.setForeground(new Color(255, 255, 255));
		btnRealizarReserva.setBackground(new Color(0, 0, 128));
		btnRealizarReserva.setFont(new Font("Sitka Subheading", Font.BOLD, 20));

		contentPaneTela_1.add(btnRealizarReserva);
		contentPaneTela_1.add(btnRealizarReserva);

		contentPaneTela_1.add(btnRealizarReserva);
		contentPaneTela_1.add(btnRealizarReserva);
		JComboBox<String> jComboBox = new JComboBox<String>();
		jComboBox.addItem("      -SELECIONE-     ");

		JButton btnNewButton = new JButton("Alterar");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				btnRealizarReserva.setVisible(false);
				contentPaneTela_1.remove(btnRealizarReserva);

				txtCpf.setEditable(false);
				int position = table.getSelectedRow();
				String erros = "";

				if (position == -1) {
					JOptionPane.showMessageDialog(null, "Nenhum paciente selecionado");
					return;
				}

				reservaSelecionado = listaReserva.get(position);
				preencherDados(reservaSelecionado);

				salvar = new JButton("salva");
				salvar.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						String nomecompleto = txtNomecomple_1.getText();
						String cpf = txtCpf.getText().replace("-", "");
						String formaPagamento = txtFormaPagamento.getText();
						String quantaspesssoas = txtQuantidadeHospedes.getText();
						String servicoQuarto = "";
						String valorDiaria = txtValorDiaria.getText();
						String quantidadeDias = txtquantDias.getText();

						String erros = "";

						Hospede hospede = new Hospede();
						Reserva reserva = new Reserva();

						if (nomecompleto == null || nomecompleto.trim() == "" || nomecompleto.isEmpty()) {
							erros += "nome\n";
						} else {
							hospede.setNome(nomecompleto);
						}
						if (cpf == null || cpf.trim() == "" || cpf.isEmpty()) {
							erros += "cpf\n";
						} else {
							Long cpfLong = Long.valueOf(cpf);
							hospede.setCpf(cpfLong);
						}
						if (rdbtnSim.isSelected()) {
							servicoQuarto = "S";
							reserva.setServicoQuarto("S");
						}
						if (rdbtnNao.isSelected()) {
							servicoQuarto = "N";
							reserva.setServicoQuarto("N");
						}
						if (servicoQuarto.trim() == "") {
							erros += "servico de quarto\n";
						}

						if (valorDiaria == null || valorDiaria.trim() == "" || valorDiaria.isEmpty()) {
							erros += "valor Diaria \n";
						} else {
							reserva.setDiaria(Float.parseFloat(valorDiaria));
						}
						if (quantidadeDias == null || quantidadeDias.trim() == "" || quantidadeDias.isEmpty()) {
							erros += "quantidade Dias \n";
						} else {
							reserva.setQuantidadeDedias(Integer.valueOf(quantidadeDias));
						}
						if (formaPagamento == null || formaPagamento.trim() == "" || formaPagamento.isEmpty()) {
							erros += "formaPagamento\n";
						} else {
							reserva.setFormaPagamento(formaPagamento);
						}
						if (quantaspesssoas == null || quantaspesssoas.trim() == "" || quantaspesssoas.isEmpty()) {
							erros += "quantas pesssoas\n";
						} else {
							reserva.setQuantidadeHospede(Integer.valueOf(quantaspesssoas));
						}
						if (erros.trim() != "") {
							JOptionPane.showMessageDialog(null, "Dados invalidos" + erros);
							return;
						}

						ReservaDao reservaDao = new ReservaDao();
						reserva.setHospede(hospede);
						reservaDao.getIntancia();
						boolean retorno = reservaDao.alterarReserva(reserva);
						if (retorno == true) {
							JOptionPane.showMessageDialog(null, "reserva Alterada ");
							atualizarTabela();
							limparDados();
						} else {
							JOptionPane.showMessageDialog(null, "Erro, reserva não alterada");
							atualizarTabela();
							limparDados();
						}
						salvar.setVisible(false);
						contentPaneTela_1.remove(salvar);

						btnRealizarReserva.setBounds(280, 600, 188, 33);
						btnRealizarReserva.setForeground(new Color(255, 255, 255));
						btnRealizarReserva.setBackground(new Color(0, 0, 128));
						btnRealizarReserva.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
						btnRealizarReserva.setVisible(true);
						contentPaneTela_1.add(btnRealizarReserva);

						txtCpf.setEditable(true);
					}
				});
				salvar.setBounds(280, 600, 188, 33);
				salvar.setForeground(new Color(255, 255, 255));
				salvar.setBackground(new Color(0, 0, 128));
				salvar.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
				contentPaneTela_1.add(salvar);

			}

		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		btnNewButton.setBounds(581, 683, 201, 53);
		contentPaneTela_1.add(btnNewButton);

		JButton btnCancelar = new JButton("Excluir");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int position = table.getSelectedRow();
				String erros = "";

				if (position == -1) {
					JOptionPane.showMessageDialog(null, "Nenhum reserva selecionada");
					return;
				}

				reservaSelecionado = listaReserva.get(position);

				var reservaDao = new ReservaDao();
				reservaDao.getIntancia();
				int n = JOptionPane.showConfirmDialog(null,
						"Tem certeza que quer excluir a reserva de   " + reservaSelecionado.getHospede().getNome(), "?",
						JOptionPane.YES_NO_OPTION);

				if (n == JOptionPane.YES_OPTION) {
					boolean retorno = reservaDao.deletarReserva(reservaSelecionado);
					if (retorno == true) {
						JOptionPane.showMessageDialog(null, "reserva deletada ");
						atualizarTabela();
						limparDados();
					} else {
						JOptionPane.showMessageDialog(null, "Erro, reserva não deletada");
						atualizarTabela();
						limparDados();
					}

				}

			}
		});
		btnCancelar.setForeground(new Color(0, 0, 255));
		btnCancelar.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		btnCancelar.setBounds(581, 773, 201, 53);
		contentPaneTela_1.add(btnCancelar);

		txtQuantidadeDias = new JTextField();
		/**********/
		MaskFormatter mascaraQuantidadeDias = null;
		try {
			mascaraQuantidadeDias = new MaskFormatter("##");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		lblNewLabel.setBounds(189, 256, 46, 22);
		contentPaneTela_1.add(lblNewLabel);

		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(245, 253, 310, 26);
		contentPaneTela_1.add(txtCpf);

		JButton btnNewButton_1 = new JButton("Buscar Hospede");
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String erros = "";

				String cpf = txtCpf.getText().replace("-", "").replace(".", "");

				if (cpf == null || cpf.trim() == "" || cpf.isEmpty()) {
					erros += "cpf\n";
					JOptionPane.showMessageDialog(null, "Informe o cpf");
					return;
				}
				Hospede hospede = new Hospede();
				hospede.setCpf(Long.valueOf(cpf));
				HospedeDao hospedeDao = new HospedeDao();
				hospedeDao.getIntancia();
				hospede = hospedeDao.consultarHospede();
				if (hospede != null) {
					txtNomecomple_1.setText(hospede.getNome());
					txtCpf.setEditable(false);
				} else {
					JOptionPane.showMessageDialog(null, "Hospede não existente");
				}

			}
		});
		btnNewButton_1.setBounds(622, 253, 179, 30);
		contentPaneTela_1.add(btnNewButton_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1084, 249, 661, 614);
		contentPaneTela_1.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Nome", "valor total ", "quantidade pessoas" }));
		scrollPane.setViewportView(table);

		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.setBackground(new Color(0, 0, 255));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setLocationRelativeTo(null);
				telaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(318, 774, 201, 51);
		contentPaneTela_1.add(btnNewButton_2);

		JLabel lblNewLabel_3 = new JLabel("Serviço de Quarto:");
		lblNewLabel_3.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		lblNewLabel_3.setBounds(189, 401, 274, 31);
		contentPaneTela_1.add(lblNewLabel_3);

		rdbtnSim = new JRadioButton("Sim ");
		rdbtnSim.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		rdbtnSim.setBackground(new Color(155, 214, 249));
		buttonGroup.add(rdbtnSim);
		rdbtnSim.setBounds(189, 439, 63, 40);
		contentPaneTela_1.add(rdbtnSim);

		rdbtnNao = new JRadioButton("Não");
		rdbtnNao.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		rdbtnNao.setBackground(new Color(155, 214, 249));
		buttonGroup.add(rdbtnNao);
		rdbtnNao.setBounds(299, 439, 63, 40);
		contentPaneTela_1.add(rdbtnNao);

		JLabel lblNewLabel_5_1 = new JLabel("Forma de Pagamento:");
		lblNewLabel_5_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5_1.setBounds(189, 570, 233, 27);
		contentPaneTela_1.add(lblNewLabel_5_1);

		JLabel lblNewLabel_4 = new JLabel("Valor da Diária:");
		lblNewLabel_4.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		lblNewLabel_4.setBounds(499, 401, 161, 30);
		contentPaneTela_1.add(lblNewLabel_4);

		txtQuantidadeHospedes = new JTextField();
		txtQuantidadeHospedes.setBounds(189, 534, 217, 25);
		contentPaneTela_1.add(txtQuantidadeHospedes);
		txtQuantidadeHospedes.setColumns(10);

		txtFormaPagamento = new JTextField();
		txtFormaPagamento.setBounds(189, 606, 201, 26);
		contentPaneTela_1.add(txtFormaPagamento);
		txtFormaPagamento.setColumns(10);

		txtquantDias = new JTextField();
		txtquantDias.setBounds(387, 361, 98, 26);
		contentPaneTela_1.add(txtquantDias);
		txtquantDias.setColumns(10);

		txtValorDiaria = new JTextField();
		txtValorDiaria.setBounds(530, 446, 98, 26);
		contentPaneTela_1.add(txtValorDiaria);
		txtValorDiaria.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(0, 0, 1924, 53);
		contentPaneTela_1.add(panel);
		
		JLabel lblNewLabel_7 = new JLabel("Cadastrar Reserva");
		lblNewLabel_7.setForeground(new Color(0, 0, 128));
		lblNewLabel_7.setFont(new Font("Sitka Subheading", Font.BOLD, 42));
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(155, 214, 249));
		panel_1.setBounds(1084, 216, 661, 32);
		contentPaneTela_1.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastros");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(TelaReserva.class.getResource("/Imagens/background.png")));
		lblNewLabel_8.setBounds(0, 0, 1924, 1061);
		contentPaneTela_1.add(lblNewLabel_8);
		atualizarTabela();

	}

	public void limparDados() {
		txtCpf.setText("");
		txtFormaPagamento.setText("");
		txtQuantidadeHospedes.setText("");
		txtValorDiaria.setText("");
		txtNomecomple_1.setText("");
		txtquantDias.setText("");

	}

	private void atualizarTabela() {
		var reservaDao = new ReservaDao();
		DefaultTableModel tabela = new DefaultTableModel(new Object[][] {},
				new String[] { "Nome", "valor total ", "quantidade pessoas" });

		if (reservaDao.listaReserva() != null) {
			listaReserva = reservaDao.listaReserva();
			for (int i = 0; i < listaReserva.size(); i++) {
				Reserva reserva = listaReserva.get(i);
				tabela.addRow(new Object[] { reserva.getHospede().getNome(),
						reserva.getDiaria() * reserva.getQuantidadeDedias() * reserva.getQuantidadeDedias(),
						reserva.getQuantidadeHospede() });

			}
			table.setModel(tabela);
		}

	}

	private void preencherDados(Reserva reservaSelecionado) {

		txtCpf.setText(String.valueOf(reservaSelecionado.getHospede().getCpf()));
		txtFormaPagamento.setText(reservaSelecionado.getFormaPagamento());
		txtQuantidadeHospedes.setText(String.valueOf(reservaSelecionado.getQuantidadeHospede()));
		txtValorDiaria.setText(String.valueOf(reservaSelecionado.getDiaria()));
		txtNomecomple_1.setText(reservaSelecionado.getHospede().getNome());
		txtquantDias.setText(String.valueOf(reservaSelecionado.getQuantidadeDedias()));

	}
}
