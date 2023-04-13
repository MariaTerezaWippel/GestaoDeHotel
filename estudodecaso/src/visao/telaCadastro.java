package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Hospedagem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class telaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtDataNascimento;
	private JTextField txtQuanHospede;
	private JTextField txtCep;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCadastro frame = new telaCadastro();
					frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telaCadastro() {
		setTitle("Tela Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(92, 124, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(164, 121, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(92, 161, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(164, 158, 86, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(92, 196, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(164, 193, 86, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefone");
		lblNewLabel_3.setBounds(92, 237, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(164, 234, 86, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento");
		lblNewLabel_4.setBounds(51, 276, 113, 14);
		contentPane.add(lblNewLabel_4);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(174, 273, 86, 20);
		contentPane.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade de Hóspedes");
		lblNewLabel_5.setBounds(10, 317, 128, 14);
		contentPane.add(lblNewLabel_5);
		
		txtQuanHospede = new JTextField();
		txtQuanHospede.setBounds(164, 314, 86, 20);
		contentPane.add(txtQuanHospede);
		txtQuanHospede.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("CEP");
		lblNewLabel_6.setBounds(92, 361, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtCep = new JTextField();
		txtCep.setBounds(164, 358, 86, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				String telefone = txtTelefone.getText();
				String email = txtEmail.getText();
				String cep = txtCep.getText();
				String quantidadeDeHospedes = txtQuanHospede.getText();
				String dataNascimento = txtDataNascimento.getText();
				
				Hospedagem hospedagem = new Hospedagem();
				
				ArrayList<Hospedagem> hospedagemLista = new ArrayList();
				hospedagem.setNome(nome);
				Long cpfLong = Long.valueOf(cpf);
				hospedagem.setCpf(cpfLong);
				hospedagem.setDataNascimento(dataNascimento);
				hospedagem.setEmail(email);
				Integer numeroP= Integer.valueOf(quantidadeDeHospedes);
				hospedagem.setNumeroPessoas(numeroP);
				Long cepLong = Long.valueOf(cep); 
				hospedagem.setCep(cepLong);
				Long telefoneLong = Long.valueOf(telefone);
				hospedagem.setTelefone(telefoneLong);
				
				hospedagemLista.add(hospedagem);
				
				

						
			}
		});
		btnCadastrar.setBounds(446, 440, 113, 23);
		contentPane.add(btnCadastrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(422, 103, 528, 287);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Email", "Cpf", "Nome"
			}
		));
		scrollPane.setViewportView(table);
	}
}
