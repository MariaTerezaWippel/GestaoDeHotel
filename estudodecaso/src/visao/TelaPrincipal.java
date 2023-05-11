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
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textPesquisarCampo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(548, 10, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblHotel = new JLabel("HotelBoulevard.com");
		lblHotel.setBounds(658, 169, 328, 25);
		lblHotel.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		contentPane.add(lblHotel);
		
		JButton btnReservar = new JButton("Já tem Reserva? Clique aqui!");
		btnReservar.setForeground(new Color(255, 255, 255));
		btnReservar.setBounds(672, 468, 280, 33);
		btnReservar.setBackground(new Color(0, 0, 128));
		btnReservar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnReservar);
		
		textPesquisarCampo = new JTextField();
		textPesquisarCampo.setBounds(644, 403, 256, 25);
		contentPane.add(textPesquisarCampo);
		textPesquisarCampo.setColumns(10);
		
		JLabel lblPesquisar = new JLabel("Pesquisar");
		lblPesquisar.setBounds(644, 368, 110, 25);
		lblPesquisar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblPesquisar);
		
		JButton btnBotaoIr = new JButton("Ir");
		btnBotaoIr.setBounds(910, 405, 53, 23);
		btnBotaoIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBotaoIr.setBackground(new Color(135, 206, 250));
		btnBotaoIr.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(btnBotaoIr);
		
		JTextPane txtTexto = new JTextPane();
		txtTexto.setBounds(613, 576, 427, 48);
		txtTexto.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		txtTexto.setBackground(new Color(135, 206, 250));
		txtTexto.setText("Aqui você encontra os melhores preços com qualidade de acomodação e serviço. Faça sua reserva agora!");
		contentPane.add(txtTexto);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/LogoHotel.png")));
		lblNewLabel.setBounds(563, 231, 325, 111);
		contentPane.add(lblNewLabel);
	}
}
