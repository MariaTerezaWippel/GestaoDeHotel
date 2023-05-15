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

	private JPanel contentPane;
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
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(197, 246, 100, -150);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Hotel");
		lblNewLabel_1.setBounds(718, 123, 211, 44);
		lblNewLabel_1.setForeground(new Color(0, 0, 128));

		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 48));

		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));

		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setBounds(645, 337, 100, 34);
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Frase secreta :");
		lblNewLabel_3.setBounds(645, 414, 148, 34);
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3);
		

		txtEmail = new JTextField();
		txtEmail.setBounds(645, 382, 323, 20);
		txtEmail.setForeground(new Color(153, 204, 255));
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtFraseSecreta = new JTextField();
		txtFraseSecreta.setBounds(645, 459, 323, 20);
		contentPane.add(txtFraseSecreta);
		txtFraseSecreta.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(678, 524, 211, 44);
		


		btnLogin.setBackground(new Color(0, 0, 128));

		btnLogin.setBackground(new Color(25, 25, 112));

		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_4 = new JLabel("Boulervard");
		lblNewLabel_4.setBounds(678, 159, 251, 46);
		lblNewLabel_4.setForeground(new Color(0, 0, 128));

		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 48));

		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));

		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cliente ainda não possui uma conta?");
		lblNewLabel_5.setBounds(620, 698, 315, 25);
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5);
		

		JButton btnCadasrtar = new JButton("Cadastrar! ");
		btnCadasrtar.setBounds(678, 754, 211, 44);
		btnCadasrtar.setForeground(new Color(255, 255, 255));
		btnCadasrtar.setBackground(new Color(0, 0, 128));
		btnCadasrtar.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(btnCadasrtar);

		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(518, 217, 394, 109);
		lblNewLabel_6.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/LogoHotel.png")));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Icon.png")));
		lblNewLabel_7.setBounds(-622, -95, 1293, 520);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Design sem nome (2).png")));
		lblNewLabel_8.setBounds(380, -95, 1293, 520);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Design sem nome (1).png")));
		lblNewLabel_9.setBounds(-622, 408, 1232, 425);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Design sem nome.png")));
		lblNewLabel_10.setBounds(380, 408, 1185, 425);
		contentPane.add(lblNewLabel_10);
	}
}
