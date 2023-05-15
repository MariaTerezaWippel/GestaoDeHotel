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
import javax.swing.JTabbedPane;

public class TelaCancelarReserva extends JFrame {

	private JPanel contentPaneTela;
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

		setBounds(100, 100, 1705, 920);
		contentPaneTela = new JPanel();
		contentPaneTela.setBackground(new Color(135, 206, 250));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(100, 100, 1614, 991);
		contentPaneTela = new JPanel();
		contentPaneTela.setBackground(new Color(135, 206, 250));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(contentPaneTela);
		contentPaneTela.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cancelar Reserva");
		lblNewLabel.setBounds(626, 199, 386, 32);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		contentPaneTela.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(670, 391, 46, 39);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_1);
		contentPaneTela.add(lblNewLabel);

		
		JLabel lblNewLabel_2 = new JLabel("Número da Reserva:");
		lblNewLabel_2.setBounds(671, 506, 211, 21);
		lblNewLabel_2.setBackground(new Color(135, 206, 250));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_2);
		contentPaneTela.add(lblNewLabel_2);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(670, 441, 156, 20);
		contentPaneTela.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtNumeroDaReserva = new JTextField();
		txtNumeroDaReserva.setBounds(670, 538, 86, 20);
		contentPaneTela.add(txtNumeroDaReserva);

		txtNumeroDaReserva.setColumns(10);
		
		JButton btnCancelarReserva = new JButton("Cancelar Reserva");
		btnCancelarReserva.setBounds(625, 611, 305, 41);
		btnCancelarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelarReserva.setForeground(new Color(255, 255, 255));

		btnCancelarReserva.setBackground(new Color(0, 0, 128));

		btnCancelarReserva.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		contentPaneTela.add(btnCancelarReserva);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(520, 225, 386, 167);
		lblNewLabel_3.setIcon(new ImageIcon(TelaCancelarReserva.class.getResource("/Imagens/LogoHotel.png")));
		contentPaneTela.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(-622, -95, 1293, 520);
		lblNewLabel_4.setLabelFor(this);
		lblNewLabel_4.setIcon(new ImageIcon(TelaCancelarReserva.class.getResource("/Imagens/icon.png")));
		contentPaneTela.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(380, -95, 1293, 520);
		lblNewLabel_5.setIcon(new ImageIcon(TelaCancelarReserva.class.getResource("/Imagens/Design sem nome (2).png")));
		contentPaneTela.add(lblNewLabel_5);
		contentPaneTela.add(btnCancelarReserva);
		
		JTabbedPane tabbedPaneMenu = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneMenu.setBounds(0, 0, 5000, 25);
		tabbedPaneMenu.setForeground(new Color(255, 255, 255));
		tabbedPaneMenu.setBackground(new Color(0, 0, 153));
		tabbedPaneMenu.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		contentPaneTela.add(tabbedPaneMenu);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 112));
		tabbedPaneMenu.addTab("INÍCIO", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(25, 25, 112));
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
		
		

		
		JTabbedPane tabbedPaneCancelar = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneCancelar.setBounds(0, 0, 5000, 25);
		tabbedPaneCancelar.setForeground(new Color(255, 255, 255));
		tabbedPaneCancelar.setBackground(new Color(0, 0, 153));
		tabbedPaneCancelar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		contentPaneTela.add(tabbedPaneCancelar);
		
 
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(-622, 408, 1232, 425);
		lblNewLabel_6.setIcon(new ImageIcon(TelaCancelarReserva.class.getResource("/Imagens/Design sem nome (1).png")));
		contentPaneTela.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(380, 408, 1185, 425);
		lblNewLabel_7.setIcon(new ImageIcon(TelaCancelarReserva.class.getResource("/Imagens/Design sem nome.png")));
		contentPaneTela.add(lblNewLabel_7);


	}
}
