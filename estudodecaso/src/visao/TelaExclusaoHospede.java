package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

public class TelaExclusaoHospede extends JFrame {

	private JPanel contentPaneTela;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtDataNascimento;
	private JTextField txtQuantidadeHospedes;
	private JTextField txtCEP;
	private JTextField txtNumeroReserva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExclusaoHospede frame = new TelaExclusaoHospede();
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
	public TelaExclusaoHospede() {
		setTitle("Tela Exclusão de Hóspede");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1987, 991);
		contentPaneTela = new JPanel();
		contentPaneTela.setBackground(new Color(135, 206, 250));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneTela);
		contentPaneTela.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Excluir Hóspede");
		lblNewLabel.setBounds(692, 137, 446, 28);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		contentPaneTela.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(571, 311, 86, 28);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setBounds(909, 311, 46, 20);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setBounds(571, 402, 60, 20);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		lblNewLabel_4.setBounds(909, 402, 90, 20);
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Data de Nascimento:");
		lblNewLabel_5.setBounds(571, 492, 202, 21);
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Quantidade de Hóspedes:");
		lblNewLabel_6.setBounds(909, 488, 244, 28);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("CEP:");
		lblNewLabel_7.setBounds(571, 574, 60, 26);
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Numero da Reserva:");
		lblNewLabel_8.setBounds(909, 573, 202, 28);
		lblNewLabel_8.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPaneTela.add(lblNewLabel_8);
		
		txtNome = new JTextField();
		txtNome.setBounds(571, 336, 216, 20);
		contentPaneTela.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(909, 336, 151, 20);
		contentPaneTela.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(571, 425, 191, 20);
		contentPaneTela.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(909, 425, 127, 20);
		contentPaneTela.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(571, 520, 86, 20);
		contentPaneTela.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		txtQuantidadeHospedes = new JTextField();
		txtQuantidadeHospedes.setBounds(909, 520, 46, 20);
		contentPaneTela.add(txtQuantidadeHospedes);
		txtQuantidadeHospedes.setColumns(10);
		
		txtCEP = new JTextField();
		txtCEP.setBounds(569, 599, 136, 20);
		contentPaneTela.add(txtCEP);
		txtCEP.setColumns(10);
		
		txtNumeroReserva = new JTextField();
		txtNumeroReserva.setBounds(909, 599, 37, 20);
		contentPaneTela.add(txtNumeroReserva);
		txtNumeroReserva.setColumns(10);
		
		JButton btnNewButton = new JButton("Excluir Hóspede");
		btnNewButton.setBounds(655, 709, 314, 35);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		contentPaneTela.add(btnNewButton);
		contentPaneTela.add(lblNewLabel);


		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(577, 185, 328, 96);
		lblNewLabel_9.setIcon(new ImageIcon(TelaExclusaoHospede.class.getResource("/Imagens/LogoHotel.png")));
		contentPaneTela.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(380, -95, 1293, 520);
		lblNewLabel_10.setIcon(new ImageIcon(TelaExclusaoHospede.class.getResource("/Imagens/Design sem nome (2).png")));
		contentPaneTela.add(lblNewLabel_10);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(380, 408, 1185, 425);
		lblNewLabel_12.setIcon(new ImageIcon(TelaExclusaoHospede.class.getResource("/Imagens/Design sem nome.png")));
		contentPaneTela.add(lblNewLabel_12);
		contentPaneTela.add(lblNewLabel_9);
		
		JTabbedPane tabbedPaneMenu = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneMenu.setBounds(0, 0, 5000, 25);
		tabbedPaneMenu.setForeground(new Color(255, 255, 255));
		tabbedPaneMenu.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 14));
		tabbedPaneMenu.setBackground(new Color(25, 25, 112));
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


	}
}
