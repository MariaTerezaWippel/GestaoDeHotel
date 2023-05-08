package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCheckIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCheckIn frame = new TelaCheckIn();
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
	public TelaCheckIn() {
		setTitle("Tela Efetuar Check-In");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Efetuar Check-In");
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(408, 58, 238, 36);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(496, 179, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(496, 228, 139, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Número da Reserva");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(373, 181, 113, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome Hóspede(s)");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(373, 231, 103, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Confimar Check-In");
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.BOLD, 12));
		btnNewButton.setBounds(440, 345, 139, 23);
		contentPane.add(btnNewButton);
	}

}
