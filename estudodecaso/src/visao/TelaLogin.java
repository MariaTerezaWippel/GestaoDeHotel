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
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(197, 246, 100, -150);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Hotel");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 48));
		lblNewLabel_1.setBounds(546, 0, 211, 91);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(457, 236, 100, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Senha :");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(457, 313, 80, 34);
		contentPane.add(lblNewLabel_3);
		
		txtemail = new JTextField();
		txtemail.setForeground(new Color(153, 204, 255));
		txtemail.setBounds(457, 281, 323, 20);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		txtfrasesecreta = new JTextField();
		txtfrasesecreta.setBounds(457, 358, 323, 20);
		contentPane.add(txtfrasesecreta);
		txtfrasesecreta.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(51, 153, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(516, 472, 211, 44);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Boulervard");
		lblNewLabel_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 48));
		lblNewLabel_4.setBounds(494, 70, 251, 44);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cliente ainda não possui uma conta?");
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(483, 605, 315, 25);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Cadastrar! ");
		btnNewButton_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 11));
		btnNewButton_1.setBounds(583, 653, 109, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Design sem nome.png"));
		lblNewLabel_6.setBounds(367, 113, 323, 105);
		contentPane.add(lblNewLabel_6);
	}
}
