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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;

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
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(contentPane, popupMenu);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(548, 10, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblHotel = new JLabel("HotelBoulevard.com");
		lblHotel.setBounds(813, 167, 328, 25);
		lblHotel.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		contentPane.add(lblHotel);
		
		JButton btnReservar = new JButton("Já tem Reserva? Clique aqui!");
		btnReservar.setBounds(842, 559, 280, 33);
		btnReservar.setForeground(new Color(255, 255, 255));
		btnReservar.setBackground(new Color(0, 0, 128));
		btnReservar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnReservar);
		
		textPesquisarCampo = new JTextField();
		textPesquisarCampo.setBounds(813, 469, 256, 25);
		contentPane.add(textPesquisarCampo);
		textPesquisarCampo.setColumns(10);
		
		JLabel lblPesquisar = new JLabel("Pesquisar");
		lblPesquisar.setBounds(812, 433, 110, 25);
		lblPesquisar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblPesquisar);
		
		JButton btnBotaoIr = new JButton("Ir");
		btnBotaoIr.setBounds(1079, 471, 53, 23);
		btnBotaoIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBotaoIr.setBackground(new Color(135, 206, 250));
		btnBotaoIr.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(btnBotaoIr);
		
		JTextPane txtTexto = new JTextPane();
		txtTexto.setBounds(785, 728, 427, 48);
		txtTexto.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 16));
		txtTexto.setBackground(new Color(135, 206, 250));
		txtTexto.setText("Aqui você encontra os melhores preços com qualidade de acomodação e serviço. Faça sua reserva agora!");
		contentPane.add(txtTexto);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(744, 218, 325, 111);
		lblNewLabel.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/LogoHotel.png")));
		contentPane.add(lblNewLabel);
		
		JMenu mnNewMenu = new JMenu("     Menu");
		mnNewMenu.setForeground(new Color(0, 0, 128));
		mnNewMenu.setBackground(new Color(0, 0, 0));
		mnNewMenu.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 16));
		mnNewMenu.setBounds(84, 72, 125, 48);
		contentPane.add(mnNewMenu);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/icon.png")));
		lblNewLabel_1.setBounds(-618, 468, 1253, 433);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/icon.png")));
		lblNewLabel_3.setBounds(-659, 72, 1376, 474);
		contentPane.add(lblNewLabel_3);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
