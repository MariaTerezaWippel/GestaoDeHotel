package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class TelaCheckIn extends JFrame {

	private JPanel contentPaneTela;
	private JTextField textNumeroReserva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCheckIn frame = new TelaCheckIn();
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
		setBounds(100, 100, 455, 237);
		contentPaneTela = new JPanel();
		contentPaneTela.setForeground(new Color(0, 0, 0));
		contentPaneTela.setBackground(new Color(135, 206, 250));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneTela);
		contentPaneTela.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Efetuar Check-In");
		lblNewLabel.setBounds(70, 11, 335, 48);
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 34));
		contentPaneTela.add(lblNewLabel);
		
		/**********/
		MaskFormatter mascaraNReserva = null;
		try {
			mascaraNReserva = new MaskFormatter("###");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		textNumeroReserva = new JFormattedTextField(mascaraNReserva);
		/**********/
		
		textNumeroReserva.setBounds(238, 89, 153, 23);
		textNumeroReserva.setForeground(new Color(0, 0, 0));
		contentPaneTela.add(textNumeroReserva);
		textNumeroReserva.setColumns(10);

		
		JLabel lblNewLabel_1 = new JLabel("Número da Reserva : ");
		lblNewLabel_1.setBounds(28, 86, 215, 22);
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_1);
		
		JButton btnConfirmar = new JButton("Confimar Check-In");
		btnConfirmar.setBounds(26, 141, 203, 33);
		btnConfirmar.setForeground(new Color(255, 255, 255));
		btnConfirmar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirmar.setBackground(new Color(0, 0, 128));
		btnConfirmar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		contentPaneTela.add(btnConfirmar);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(263, 141, 107, 35);
		contentPaneTela.add(btnNewButton);
	}
}
