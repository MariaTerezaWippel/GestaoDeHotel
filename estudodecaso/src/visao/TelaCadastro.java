package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.table.DefaultTableModel;

import modelo.Hospede;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtDataNascimento;
	private JTextField txtCep;
	private JTable table;
	private DefaultTableModel dataModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setTitle("Tela Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setForeground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(169, 121, 75, 21);

		contentPane.add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setForeground(new Color(240, 248, 255));
		txtNome.setBounds(169, 149, 241, 21);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(169, 178, 66, 21);
		contentPane.add(lblNewLabel_1);

		txtCpf = new JTextField();
		txtCpf.setBounds(169, 204, 186, 21);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(169, 236, 66, 21);

		contentPane.add(lblNewLabel_2);

		txtEmail = new JTextField();
		txtEmail.setBounds(169, 268, 241, 21);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Telefone:");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(169, 298, 95, 21);

		contentPane.add(lblNewLabel_3);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(169, 327, 148, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento:");
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setBounds(169, 358, 169, 14);
		contentPane.add(lblNewLabel_4);

		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(169, 383, 98, 20);
		contentPane.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("CEP:");
		lblNewLabel_6.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_6.setBounds(169, 429, 46, 14);

		contentPane.add(lblNewLabel_6);

		txtCep = new JTextField();
		txtCep.setBounds(169, 454, 177, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);

		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setBackground(new Color(0, 0, 0));
		btnCadastrar.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 16));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				String telefone = txtTelefone.getText();
				String email = txtEmail.getText();
				String cep = txtCep.getText();
				String quantidadeDeHospedes = txtQuanHospede.getText();
				String dataNascimento = txtDataNascimento.getText();

				Hospede hospedagem = new Hospede();

				ArrayList<Hospede> hospedagemLista = new ArrayList();

				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nome errado");
				} else {
					hospedagem.setNome(nome);
				}
				if (cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "cpf errado");
				} else {
					Long cpfLong = Long.valueOf(cpf);
					hospedagem.setCpf(cpfLong);
				}
				if (email.isEmpty()) {
					JOptionPane.showMessageDialog(null, "email errado");
				} else {
					hospedagem.setEmail(email);
				}

				hospedagem.setDataNascimento(dataNascimento);

				Integer numeroP = Integer.valueOf(quantidadeDeHospedes);
				hospedagem.setNumeroPessoas(numeroP);
				Long cepLong = Long.valueOf(cep);
				hospedagem.setCep(cepLong);
				Long telefoneLong = Long.valueOf(telefone);
				hospedagem.setTelefone(telefoneLong);

				hospedagemLista.add(hospedagem);
				System.out.println(hospedagem);

				for (Hospede h : hospedagemLista) {
					dataModel.addRow(new Object[] { h.getNome(), h.getCpf(), h.getEmail() });
				}

			}
		});
		btnCadastrar.setBounds(515, 658, 157, 42);
		contentPane.add(btnCadastrar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(551, 120, 518, 354);
		contentPane.add(scrollPane);

		table = new JTable();
		dataModel = new DefaultTableModel(new Object[][] {}, new String[] { "Email", "Cpf", "Nome" });
		table.setModel(dataModel);
		scrollPane.setViewportView(table);

		JLabel lblNewLabel_7 = new JLabel(" Cadastro do Hóspede");
		lblNewLabel_7.setForeground(new Color(0, 0, 255));
		lblNewLabel_7.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 42));
		lblNewLabel_7.setBounds(355, 25, 463, 70);
		contentPane.add(lblNewLabel_7);

	}
}
