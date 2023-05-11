package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;

public class TelaCancelarReserva extends JFrame {

	private JPanel contentPane;
	private JTextField txtCpf;
	private JTextField txtNumeroDaReserva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCancelarReserva frame = new TelaCancelarReserva();
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
	public TelaCancelarReserva() {
		setTitle("Tela Cancelar Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cancelar Reserva");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel.setBounds(690, 145, 386, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cpf:");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(741, 320, 46, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero da Reserva:");
		lblNewLabel_2.setBackground(new Color(135, 206, 250));
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(740, 481, 184, 21);
		contentPane.add(lblNewLabel_2);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(741, 370, 156, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtNumeroDaReserva = new JTextField();
		txtNumeroDaReserva.setBounds(741, 537, 86, 20);
		contentPane.add(txtNumeroDaReserva);
		txtNumeroDaReserva.setColumns(10);
		
		JButton btnCancelarReserva = new JButton("Cancelar Reserva");
		btnCancelarReserva.setForeground(new Color(255, 255, 255));

		btnCancelarReserva.setBackground(new Color(0, 0, 128));

		btnCancelarReserva.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		btnCancelarReserva.setBounds(690, 729, 301, 41);
		contentPane.add(btnCancelarReserva);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(TelaCancelarReserva.class.getResource("/Imagens/LogoHotel.png")));
		lblNewLabel_3.setBounds(584, 181, 386, 167);
		contentPane.add(lblNewLabel_3);
	}
}
