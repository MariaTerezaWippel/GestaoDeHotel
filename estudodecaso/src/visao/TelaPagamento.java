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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaPagamento extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		lblNewLabel.setBounds(496, 123, 141, 56);
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(496, 178, 92, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblServioDeQuarto = new JLabel("Serviço de Quarto :");
		lblServioDeQuarto.setBounds(496, 241, 220, 56);
		lblServioDeQuarto.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
		contentPane.add(lblServioDeQuarto);
		
		JButton btnNewButton = new JButton("Sim");
		btnNewButton.setBounds(496, 308, 89, 38);
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 11));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Não");
		btnNewButton_1.setBounds(610, 308, 89, 38);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_1);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar : ");
		lblTotalAPagar.setBounds(496, 382, 153, 56);
		lblTotalAPagar.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
		contentPane.add(lblTotalAPagar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(496, 439, 86, 27);
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFormaPagamento = new JLabel("Forma de pagamento : ");
		lblFormaPagamento.setBounds(496, 496, 228, 56);
		lblFormaPagamento.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 22));
		contentPane.add(lblFormaPagamento);
		
		textField_2 = new JTextField();
		textField_2.setBounds(496, 564, 141, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Finalizar ");
		btnNewButton_2.setBounds(488, 764, 228, 56);
		btnNewButton_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 24));
		contentPane.add(btnNewButton_2);
	}
}
