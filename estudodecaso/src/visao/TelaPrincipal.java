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
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(548, 10, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblHotel = new JLabel("HotelBoulevard.com");
		lblHotel.setBounds(628, 51, 328, 25);
		lblHotel.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 26));
		contentPane.add(lblHotel);
		
		JButton btnReservar = new JButton("Já tem Reserva? Clique aqui!");
		btnReservar.setBackground(new Color(135, 206, 250));
		btnReservar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		btnReservar.setBounds(652, 352, 207, 23);
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnReservar);
		
		textPesquisarCampo = new JTextField();
		textPesquisarCampo.setBounds(579, 285, 256, 25);
		contentPane.add(textPesquisarCampo);
		textPesquisarCampo.setColumns(10);
		
		JLabel lblPesquisar = new JLabel("Pesquisar");
		lblPesquisar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblPesquisar.setBounds(579, 250, 110, 25);
		contentPane.add(lblPesquisar);
		
		JButton btnBotaoIr = new JButton("Ir");
		btnBotaoIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBotaoIr.setBackground(new Color(135, 206, 250));
		btnBotaoIr.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		btnBotaoIr.setBounds(845, 287, 53, 23);
		contentPane.add(btnBotaoIr);
		
		JTextPane txtTexto = new JTextPane();
		txtTexto.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		txtTexto.setBackground(new Color(135, 206, 250));
		txtTexto.setText("Aqui você encontra os melhores preços com qualidade de acomodação e serviço. Faça sua reserva agora!");
		txtTexto.setBounds(547, 470, 427, 48);
		contentPane.add(txtTexto);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Design sem nome.png"));
		lblNewLabel.setBounds(494, 87, 404, 152);
		contentPane.add(lblNewLabel);
	}
}
