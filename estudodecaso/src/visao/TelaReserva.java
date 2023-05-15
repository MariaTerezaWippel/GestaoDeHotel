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
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JTree;
import javax.swing.JSpinner;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Scrollbar;
import java.awt.ScrollPane;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Label;
import javax.swing.JTabbedPane;

public class TelaReserva extends JFrame {

	private JPanel contentPaneTela;
	private JTextField txtNumReserva;
	private JTextField txtQuatdPessoas;
	private JTextField txtNomecomple;
	private JTextField txtNomecomple_1;

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

		setBounds(100, 100, 1300, 990);
		contentPaneTela = new JPanel();
		contentPaneTela.setForeground(new Color(0, 0, 0));
		contentPaneTela.setBackground(new Color(135, 206, 250));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));

		setBounds(100, 100, 1334, 991);
		contentPaneTela = new JPanel();
		contentPaneTela.setForeground(new Color(0, 0, 0));
		contentPaneTela.setBackground(new Color(135, 206, 250));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(contentPaneTela);
		contentPaneTela.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data de Entrada:");
		lblNewLabel.setBounds(345, 371, 158, 14);
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPaneTela.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Reserva da Hospedagem");
		lblNewLabel_1.setBounds(511, 134, 568, 58);
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		contentPaneTela.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Saída:");
		lblNewLabel_2.setBounds(1040, 371, 128, 26);
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 48));
		contentPaneTela.add(lblNewLabel_1);
		
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPaneTela.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de Quarto:");
		lblNewLabel_3.setBounds(345, 478, 161, 27);
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPaneTela.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Número da Reserva:");
		lblNewLabel_4.setBounds(1040, 466, 201, 26);
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPaneTela.add(lblNewLabel_4);
		
		txtNumReserva = new JTextField();
		txtNumReserva.setBounds(1042, 497, 239, 20);
		contentPaneTela.add(txtNumReserva);
		contentPaneTela.add(txtNumReserva);

		txtNumReserva.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade de Pessoas:");
		lblNewLabel_5.setBounds(345, 582, 233, 27);
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPaneTela.add(lblNewLabel_5);
		
		txtQuatdPessoas = new JTextField();
		txtQuatdPessoas.setBounds(345, 610, 239, 20);
		contentPaneTela.add(txtQuatdPessoas);
		contentPaneTela.add(txtQuatdPessoas);

		txtQuatdPessoas.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nome Completo:");
		lblNewLabel_6.setBounds(345, 296, 188, 20);
		lblNewLabel_6.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_6);
		
		txtNomecomple = new JTextField();
		txtNomecomple.setBounds(283, 227, 936, 20);
		lblNewLabel_6.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPaneTela.add(lblNewLabel_6);
		contentPaneTela.add(lblNewLabel_6);
		
		txtNomecomple_1 = new JTextField();
		txtNomecomple_1.setBounds(345, 327, 936, 20);
		contentPaneTela.add(txtNomecomple_1);
		txtNomecomple_1.setColumns(10);

		
		JComboBox DataEntradabox = new JComboBox();
		DataEntradabox.setBounds(345, 396, 239, 22);
		DataEntradabox.setEditable(true);
		DataEntradabox.setBackground(new Color(255, 255, 255));
		contentPaneTela.add(DataEntradabox);
		
		JComboBox DataSaidabox = new JComboBox();
		DataSaidabox.setBounds(980, 318, 239, 22);
		DataSaidabox.setEditable(true);

		contentPaneTela.add(DataEntradabox);
		contentPaneTela.add(DataEntradabox);


		JButton btnRealizarReserva = new JButton("Realizar Reserva");
		btnRealizarReserva.setBounds(707, 692, 188, 33);
		btnRealizarReserva.setForeground(new Color(255, 255, 255));
		btnRealizarReserva.setBackground(new Color(0, 0, 128));
		btnRealizarReserva.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));

		contentPaneTela.add(btnRealizarReserva);
		contentPaneTela.add(btnRealizarReserva);

		contentPaneTela.add(btnRealizarReserva);
		contentPaneTela.add(btnRealizarReserva);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(543, 182, 350, 115);
		lblNewLabel_7.setIcon(new ImageIcon(TelaReserva.class.getResource("/Imagens/LogoHotel.png")));

		contentPaneTela.add(lblNewLabel_7);
		contentPaneTela.add(lblNewLabel_7);

		
		JComboBox DataSaidabox_1 = new JComboBox();
		DataSaidabox_1.setBounds(1042, 396, 239, 22);
		DataSaidabox_1.setEditable(true);
		DataSaidabox_1.setBackground(Color.WHITE);

		contentPaneTela.add(DataSaidabox_1);
		

		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(380, -95, 1293, 520);
		lblNewLabel_8.setIcon(new ImageIcon(TelaReserva.class.getResource("/Imagens/Design sem nome (2).png")));
		contentPaneTela.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(380, 408, 1185, 425);
		lblNewLabel_9.setIcon(new ImageIcon(TelaReserva.class.getResource("/Imagens/Design sem nome.png")));

		contentPaneTela.add(lblNewLabel_9);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(215, 117, -54, -40);
		contentPaneTela.add(tabbedPane);
		
		JTabbedPane tabbedPane_1Menu = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1Menu.setBounds(0, 0, 5000, 25);
		tabbedPane_1Menu.setBackground(new Color(25, 25, 112));
		tabbedPane_1Menu.setForeground(Color.WHITE);
		tabbedPane_1Menu.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		contentPaneTela.add(tabbedPane_1Menu);
		
		JPanel panel = new JPanel();
		tabbedPane_1Menu.addTab("INÍCIO", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_1Menu.addTab("RESERVA", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1Menu.addTab("CANCELAR RESERVA", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1Menu.addTab("LISTAGEM DE HÓSPEDE", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_1Menu.addTab("EXCLUSÃO DE HÓSPEDE", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_1Menu.addTab("CHECK-IN", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1Menu.addTab("PAGAMENTO", null, panel_6, null);
		contentPaneTela.add(lblNewLabel_9);
		contentPaneTela.add(DataSaidabox_1);
		
		JComboBox comboBoxTipoQuarto = new JComboBox();
		comboBoxTipoQuarto.setBounds(345, 504, 239, 22);
		comboBoxTipoQuarto.setEditable(true);
		contentPaneTela.add(comboBoxTipoQuarto);

	}
}
