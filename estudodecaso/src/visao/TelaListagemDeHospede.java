package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.ScrollPane;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

public class TelaListagemDeHospede extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeLista;
	private JTextField txtTelefoneLista;
	private JTextField txtNumeroReserLista;
	private JTable table;
	private DefaultTableModel dataModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagemDeHospede frame = new TelaListagemDeHospede();
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
	public TelaListagemDeHospede() {
		setTitle("Tela Listagem de Hóspede");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1405, 1057);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Listagem de Hóspede");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel.setBounds(689, 31, 390, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Entrada:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(500, 331, 211, 40);
		contentPane.add(lblNewLabel_2);
		
		JComboBox cmbDataEntraSaida = new JComboBox();
		cmbDataEntraSaida.setForeground(new Color(25, 25, 112));
		cmbDataEntraSaida.setEditable(true);
		cmbDataEntraSaida.setBounds(500, 382, 316, 22);
		contentPane.add(cmbDataEntraSaida);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(500, 211, 188, 29);
		contentPane.add(lblNewLabel_3);
		
		txtNomeLista = new JTextField();
		txtNomeLista.setBackground(new Color(255, 255, 255));
		txtNomeLista.setBounds(500, 251, 316, 20);
		contentPane.add(txtNomeLista);
		txtNomeLista.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(500, 530, 98, 22);
		contentPane.add(lblNewLabel_4);
		
		txtTelefoneLista = new JTextField();
		txtTelefoneLista.setBounds(500, 563, 191, 20);
		contentPane.add(txtTelefoneLista);
		txtTelefoneLista.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Número da Reserva:");
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(503, 607, 188, 22);
		contentPane.add(lblNewLabel_5);
		
		txtNumeroReserLista = new JTextField();
		txtNumeroReserLista.setBounds(500, 640, 188, 20);
		contentPane.add(txtNumeroReserLista);
		txtNumeroReserLista.setColumns(10);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setFont(null);
		scrollPane.setForeground(new Color(0, 0, 0));
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(846, 211, 657, 449);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBounds(652, 239, 1, 1);
		contentPane.add(table);
		
		JLabel lblNewLabel_2_1 = new JLabel("Data de Saída:");
		lblNewLabel_2_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(500, 418, 211, 40);
		contentPane.add(lblNewLabel_2_1);
		
		JComboBox cmbDataSaida = new JComboBox();
		cmbDataSaida.setForeground(new Color(25, 25, 112));
		cmbDataSaida.setEditable(true);
		cmbDataSaida.setBounds(500, 469, 316, 22);
		contentPane.add(cmbDataSaida);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaListagemDeHospede.class.getResource("/Imagens/icon.png")));
		lblNewLabel_1.setBounds(-622, -95, 1293, 520);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(TelaListagemDeHospede.class.getResource("/Imagens/Design sem nome (1).png")));
		lblNewLabel_6.setBounds(-622, 408, 1232, 425);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(TelaListagemDeHospede.class.getResource("/Imagens/LogoHotel.png")));
		lblNewLabel_7.setBounds(621, 43, 345, 178);
		contentPane.add(lblNewLabel_7);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setForeground(new Color(255, 255, 255));
		btnListar.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		btnListar.setBackground(new Color(0, 0, 128));
		btnListar.setBounds(810, 752, 156, 40);
		contentPane.add(btnListar);
		JTabbedPane tabbedPaneMenu = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneMenu.setBackground(new Color(25, 25, 112));
		tabbedPaneMenu.setForeground(Color.WHITE);
		tabbedPaneMenu.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		tabbedPaneMenu.setBounds(0, 0, 5000, 25);
		contentPane.add(tabbedPaneMenu);
		
		JPanel panel = new JPanel();
		tabbedPaneMenu.addTab("INÍCIO", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPaneMenu.addTab("RESERVA", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPaneMenu.addTab("CANCELAR RESERVA", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPaneMenu.addTab("LISTAGEM DE HÓPEDES", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPaneMenu.addTab("EXCLUSÃO DE HÓSPEDES", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPaneMenu.addTab("CHECK-IN", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPaneMenu.addTab("PAGAMENTO", null, panel_6, null);
		
		table = new JTable();
		dataModel = new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "Data de Entrada e Saída", "Telefone", "Número da Reserva" });
		table.setModel(dataModel);
		
		
		
	}
}
