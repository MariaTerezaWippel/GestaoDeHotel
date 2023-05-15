package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Canvas;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Panel;

public class TelaLogin extends JFrame {

	private JPanel contentPaneTela;
	private JTextField txtEmail;
	private JTextField txtFraseSecreta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Tela Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1658, 991);
		contentPaneTela = new JPanel();
		contentPaneTela.setBackground(new Color(135, 206, 250));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneTela);
		contentPaneTela.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(197, 246, 100, -150);
		contentPaneTela.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Hotel");
		lblNewLabel_1.setBounds(735, 123, 211, 44);
		lblNewLabel_1.setForeground(new Color(0, 0, 128));

		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 48));

		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));

		contentPaneTela.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setBounds(645, 337, 100, 34);
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPaneTela.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Frase secreta :");
		lblNewLabel_3.setBounds(645, 414, 148, 34);
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPaneTela.add(lblNewLabel_3);
		

		txtEmail = new JTextField();
		txtEmail.setBounds(645, 382, 323, 20);
		txtEmail.setForeground(new Color(153, 204, 255));
		contentPaneTela.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtFraseSecreta = new JTextField();
		txtFraseSecreta.setBounds(645, 459, 323, 20);
		contentPaneTela.add(txtFraseSecreta);
		txtFraseSecreta.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(690, 517, 211, 44);
		


		btnLogin.setBackground(new Color(0, 0, 128));

		btnLogin.setBackground(new Color(25, 25, 112));

		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPaneTela.add(btnLogin);
		
		JLabel lblNewLabel_4 = new JLabel("Boulervard");
		lblNewLabel_4.setBounds(706, 160, 251, 46);
		lblNewLabel_4.setForeground(new Color(0, 0, 128));

		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 48));

		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));

		contentPaneTela.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cliente ainda não possui uma conta?");
		lblNewLabel_5.setBounds(645, 674, 315, 25);
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		contentPaneTela.add(lblNewLabel_5);
		

		JButton btnCadasrtar = new JButton("Cadastrar! ");
		btnCadasrtar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadasrtar.setBounds(690, 710, 211, 44);
		btnCadasrtar.setForeground(new Color(255, 255, 255));
		btnCadasrtar.setBackground(new Color(0, 0, 128));
		btnCadasrtar.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPaneTela.add(btnCadasrtar);

		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(541, 217, 394, 109);
		lblNewLabel_6.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/LogoHotel.png")));
		contentPaneTela.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Icon.png")));
		lblNewLabel_7.setBounds(-622, -95, 1293, 520);
		contentPaneTela.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Design sem nome (2).png")));
		lblNewLabel_8.setBounds(380, -95, 1293, 520);
		contentPaneTela.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Design sem nome (1).png")));
		lblNewLabel_9.setBounds(-622, 408, 1232, 425);
		contentPaneTela.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Design sem nome.png")));
		lblNewLabel_10.setBounds(380, 408, 1185, 425);
		contentPaneTela.add(lblNewLabel_10);
	}
}
