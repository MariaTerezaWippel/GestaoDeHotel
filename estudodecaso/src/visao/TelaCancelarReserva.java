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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 1614, 991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cancelar Reserva");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel.setBounds(833, 225, 386, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(883, 446, 46, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Número da Reserva:");
		lblNewLabel_2.setBackground(new Color(135, 206, 250));
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(883, 561, 184, 21);
		contentPane.add(lblNewLabel_2);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(883, 496, 156, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtNumeroDaReserva = new JTextField();
		txtNumeroDaReserva.setBounds(884, 617, 86, 20);
		contentPane.add(txtNumeroDaReserva);
		txtNumeroDaReserva.setColumns(10);
		
		JButton btnCancelarReserva = new JButton("Cancelar Reserva");
		btnCancelarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelarReserva.setForeground(new Color(255, 255, 255));

		btnCancelarReserva.setBackground(new Color(0, 0, 128));

		btnCancelarReserva.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		btnCancelarReserva.setBounds(833, 730, 305, 41);
		contentPane.add(btnCancelarReserva);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TelaCancelarReserva.class.getResource("/Imagens/LogoHotel.png")));
		lblNewLabel_3.setBounds(727, 261, 386, 167);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setLabelFor(this);
		lblNewLabel_4.setIcon(new ImageIcon(TelaCancelarReserva.class.getResource("/Imagens/Icon.png")));
		lblNewLabel_4.setBounds(-622, 0, 1334, 911);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(TelaCancelarReserva.class.getResource("/Imagens/Icon.png")));
		lblNewLabel_5.setBounds(642, -73, 1334, 911);
		contentPane.add(lblNewLabel_5);
	}
}
