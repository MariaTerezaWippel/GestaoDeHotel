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
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data de Entrada:");
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(463, 318, 158, 14);
		contentPane.add(lblNewLabel);
		
		txtDataEntra = new JTextField();
		txtDataEntra.setBounds(651, 318, 119, 20);
		contentPane.add(txtDataEntra);
		txtDataEntra.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Reserva da Hospedagem");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 48));
		lblNewLabel_1.setBounds(362, 85, 568, 58);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Saída:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(481, 370, 128, 14);
		contentPane.add(lblNewLabel_2);
		
		txtDataSaida = new JTextField();
		txtDataSaida.setBounds(651, 370, 119, 20);
		contentPane.add(txtDataSaida);
		txtDataSaida.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de Quarto:");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(468, 412, 161, 27);
		contentPane.add(lblNewLabel_3);
		
		txtTipoQuarto = new JTextField();
		txtTipoQuarto.setBounds(651, 418, 133, 20);
		contentPane.add(txtTipoQuarto);
		txtTipoQuarto.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Número da Reserva:");
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(428, 480, 201, 14);
		contentPane.add(lblNewLabel_4);
		
		txtNumReserva = new JTextField();
		txtNumReserva.setBounds(651, 480, 58, 20);
		contentPane.add(txtNumReserva);
		txtNumReserva.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade de Pessoas:");
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5.setBounds(402, 532, 233, 14);
		contentPane.add(lblNewLabel_5);
		
		txtQuatdPessoas = new JTextField();
		txtQuatdPessoas.setBounds(651, 532, 86, 20);
		contentPane.add(txtQuatdPessoas);
		txtQuatdPessoas.setColumns(10);
		
		JButton btnNewButton = new JButton("Realizar Reserva");
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(514, 681, 210, 23);
		contentPane.add(btnNewButton);
	}
}
