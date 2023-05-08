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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(197, 246, 100, -150);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Login");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBounds(899, 34, 100, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(708, 372, 100, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Frase  Secreta : ");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(626, 480, 196, 34);
		contentPane.add(lblNewLabel_3);
		
		txtemail = new JTextField();
		txtemail.setBounds(806, 383, 323, 20);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		txtfrasesecreta = new JTextField();
		txtfrasesecreta.setBounds(818, 491, 311, 20);
		contentPane.add(txtfrasesecreta);
		txtfrasesecreta.setColumns(10);
		
		JButton btnNewButton = new JButton("Fazer Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(856, 773, 143, 44);
		contentPane.add(btnNewButton);
	}
}
