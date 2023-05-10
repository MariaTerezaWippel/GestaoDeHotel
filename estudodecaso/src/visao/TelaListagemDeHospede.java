package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class TelaListagemDeHospede extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeLista;
	private JTextField txtTelefoneLista;
	private JTextField txtNumeroReserLista;

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
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Listagem de Hóspede");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel.setBounds(437, 61, 390, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Design sem nome.png"));
		lblNewLabel_1.setBounds(832, 0, 430, 170);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Entrada e Saída");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(111, 230, 211, 40);
		contentPane.add(lblNewLabel_2);
		
		JComboBox cmbDataEntraSaida = new JComboBox();
		cmbDataEntraSaida.setForeground(new Color(25, 25, 112));
		cmbDataEntraSaida.setEditable(true);
		cmbDataEntraSaida.setBounds(111, 270, 316, 22);
		contentPane.add(cmbDataEntraSaida);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(111, 156, 188, 29);
		contentPane.add(lblNewLabel_3);
		
		txtNomeLista = new JTextField();
		txtNomeLista.setBackground(new Color(255, 255, 255));
		txtNomeLista.setBounds(111, 182, 316, 20);
		contentPane.add(txtNomeLista);
		txtNomeLista.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(111, 337, 98, 22);
		contentPane.add(lblNewLabel_4);
		
		txtTelefoneLista = new JTextField();
		txtTelefoneLista.setBounds(108, 372, 191, 20);
		contentPane.add(txtTelefoneLista);
		txtTelefoneLista.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Número da Reserva:");
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(111, 424, 188, 14);
		contentPane.add(lblNewLabel_5);
		
		txtNumeroReserLista = new JTextField();
		txtNumeroReserLista.setBounds(111, 449, 188, 20);
		contentPane.add(txtNumeroReserLista);
		txtNumeroReserLista.setColumns(10);
	}
}
