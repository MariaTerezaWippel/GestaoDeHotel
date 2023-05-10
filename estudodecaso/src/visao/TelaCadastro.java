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
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDataNascimento;
	private JTextField txtCep;
	private JTable table;
	private DefaultTableModel dataModel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		lblNewLabel.setBounds(171, 259, 75, 21);

		contentPane.add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setForeground(new Color(240, 248, 255));
		txtNome.setBounds(171, 291, 405, 21);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(171, 328, 66, 21);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(171, 391, 66, 21);

		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Telefone:");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(171, 452, 95, 21);

		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento:");
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(171, 515, 186, 14);
		contentPane.add(lblNewLabel_4);

		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(171, 540, 98, 20);
		contentPane.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("CEP:");
		lblNewLabel_6.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_6.setBounds(171, 571, 46, 14);

		contentPane.add(lblNewLabel_6);

		txtCep = new JTextField();
		txtCep.setBounds(171, 596, 177, 20);
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
		btnCadastrar.setBounds(505, 781, 157, 42);
		contentPane.add(btnCadastrar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(672, 274, 518, 354);
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
		
		textField = new JTextField();
		textField.setBounds(171, 360, 184, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 421, 403, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(171, 484, 184, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Design sem nome.png"));
		lblNewLabel_5.setBounds(317, 90, 323, 83);
		contentPane.add(lblNewLabel_5);

	}
}
