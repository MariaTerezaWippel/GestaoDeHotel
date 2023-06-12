package visao;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import Controle.EnderecoDao;
import Controle.FuncionarioDao;
import Controle.HospedeDao;
import modelo.Endereco;
import modelo.Funcionario;
import modelo.Hospede;

public class TelaCadastroHospede extends JFrame {

	private JPanel contentPane;
	private JTextField txtDataNasci;
	private JTextField txtTelefoneHospede;
	private JTextField txtEndereçoHospede;
	private JTextField txtNomeHospede;
	private JTextField txtCpfHospede;
	private JTextField txtEmailHospede;
	private JTable table;
	private ArrayList<Hospede> listHospede;
	private HospedeDao hospedeDao;
	private Hospede hospede;
	private EnderecoDao enderecoDao;
	private Hospede hospedeSelecionado;
	private JButton salvar;

	public TelaCadastroHospede() {
		setTitle("Tela Cadastro Hóspede");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 2000, 1400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cadastrar Hóspede");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(310, 26, 268, 39);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Data Nascimento:");
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		lblNewLabel_1.setBounds(76, 232, 158, 23);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Telefone: ");
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		lblNewLabel_2.setBounds(147, 271, 103, 23);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Endereço:");
		lblNewLabel_3.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		lblNewLabel_3.setBounds(142, 305, 92, 23);
		contentPane.add(lblNewLabel_3);

		txtDataNasci = new JTextField();
		MaskFormatter mascaraDataNasci = null;
		try {
			mascaraDataNasci = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtDataNasci = new JFormattedTextField(mascaraDataNasci);
		/**********/

		txtDataNasci.setBounds(250, 232, 116, 20);
		contentPane.add(txtDataNasci);
		txtDataNasci.setColumns(10);

		txtTelefoneHospede = new JTextField();
		/**********/
		MaskFormatter mascaraTelefoneHospede = null;
		try {
			mascaraTelefoneHospede = new MaskFormatter("(##) ####-####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtTelefoneHospede = new JFormattedTextField(mascaraTelefoneHospede);
		/**********/

		txtTelefoneHospede.setBounds(249, 271, 135, 20);
		contentPane.add(txtTelefoneHospede);
		txtTelefoneHospede.setColumns(10);

		txtEndereçoHospede = new JTextField();
		txtEndereçoHospede.setBounds(247, 305, 152, 20);
		contentPane.add(txtEndereçoHospede);
		txtEndereçoHospede.setColumns(10);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = txtNomeHospede.getText();
				String cpf = txtCpfHospede.getText().replace("-", "").replace(".", "");
				String email = txtEmailHospede.getText();
				String dataNascimento = txtDataNasci.getText();
				String telefone = txtTelefoneHospede.getText().replace("(", "").replace(")", "").replace("-", "")
						.replace(" ", "");
				String enderecoCep = txtEndereçoHospede.getText();

				String erros = "";

				hospede = new Hospede();
				Endereco endereco = new Endereco();

				if (nome == null || nome.trim() == "" || nome.isEmpty()) {
					erros += "nome\n";
				} else {
					hospede.setNome(nome);
				}
				if (cpf == null || cpf.trim() == "" || cpf.isEmpty()) {
					erros += "cpf\n";
				} else {
					Long cpfLong = Long.valueOf(cpf);
					hospede.setCpf(cpfLong);
				}
				if (email == null || email.trim() == "" || email.isEmpty()) {
					erros += "email\n";
				} else {
					hospede.setEmail(email);
				}
				if (dataNascimento == null || dataNascimento.trim() == "" || dataNascimento.isEmpty()) {
					erros += "cargo\n";
				} else {
					hospede.setDataNascimento(dataNascimento);
				}
				if (telefone == null || telefone.trim() == "" || telefone.isEmpty()) {
					erros += "cargo\n";
				} else {
					Long telefoneLong = Long.valueOf(telefone);
					hospede.setTelefone(telefoneLong);
				}
				if (enderecoCep == null || enderecoCep.trim() == "" || enderecoCep.isEmpty()) {
					erros += "cargo\n";
				} else {
					Long enderecoInt = Long.valueOf(enderecoCep);

					endereco.setCep(enderecoInt);

					hospede.setEndereco(endereco);
				}
				if (erros.trim() != "") {
					JOptionPane.showMessageDialog(null, "Dados inválidos\n" + erros);
					return;
				}

				enderecoDao = new EnderecoDao();
				enderecoDao.getIntancia();
				boolean resutaldo = enderecoDao.verificarEndereco(endereco);
				if (resutaldo != true) {
					int n = JOptionPane.showConfirmDialog(null,
							"Endereço não cadastrado, deseja cadastrar?  " + "Atencao", "", JOptionPane.YES_NO_OPTION);

					if (n == JOptionPane.YES_OPTION) {
						CadastrarEndereco cadastrarEndereco = new CadastrarEndereco();
						cadastrarEndereco.setLocationRelativeTo(null);
						cadastrarEndereco.setVisible(true);
						dispose();
					}
					return;
				}
				hospedeDao = HospedeDao.getIntancia();
				boolean resultado = hospedeDao.inserirHospede(hospede);
				if (resultado == true) {
					JOptionPane.showMessageDialog(null, "Hospede cadastrado");
					atualizarTabela();
					limparDados();
				} else {
					JOptionPane.showMessageDialog(null, "Hospede não cadastrado");
				}

			}
		});

		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 19));
		btnNewButton.setBounds(482, 100, 165, 33);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				btnNewButton.setVisible(false);
				contentPane.remove(btnNewButton);

				txtCpfHospede.setEditable(false);
				int position = table.getSelectedRow();
				String erros = "";

				if (position == -1) {
					JOptionPane.showMessageDialog(null, "Nenhum hóspede selecionado");
					return;
				}

				hospedeSelecionado = listHospede.get(position);
				preencherDados(hospedeSelecionado);

				salvar = new JButton("salva");
				salvar.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						String nome = txtNomeHospede.getText();
						String cpf = txtCpfHospede.getText().replace("-", "").replace(".", "");
						String email = txtEmailHospede.getText();
						String dataNascimento = txtDataNasci.getText();
						String telefone = txtTelefoneHospede.getText().replace("(", "").replace(")", "")
								.replace("-", "").replace(" ", "");
						String enderecoCep = txtEndereçoHospede.getText();

						String erros = "";

						hospede = new Hospede();
						Endereco endereco = new Endereco();

						if (nome == null || nome.trim() == "" || nome.isEmpty()) {
							erros += "nome\n";
						} else {
							hospede.setNome(nome);
						}
						if (cpf == null || cpf.trim() == "" || cpf.isEmpty()) {
							erros += "cpf\n";
						} else {
							Long cpfLong = Long.valueOf(cpf);
							hospede.setCpf(cpfLong);
						}
						if (email == null || email.trim() == "" || email.isEmpty()) {
							erros += "email\n";
						} else {
							hospede.setEmail(email);
						}
						if (dataNascimento == null || dataNascimento.trim() == "" || dataNascimento.isEmpty()) {
							erros += "cargo\n";
						} else {
							hospede.setDataNascimento(dataNascimento);
						}
						if (telefone == null || telefone.trim() == "" || telefone.isEmpty()) {
							erros += "cargo\n";
						} else {
							Long telefoneLong = Long.valueOf(telefone);
							hospede.setTelefone(telefoneLong);
						}
						if (enderecoCep == null || enderecoCep.trim() == "" || enderecoCep.isEmpty()) {
							erros += "cargo\n";
						} else {
							Long enderecoInt = Long.valueOf(enderecoCep);

							endereco.setCep(enderecoInt);

							hospede.setEndereco(endereco);
						}
						if (erros.trim() != "") {
							JOptionPane.showMessageDialog(null, "Dados inválidos\n" + erros);
							return;

						}
						hospedeDao = new HospedeDao();
						hospedeDao.getIntancia();
						boolean retorno = hospedeDao.alterarHospede(hospede);
						if (retorno == true) {
							JOptionPane.showMessageDialog(null, "Hóspede Alterado ");
							atualizarTabela();
							limparDados();
						} else {
							JOptionPane.showMessageDialog(null, "Erro, hóspede não alterado");
							atualizarTabela();
							limparDados();
						}
						salvar.setVisible(false);
						contentPane.remove(salvar);

						btnNewButton_1.setForeground(new Color(255, 255, 255));
						btnNewButton_1.setBackground(new Color(0, 0, 255));
						btnNewButton_1.setFont(new Font("Sitka Subheading", Font.BOLD, 17));
						btnNewButton_1.setBounds(482, 145, 165, 33);
						contentPane.add(btnNewButton);
						btnNewButton.setVisible(true);

						txtCpfHospede.setEditable(true);
					}
				});
				salvar.setBackground(new Color(0, 0, 128));
				salvar.setForeground(new Color(255, 255, 255));
				salvar.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 19));
				salvar.setBounds(482, 100, 165, 33);
				contentPane.add(salvar);

			}

		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 255));
		btnNewButton_1.setFont(new Font("Sitka Subheading", Font.BOLD, 17));
		btnNewButton_1.setBounds(482, 145, 165, 33);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int position = table.getSelectedRow();
				String erros = "";

				if (position == -1) {
					JOptionPane.showMessageDialog(null, "Nenhum hóspede selecionado");
					return;
				}

				hospedeSelecionado = listHospede.get(position);

				hospedeDao = new HospedeDao();
				hospedeDao.getIntancia();
				int n = JOptionPane.showConfirmDialog(null,
						"Tem certeza que quer excluir?  " + hospedeSelecionado.getNome(), "",
						JOptionPane.YES_NO_OPTION);

				if (n == JOptionPane.YES_OPTION) {
					boolean retorno = hospedeDao.deletarHospede(hospedeSelecionado);
					if (retorno == true) {
						JOptionPane.showMessageDialog(null, "Funcionário deletado ");
						atualizarTabela();
						limparDados();
					} else {
						JOptionPane.showMessageDialog(null, "Erro, funcionário não deletado");
						atualizarTabela();
						limparDados();
					}

				}

			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.setFont(new Font("Sitka Subheading", Font.BOLD, 17));
		btnNewButton_2.setBounds(482, 189, 165, 33);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_4 = new JLabel("Nome:");
		lblNewLabel_4.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		lblNewLabel_4.setBounds(164, 105, 59, 23);
		contentPane.add(lblNewLabel_4);

		txtNomeHospede = new JTextField();
		txtNomeHospede.setBounds(249, 105, 135, 20);
		contentPane.add(txtNomeHospede);
		txtNomeHospede.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Cpf:");
		lblNewLabel_5.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		lblNewLabel_5.setBounds(188, 149, 62, 23);
		contentPane.add(lblNewLabel_5);

		MaskFormatter mascaraCpfHospede = null;
		try {
			mascaraCpfHospede = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtCpfHospede = new JFormattedTextField(mascaraCpfHospede);
		/**********/

		txtCpfHospede.setBounds(250, 149, 86, 20);
		contentPane.add(txtCpfHospede);
		txtCpfHospede.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Email:");
		lblNewLabel_6.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		lblNewLabel_6.setBounds(164, 184, 59, 26);
		contentPane.add(lblNewLabel_6);

		txtEmailHospede = new JTextField();
		txtEmailHospede.setBounds(250, 186, 86, 20);
		contentPane.add(txtEmailHospede);
		txtEmailHospede.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(723, 107, 648, 689);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "telefone", "email", "cpf", "Nome" }));
		scrollPane.setViewportView(table);

		JButton btnNewButton_3 = new JButton("Voltar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setLocationRelativeTo(null);
				telaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(435, 783, 183, 53);
		contentPane.add(btnNewButton_3);

		atualizarTabela();
	}

	public void limparDados() {
		txtNomeHospede.setText("");
		txtCpfHospede.setText("");
		txtEmailHospede.setText("");
		txtDataNasci.setText("");
		txtTelefoneHospede.setText("");
		txtEndereçoHospede.setText("");

	}

	private void atualizarTabela() {
		hospedeDao = new HospedeDao();
		DefaultTableModel tabela = new DefaultTableModel(new Object[][] {},
				new String[] { "telefone", "email", "cpf", "Nome" });

		if (hospedeDao.listaHospede() != null) {
			listHospede = hospedeDao.listaHospede();
			for (int i = 0; i < listHospede.size(); i++) {
				Hospede hospede = listHospede.get(i);
				tabela.addRow(new Object[] { hospede.getTelefone(), hospede.getEmail(), hospede.getCpf(),
						hospede.getNome() });

			}
			table.setModel(tabela);
		}

	}

	private void preencherDados(Hospede hospedeSelecionado) {

		txtNomeHospede.setText(hospedeSelecionado.getNome());
		txtCpfHospede.setText(String.valueOf(hospedeSelecionado.getCpf()));
		txtEmailHospede.setText(hospedeSelecionado.getEmail());
		txtDataNasci.setText(hospedeSelecionado.getDataNascimento());
		txtTelefoneHospede.setText(String.valueOf(hospedeSelecionado.getTelefone()));
		txtEndereçoHospede.setText(String.valueOf(hospedeSelecionado.getEndereco().getCep()));
	}
}
