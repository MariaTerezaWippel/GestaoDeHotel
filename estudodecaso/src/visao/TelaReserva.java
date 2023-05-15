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

public class TelaReserva extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumReserva;
	private JTextField txtQuatdPessoas;
	private JTextField txtNomecomple;

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
		setBounds(100, 100, 1334, 991);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data de Entrada:");
		lblNewLabel.setBounds(345, 371, 158, 14);
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Reserva da Hospedagem");
		lblNewLabel_1.setBounds(576, 42, 568, 58);
		lblNewLabel_1.setBounds(556, 117, 568, 58);
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Saída:");
		lblNewLabel_2.setBounds(1042, 371, 128, 14);
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 48));
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de Quarto:");
		lblNewLabel_3.setBounds(345, 466, 161, 27);
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Número da Reserva:");
		lblNewLabel_4.setBounds(1042, 472, 201, 14);
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPane.add(lblNewLabel_4);
		
		txtNumReserva = new JTextField();
		txtNumReserva.setBounds(1042, 497, 239, 20);
		contentPane.add(txtNumReserva);
		txtNumReserva.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade de Pessoas:");
		lblNewLabel_5.setBounds(345, 572, 233, 27);
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPane.add(lblNewLabel_5);
		
		txtQuatdPessoas = new JTextField();
		txtQuatdPessoas.setBounds(345, 610, 239, 20);
		contentPane.add(txtQuatdPessoas);
		txtQuatdPessoas.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nome Completo:");
		lblNewLabel_6.setBounds(283, 193, 188, 20);
		lblNewLabel_6.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_6);
		
		txtNomecomple = new JTextField();
		txtNomecomple.setBounds(283, 227, 936, 20);
		lblNewLabel_6.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_6.setBounds(345, 271, 188, 20);
		contentPane.add(lblNewLabel_6);
		
		txtNomecomple = new JTextField();
		txtNomecomple.setBounds(345, 301, 936, 20);
		contentPane.add(txtNomecomple);
		txtNomecomple.setColumns(10);
		
		JComboBox DataEntradabox = new JComboBox();
		DataEntradabox.setBounds(283, 318, 239, 22);
		DataEntradabox.setEditable(true);
		DataEntradabox.setBackground(new Color(255, 255, 255));
		contentPane.add(DataEntradabox);
		
		JComboBox DataSaidabox = new JComboBox();
		DataSaidabox.setBounds(980, 318, 239, 22);
		DataSaidabox.setEditable(true);
		DataEntradabox.setBounds(345, 396, 239, 22);
		contentPane.add(DataEntradabox);

		JButton btnRealizarReserva = new JButton("Realizar Reserva");
		btnRealizarReserva.setBounds(743, 641, 188, 33);
		btnRealizarReserva.setForeground(new Color(255, 255, 255));
		btnRealizarReserva.setBackground(new Color(0, 0, 128));
		btnRealizarReserva.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(btnRealizarReserva);
		btnRealizarReserva.setBounds(708, 717, 188, 33);
		contentPane.add(btnRealizarReserva);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(TelaReserva.class.getResource("/Imagens/LogoHotel.png")));
		lblNewLabel_7.setBounds(556, 176, 350, 115);
		contentPane.add(lblNewLabel_7);
		
		JComboBox DataSaidabox_1 = new JComboBox();
		DataSaidabox_1.setEditable(true);
		DataSaidabox_1.setBackground(Color.WHITE);
		DataSaidabox_1.setBounds(1042, 396, 239, 22);
		contentPane.add(DataSaidabox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(345, 504, 239, 22);
		contentPane.add(comboBox);
	}
}
