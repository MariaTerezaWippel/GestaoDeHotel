package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaPagamento extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPagamento frame = new TelaPagamento();
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
	public TelaPagamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setForeground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Preço Diária : ");
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
		lblNewLabel.setBounds(294, 219, 141, 56);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(448, 234, 92, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblServioDeQuarto = new JLabel("Serviço de Quarto :");
		lblServioDeQuarto.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
		lblServioDeQuarto.setBounds(294, 313, 220, 56);
		contentPane.add(lblServioDeQuarto);
		
		JButton btnNewButton = new JButton("Sim");
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 11));
		btnNewButton.setBounds(497, 326, 89, 38);
		contentPane.add(btnNewButton);
	}

}
