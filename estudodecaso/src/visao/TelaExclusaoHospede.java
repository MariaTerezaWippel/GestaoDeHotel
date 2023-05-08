package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaExclusaoHospede extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtDataNascimento;
	private JTextField txtQuantidadeHospedes;
	private JTextField txtCEP;
	private JTextField txtNumeroReserva;

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
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaExclusaoHospede() {
		setTitle("Tela Exclusão de Hóspede");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tela Exclusão de Hóspede");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 26));
		lblNewLabel.setBounds(630, 72, 384, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(467, 136, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(467, 213, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(467, 296, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(467, 384, 90, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Data de Nascimento:");
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(467, 465, 185, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Quantidade de Hóspedes:");
		lblNewLabel_6.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(467, 550, 230, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("CEP:");
		lblNewLabel_7.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(467, 626, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Numero da Reserva:");
		lblNewLabel_8.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(467, 703, 185, 14);
		contentPane.add(lblNewLabel_8);
		
		txtNome = new JTextField();
		txtNome.setBounds(467, 161, 216, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(466, 238, 151, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(467, 328, 191, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(467, 409, 127, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(467, 490, 86, 20);
		contentPane.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		txtQuantidadeHospedes = new JTextField();
		txtQuantidadeHospedes.setBounds(467, 575, 46, 20);
		contentPane.add(txtQuantidadeHospedes);
		txtQuantidadeHospedes.setColumns(10);
		
		txtCEP = new JTextField();
		txtCEP.setBounds(467, 651, 136, 20);
		contentPane.add(txtCEP);
		txtCEP.setColumns(10);
		
		txtNumeroReserva = new JTextField();
		txtNumeroReserva.setBounds(467, 728, 37, 20);
		contentPane.add(txtNumeroReserva);
		txtNumeroReserva.setColumns(10);
		
		JButton btnNewButton = new JButton("Excluir Hóspede");
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 30));
		btnNewButton.setBounds(681, 844, 308, 35);
		contentPane.add(btnNewButton);
	}

}
