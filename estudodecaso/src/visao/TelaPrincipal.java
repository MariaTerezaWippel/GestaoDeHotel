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
import javax.swing.JTabbedPane;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 1300, 990);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(548, 10, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblHotel = new JLabel("HotelBoulevard.com");
		lblHotel.setForeground(new Color(0, 0, 128));
		lblHotel.setBackground(new Color(255, 255, 255));
		lblHotel.setBounds(610, 128, 328, 25);
		lblHotel.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		contentPane.add(lblHotel);
		
		JButton btnReservar = new JButton("Já tem Reserva? Clique aqui!");
		btnReservar.setBounds(639, 520, 280, 33);
		btnReservar.setForeground(new Color(255, 255, 255));
		btnReservar.setBackground(new Color(0, 0, 128));
		btnReservar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnReservar);
		
		JTextPane txtTexto = new JTextPane();
		txtTexto.setBounds(582, 689, 427, 48);
		txtTexto.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 16));
		txtTexto.setBackground(new Color(135, 206, 250));
		txtTexto.setText("Aqui você encontra os melhores preços com qualidade de acomodação e serviço. Faça sua reserva agora!");
		contentPane.add(txtTexto);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(528, 180, 325, 111);
		lblNewLabel.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/LogoHotel.png")));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Design sem nome (1).png")));
		lblNewLabel_1.setBounds(-622, 408, 1232, 425);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Icon.png")));
		lblNewLabel_3.setBounds(-622, -95, 1293, 520);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNoTemReserva = new JButton("Não tem reserva? Clique aqui!\r\n");
		btnNoTemReserva.setForeground(Color.WHITE);
		btnNoTemReserva.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		btnNoTemReserva.setBackground(new Color(0, 0, 128));
		btnNoTemReserva.setBounds(639, 405, 280, 33);
		contentPane.add(btnNoTemReserva);
		
		JTabbedPane tabbedPaneMenu = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneMenu.setBackground(new Color(0, 0, 153));
		tabbedPaneMenu.setForeground(new Color(255, 255, 255));
		tabbedPaneMenu.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		tabbedPaneMenu.setBounds(0, 0, 5000, 24);
		contentPane.add(tabbedPaneMenu);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		tabbedPaneMenu.addTab("INÍCIO", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPaneMenu.addTab("RESERVA", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPaneMenu.addTab("CANCELAR RESERVA", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPaneMenu.addTab("LISTAGEM DE HÓSPEDES", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPaneMenu.addTab("EXCLUSÃO DE HÓSPEDES", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPaneMenu.addTab("CHECK-IN", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPaneMenu.addTab("PAGAMENTO", null, panel_6, null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Design sem nome (2).png")));
		lblNewLabel_4.setBounds(380, -95, 1293, 520);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Design sem nome.png")));
		lblNewLabel_5.setBounds(380, 408, 1185, 425);
		contentPane.add(lblNewLabel_5);

		tabbedPaneMenu.addTab("PAGAMENTO", null, panel_6, null);
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
