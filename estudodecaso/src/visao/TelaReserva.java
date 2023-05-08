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

public class TelaReserva extends JFrame {

	private JPanel contentPane;
	private JTextField txtDataEntra;
	private JTextField txtDataSaida;
	private JTextField txtTipoQuarto;
	private JTextField txtNumReserva;
	private JTextField txtQuatdPessoas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaReserva frame = new TelaReserva();
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
	public TelaReserva() {
		setBackground(new Color(255, 255, 255));
		setTitle("Tela Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1323, 717);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data de Entrada:");
		lblNewLabel.setBounds(573, 228, 158, 14);
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel);
		
		txtDataEntra = new JTextField();
		txtDataEntra.setBounds(786, 228, 119, 20);
		contentPane.add(txtDataEntra);
		txtDataEntra.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Reserva da Hospedagem");
		lblNewLabel_1.setBounds(573, 57, 363, 27);
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 26));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Saída:");
		lblNewLabel_2.setBounds(591, 284, 128, 14);
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_2);
		
		txtDataSaida = new JTextField();
		txtDataSaida.setBounds(786, 284, 119, 20);
		contentPane.add(txtDataSaida);
		txtDataSaida.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de Quarto:");
		lblNewLabel_3.setBounds(573, 332, 161, 27);
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_3);
		
		txtTipoQuarto = new JTextField();
		txtTipoQuarto.setBounds(786, 338, 133, 20);
		contentPane.add(txtTipoQuarto);
		txtTipoQuarto.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Número da Reserva:");
		lblNewLabel_4.setBounds(528, 397, 201, 14);
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_4);
		
		txtNumReserva = new JTextField();
		txtNumReserva.setBounds(786, 397, 58, 20);
		contentPane.add(txtNumReserva);
		txtNumReserva.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade de Pessoas:");
		lblNewLabel_5.setBounds(498, 457, 233, 20);
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_5);
		
		txtQuatdPessoas = new JTextField();
		txtQuatdPessoas.setBounds(786, 457, 86, 20);
		contentPane.add(txtQuatdPessoas);
		txtQuatdPessoas.setColumns(10);
		
		JButton btnNewButton = new JButton("Realizar Reserva");
		btnNewButton.setBounds(623, 562, 210, 23);
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(btnNewButton);
	}
}
