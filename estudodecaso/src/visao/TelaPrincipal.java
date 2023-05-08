package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
	public TelaPrincipal() {
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(548, 10, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("HotelBoulevard.com");
		lblNewLabel_1.setBounds(580, 89, 328, 25);
		lblNewLabel_1.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 35));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Já tem Reserva? Clique aqui!");
		btnNewButton.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(655, 356, 172, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(579, 269, 248, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pesquisar");
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setBounds(579, 244, 84, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Ir");
		btnNewButton_1.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(837, 268, 46, 22);
		contentPane.add(btnNewButton_1);
		
		JTextPane txtpnAquiVoc = new JTextPane();
		txtpnAquiVoc.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 11));
		txtpnAquiVoc.setBackground(new Color(224, 255, 255));
		txtpnAquiVoc.setText("Aqui você encontra os melhores preços com qualidade de acomodação e serviço. Faça sua reserva agora!");
		txtpnAquiVoc.setBounds(621, 460, 240, 48);
		contentPane.add(txtpnAquiVoc);
	}
}
