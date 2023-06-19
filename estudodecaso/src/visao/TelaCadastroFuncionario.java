package visao;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import Controle.FuncionarioDao;
import modelo.Funcionario;
import modelo.Hospede;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

import java.awt.Button;

public class TelaCadastroFuncionario extends JFrame {

	private JPanel contentPaneTela;
	private JTextField txtNome;
	private JTable table;
	private DefaultTableModel dataModel;
	private JTextField txtCpf;
	private JTextField txtEmailFuncionario;
	private FuncionarioDao funcionarioDao;
	private ArrayList<Funcionario> listFuncionario;
	private Funcionario funcionario;
	private Funcionario funcionarioSelecionado;

	/**
	 * Launch the application.
	 */
	ArrayList<Hospede> hospede = new ArrayList<>();
	private JTextField txtCargo;
	private JTextField txtFraseSecreta;
	private JButton btnCadastrarFuncio;

	public TelaCadastroFuncionario() {
		setTitle("Tela Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2000, 1500);
		contentPaneTela = new JPanel();
		contentPaneTela.setBackground(new Color(100, 149, 237));
		contentPaneTela.setForeground(new Color(0, 0, 0));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneTela);
		contentPaneTela.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(495, 253, 75, 21);

		contentPaneTela.add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setForeground(new Color(0, 0, 0));
		txtNome.setBounds(495, 290, 304, 21);
		contentPaneTela.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(495, 322, 66, 21);
		contentPaneTela.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBounds(495, 385, 114, 21);

		contentPaneTela.add(lblNewLabel_2);

		/**********/
		MaskFormatter mascaraDataNasc = null;
		try {
			mascaraDataNasc = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		/**********/
		MaskFormatter mascaraCep = null;
		try {
			mascaraCep = new MaskFormatter("#####-###");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(928, 252, 518, 354);
		contentPaneTela.add(scrollPane);

		table = new JTable();
		dataModel = new DefaultTableModel(new Object[][] {}, new String[] { "Email", "Cpf", "Nome" });
		table.setModel(dataModel);
		scrollPane.setViewportView(table);

		/**********/
		MaskFormatter mascaraCpf = null;
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtCpf = new JFormattedTextField(mascaraCpf);
		/**********/

		txtCpf.setBounds(495, 354, 184, 20);
		contentPaneTela.add(txtCpf);
		txtCpf.setColumns(10);

		txtEmailFuncionario = new JTextField();
		txtEmailFuncionario.setBounds(495, 415, 304, 20);
		contentPaneTela.add(txtEmailFuncionario);
		txtEmailFuncionario.setColumns(10);

		/**********/
		MaskFormatter mascaraTel = null;
		try {
			mascaraTel = new MaskFormatter("(##) ####-####");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		btnCadastrarFuncio = new JButton("Cadastrar");
		btnCadastrarFuncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String erros = "";

				String nome = txtNome.getText();
				String cpf = txtCpf.getText().replace(".", "").replace("-", "");
				String email = txtEmailFuncionario.getText();
				String cargo = txtCargo.getText();
				String fraseSecreta = txtFraseSecreta.getText();

				Funcionario funcionario = new Funcionario();

				if (nome == null || nome.trim() == "" || nome.isEmpty()) {
					erros += "nome\n";
				} else {
					funcionario.setNome(nome);
				}
				if (cpf == null || cpf.trim() == "" || cpf.isEmpty()) {
					erros += "cpf\n";
				} else {
					Long cpfLong = Long.valueOf(cpf);
					funcionario.setCpf(cpfLong);
				}
				if (email == null || email.trim() == "" || email.isEmpty()) {
					erros += "email\n";
				} else {
					funcionario.setEmail(email);
				}
				if (cargo == null || cargo.trim() == "" || cargo.isEmpty()) {
					erros += "cargo\n";
				} else {
					funcionario.setCargo(cargo);
				}
				if (fraseSecreta == null || fraseSecreta.trim() == "" || fraseSecreta.isEmpty()) {
					erros += "cargo\n";
				} else {
					funcionario.setFraseSecreta(fraseSecreta);
				}
				if (erros.trim() != "") {
					JOptionPane.showMessageDialog(null, "Dados inválidos\n" + erros);
					return;
				}
				funcionarioDao = new FuncionarioDao();
				funcionarioDao.getIntancia();
				boolean retorno = funcionarioDao.inserirFuncionario(funcionario);
				if (retorno == true) {
					JOptionPane.showMessageDialog(null, "Funcionario Cadastrado ");
					atualizarTabela();
					limparDados();
				} else {
					JOptionPane.showMessageDialog(null, "Erro, funcionario não cadastrado");
					limparDados();
				}

			}
		});
		btnCadastrarFuncio.setForeground(new Color(255, 255, 255));
		btnCadastrarFuncio.setBackground(new Color(0, 0, 128));
		btnCadastrarFuncio.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnCadastrarFuncio.setBounds(731, 694, 184, 53);
		contentPaneTela.add(btnCadastrarFuncio);

		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				btnCadastrarFuncio.setVisible(false);
				contentPaneTela.remove(btnCadastrarFuncio);

				txtCpf.setEditable(false);
				int position = table.getSelectedRow();
				String erros = "";

				if (position == -1) {
					JOptionPane.showMessageDialog(null, "Nenhum paciente selecionado");
					return;
				}

				funcionarioSelecionado = listFuncionario.get(position);
				preencherDados(funcionarioSelecionado);

				JButton salvar = new JButton("salva");
				salvar.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						String erros = "";

						String nome = txtNome.getText();
						String cpf = txtCpf.getText().replace(".", "").replace("-", "");
						String email = txtEmailFuncionario.getText();
						String cargo = txtCargo.getText();
						String fraseSecreta = txtFraseSecreta.getText();

						Funcionario funcionario = new Funcionario();
						funcionario.setCpf(funcionarioSelecionado.getCpf());

						if (nome == null || nome.trim() == "" || nome.isEmpty()) {
							erros += "nome\n";
						} else {
							funcionario.setNome(nome);
						}
						if (email == null || email.trim() == "" || email.isEmpty()) {
							erros += "email\n";
						} else {
							funcionario.setEmail(email);
						}
						if (cargo == null || cargo.trim() == "" || cargo.isEmpty()) {
							erros += "cargo\n";
						} else {
							funcionario.setCargo(cargo);
						}
						if (fraseSecreta == null || fraseSecreta.trim() == "" || fraseSecreta.isEmpty()) {
							erros += "cargo\n";
						} else {
							funcionario.setFraseSecreta(fraseSecreta);
						}
						if (erros.trim() != "") {
							JOptionPane.showMessageDialog(null, "Dados inválidos\n" + erros);
							return;
						}
						funcionarioDao = new FuncionarioDao();
						funcionarioDao.getIntancia();
						boolean retorno = funcionarioDao.alterarFuncionario(funcionario);
						if (retorno == true) {
							JOptionPane.showMessageDialog(null, "Funcionario Cadastrado ");
							atualizarTabela();
							limparDados();
						} else {
							JOptionPane.showMessageDialog(null, "Erro, funcionario não cadastrado");
							atualizarTabela();
							limparDados();
						}
						txtCpf.setEditable(true);
					}
				});
				salvar.setForeground(new Color(255, 255, 255));
				salvar.setBackground(new Color(0, 0, 128));
				salvar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
				salvar.setBounds(495, 715, 217, 38);
				contentPaneTela.add(salvar);

			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 255));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(949, 694, 184, 53);
		contentPaneTela.add(btnNewButton_1);
		atualizarTabela();

		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int position = table.getSelectedRow();
				String erros = "";

				if (position == -1) {
					JOptionPane.showMessageDialog(null, "Nenhum paciente selecionado");
					return;
				}

				funcionarioSelecionado = listFuncionario.get(position);
				preencherDados(funcionarioSelecionado);

				funcionarioDao = new FuncionarioDao();
				funcionarioDao.getIntancia();
				int n = JOptionPane.showConfirmDialog(null,
						"Tem certeza que quer excluir?  " + funcionarioSelecionado.getNome(), "",
						JOptionPane.YES_NO_OPTION);

				if (n == JOptionPane.YES_OPTION) {
					boolean retorno = funcionarioDao.deletarFuncionario(funcionarioSelecionado.getCpf());
					if (retorno == true) {
						JOptionPane.showMessageDialog(null, "Funcionario deletado ");
						atualizarTabela();
						limparDados();
					} else {
						JOptionPane.showMessageDialog(null, "Erro, funcionario não deletado");
						atualizarTabela();
						limparDados();
					}

				}

			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2.setBounds(949, 778, 184, 53);
		contentPaneTela.add(btnNewButton_2);

		JLabel lblNewLabel_10 = new JLabel("Cargo:");
		lblNewLabel_10.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_10.setBounds(495, 454, 75, 26);
		contentPaneTela.add(lblNewLabel_10);

		txtCargo = new JTextField();
		txtCargo.setBounds(495, 491, 184, 20);
		contentPaneTela.add(txtCargo);
		txtCargo.setColumns(10);

		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setLocationRelativeTo(null);
				telaPrincipal.setVisible(true);
				dispose();

			}
		});
		btnNewButton.setBounds(731, 778, 184, 53);
		contentPaneTela.add(btnNewButton);

		txtFraseSecreta = new JTextField();
		txtFraseSecreta.setBounds(495, 554, 184, 20);
		contentPaneTela.add(txtFraseSecreta);
		txtFraseSecreta.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Frase Secreta:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_3.setBounds(495, 522, 177, 26);
		contentPaneTela.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(0, 0, 1924, 53);
		contentPaneTela.add(panel);
		
		JLabel lblNewLabel_7_1 = new JLabel("Cadastrar Funcionario");
		lblNewLabel_7_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_7_1.setFont(new Font("Dialog", Font.BOLD, 42));
		panel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(TelaCadastroFuncionario.class.getResource("/Imagens/background.png")));
		lblNewLabel_4.setBounds(0, 0, 1924, 1061);
		contentPaneTela.add(lblNewLabel_4);

	}

	private void atualizarTabela() {
		funcionarioDao = new FuncionarioDao();
		DefaultTableModel tabela = new DefaultTableModel(new Object[][] {}, new String[] { "Email", "Cpf", "Nome" });

		listFuncionario = funcionarioDao.listaFuncionario();
		for (int i = 0; i < listFuncionario.size(); i++) {
			Funcionario funcionario = listFuncionario.get(i);
			tabela.addRow(new Object[] { funcionario.getEmail(), funcionario.getCpf(), funcionario.getNome() });

		}
		table.setModel(tabela);
	}

	public void limparDados() {
		txtNome.setText("");
		txtCpf.setText("");
		txtEmailFuncionario.setText("");
		txtCargo.setText("");
		txtFraseSecreta.setText("");

	}

	private void preencherDados(Funcionario funcionarioSelecionado) {
		txtNome.setText(funcionarioSelecionado.getNome());
		txtCpf.setText(String.valueOf(funcionarioSelecionado.getCpf()));
		txtEmailFuncionario.setText(funcionarioSelecionado.getEmail());
		txtCargo.setText(funcionarioSelecionado.getCargo());
		txtFraseSecreta.setText(funcionarioSelecionado.getFraseSecreta());
	}

}
