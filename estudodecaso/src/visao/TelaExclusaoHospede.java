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
import javax.swing.ImageIcon;

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
					TelaExclusaoHospede frame = new TelaExclusaoHospede();
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
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel.setBounds(424, 71, 446, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(300, 137, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(300, 207, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(300, 277, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(300, 347, 90, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Data de Nascimento:");
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(300, 417, 185, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Quantidade de Hóspedes:");
		lblNewLabel_6.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(300, 487, 230, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("CEP:");
		lblNewLabel_7.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(300, 557, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Numero da Reserva:");
		lblNewLabel_8.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(300, 627, 185, 14);
		contentPane.add(lblNewLabel_8);
		
		txtNome = new JTextField();
		txtNome.setBounds(297, 162, 216, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(300, 232, 151, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(300, 302, 191, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(300, 372, 127, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(300, 442, 86, 20);
		contentPane.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		txtQuantidadeHospedes = new JTextField();
		txtQuantidadeHospedes.setBounds(300, 512, 46, 20);
		contentPane.add(txtQuantidadeHospedes);
		txtQuantidadeHospedes.setColumns(10);
		
		txtCEP = new JTextField();
		txtCEP.setBounds(300, 582, 136, 20);
		contentPane.add(txtCEP);
		txtCEP.setColumns(10);
		
		txtNumeroReserva = new JTextField();
		txtNumeroReserva.setBounds(300, 652, 37, 20);
		contentPane.add(txtNumeroReserva);
		txtNumeroReserva.setColumns(10);
		
		JButton btnNewButton = new JButton("Excluir Hóspede");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(486, 742, 314, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Design sem nome (1).png"));
		lblNewLabel_9.setBounds(880, 15, 418, 150);
		contentPane.add(lblNewLabel_9);
	}

}
