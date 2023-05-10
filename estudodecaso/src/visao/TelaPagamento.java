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
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class TelaPagamento extends JFrame {

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
		lblNewLabel.setBounds(524, 237, 141, 56);
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblServioDeQuarto = new JLabel("Serviço de Quarto :");
		lblServioDeQuarto.setBounds(524, 304, 220, 56);
		lblServioDeQuarto.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblServioDeQuarto);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar : ");
		lblTotalAPagar.setBounds(524, 429, 244, 56);
		lblTotalAPagar.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblTotalAPagar);
		
		JLabel lblFormaPagamento = new JLabel("Forma de pagamento : ");
		lblFormaPagamento.setBounds(524, 517, 228, 56);
		lblFormaPagamento.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblFormaPagamento);
		
		JButton btnNewButton_2 = new JButton("Finalizar ");
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(584, 768, 228, 56);
		btnNewButton_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 24));
		contentPane.add(btnNewButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sim");
		rdbtnNewRadioButton.setBounds(524, 367, 68, 34);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Não");
		rdbtnNewRadioButton_1.setBounds(609, 367, 68, 34);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(524, 584, 288, 22);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(655, 258, 153, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(655, 450, 153, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Design sem nome.png"));
		lblNewLabel_1.setBounds(432, 11, 492, 236);
		contentPane.add(lblNewLabel_1);
	}
}
