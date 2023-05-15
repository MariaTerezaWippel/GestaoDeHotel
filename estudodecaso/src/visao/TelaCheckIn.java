package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class TelaCheckIn extends JFrame {

	private JPanel contentPaneTela;
	private JTextField textNumeroReserva;
	private JTextField textField_Hospede;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCheckIn frame = new TelaCheckIn();
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
	public TelaCheckIn() {
		setTitle("Tela Efetuar Check-In");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1448, 990);
		contentPaneTela = new JPanel();
		contentPaneTela.setForeground(new Color(0, 0, 0));
		contentPaneTela.setBackground(new Color(135, 206, 250));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneTela);
		contentPaneTela.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Efetuar Check-In");
		lblNewLabel.setBounds(821, 213, 293, 36);
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		contentPaneTela.add(lblNewLabel);
		
		textNumeroReserva = new JTextField();
		textNumeroReserva.setBounds(1001, 482, 153, 23);
		textNumeroReserva.setForeground(new Color(0, 0, 0));
		contentPaneTela.add(textNumeroReserva);
		textNumeroReserva.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Número da Reserva : ");
		lblNewLabel_1.setBounds(789, 483, 202, 14);
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome Hóspede(s) : ");
		lblNewLabel_2.setBounds(789, 549, 191, 20);
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_2);
		
		JButton btnConfirmar = new JButton("Confimar Check-In");
		btnConfirmar.setBounds(903, 702, 191, 33);
		btnConfirmar.setForeground(new Color(255, 255, 255));
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirmar.setBackground(new Color(0, 0, 128));
		btnConfirmar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		contentPaneTela.add(btnConfirmar);
		
		textField_Hospede = new JTextField();
		textField_Hospede.setBounds(1001, 551, 153, 23);
		textField_Hospede.setForeground(Color.BLACK);
		textField_Hospede.setColumns(10);
		contentPaneTela.add(textField_Hospede);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(721, 281, 433, 100);
		lblNewLabel_3.setIcon(new ImageIcon(TelaCheckIn.class.getResource("/Imagens/LogoHotel.png")));
		contentPaneTela.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");

		lblNewLabel_4.setIcon(new ImageIcon(TelaCheckIn.class.getResource("/Imagens/Design sem nome.png")));
		lblNewLabel_4.setBounds(380, 408, 1185, 425);
		contentPaneTela.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(TelaCheckIn.class.getResource("/Imagens/Icon.png")));
		lblNewLabel_5.setBounds(380, -95, 1293, 520);
		contentPaneTela.add(lblNewLabel_5);

		lblNewLabel_4.setIcon(new ImageIcon(TelaCheckIn.class.getResource("/Imagens/Icon.png")));
		lblNewLabel_4.setBounds(-615, 505, 1376, 435);
		contentPaneTela.add(lblNewLabel_4);
		

		
		JTabbedPane tabbedPaneMenu = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneMenu.setForeground(new Color(255, 255, 255));
		tabbedPaneMenu.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		tabbedPaneMenu.setBackground(new Color(25, 25, 112));
		tabbedPaneMenu.setBounds(0, 0, 5000, 25);
		contentPaneTela.add(tabbedPaneMenu);
		
		JPanel panel = new JPanel();
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
		JTabbedPane tabbedPaneCheckIn = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneCheckIn.setForeground(new Color(255, 255, 255));
		tabbedPaneCheckIn.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		tabbedPaneCheckIn.setBackground(new Color(25, 25, 112));
		tabbedPaneCheckIn.setBounds(0, 0, 5000, 25);
		contentPaneTela.add(tabbedPaneCheckIn);
		
		
	}
}
