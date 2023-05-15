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
	private JTextField txtemail;
	private JTextField txtfrasesecreta;

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
		lblNewLabel_1.setBounds(932, 69, 211, 119);
		lblNewLabel_1.setForeground(new Color(0, 0, 128));

		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 48));

		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));

		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setBounds(859, 320, 100, 34);
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Frase secreta :");
		lblNewLabel_3.setBounds(859, 397, 148, 34);
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3);
		
		txtemail = new JTextField();
		txtemail.setBounds(859, 365, 323, 20);
		txtemail.setForeground(new Color(153, 204, 255));
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		txtfrasesecreta = new JTextField();
		txtfrasesecreta.setBounds(859, 442, 323, 20);
		contentPane.add(txtfrasesecreta);
		txtfrasesecreta.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(892, 557, 211, 44);

		btnNewButton.setBackground(new Color(0, 0, 128));

		btnNewButton.setBackground(new Color(25, 25, 112));

		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Boulervard");
		lblNewLabel_4.setBounds(892, 142, 251, 46);
		lblNewLabel_4.setForeground(new Color(0, 0, 128));

		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 48));

		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));

		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cliente ainda não possui uma conta?");
		lblNewLabel_5.setBounds(859, 661, 315, 25);
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Cadastrar! ");
		btnNewButton_1.setBounds(959, 709, 109, 23);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 128));
		btnNewButton_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 11));
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(756, 194, 394, 109);
		lblNewLabel_6.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/LogoHotel.png")));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Icon.png")));
		lblNewLabel_7.setBounds(-602, -60, 1293, 520);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Icon.png")));
		lblNewLabel_8.setBounds(607, 442, 1293, 520);
		contentPane.add(lblNewLabel_8);
	}
}
