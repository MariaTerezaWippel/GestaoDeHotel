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
	private JTextField txtTipoQuarto;
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
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data de Entrada:");
		lblNewLabel.setBounds(126, 285, 158, 14);
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Reserva da Hospedagem");
		lblNewLabel_1.setBounds(363, 86, 568, 58);
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Saída:");
		lblNewLabel_2.setBounds(648, 285, 128, 14);
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 48));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel2 = new JLabel("Data de Saída:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de Quarto:");
		lblNewLabel_3.setBounds(123, 381, 161, 27);
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPane.add(lblNewLabel_3);
		
		txtTipoQuarto = new JTextField();
		txtTipoQuarto.setBounds(126, 419, 239, 20);
		contentPane.add(txtTipoQuarto);
		txtTipoQuarto.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Número da Reserva:");
		lblNewLabel_4.setBounds(648, 387, 201, 14);
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPane.add(lblNewLabel_4);
		
		txtNumReserva = new JTextField();
		txtNumReserva.setBounds(648, 419, 239, 20);
		contentPane.add(txtNumReserva);
		txtNumReserva.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade de Pessoas:");
		lblNewLabel_5.setBounds(126, 494, 233, 27);
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		contentPane.add(lblNewLabel_5);
		
		txtQuatdPessoas = new JTextField();
		txtQuatdPessoas.setBounds(126, 532, 239, 20);
		contentPane.add(txtQuatdPessoas);
		txtQuatdPessoas.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(10, 925, 1224, 27);
		contentPane.add(horizontalStrut);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(0, 34, 26, 880);
		contentPane.add(verticalStrut);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(10, 0, 1224, 27);
		contentPane.add(horizontalStrut_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setBounds(1217, 34, 17, 880);
		contentPane.add(verticalStrut_1);
		
		JLabel lblNewLabel_6 = new JLabel("Nome Completo:");
		lblNewLabel_6.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_6.setBounds(126, 186, 188, 20);
		contentPane.add(lblNewLabel_6);
		
		txtNomecomple = new JTextField();
		txtNomecomple.setBounds(126, 221, 936, 20);
		contentPane.add(txtNomecomple);
		txtNomecomple.setColumns(10);
		
		JComboBox DataEntradabox = new JComboBox();
		DataEntradabox.setEditable(true);
		DataEntradabox.setBackground(new Color(255, 255, 255));
		DataEntradabox.setBounds(126, 318, 239, 22);
		contentPane.add(DataEntradabox);
		
		JComboBox DataSaidabox = new JComboBox();
		DataSaidabox.setEditable(true);
		DataSaidabox.setBounds(646, 318, 239, 22);
		contentPane.add(DataSaidabox);
		
		JButton btnRealizarReserva = new JButton("Realizar Reserva");
		btnRealizarReserva.setBackground(new Color(0, 0, 128));
		btnRealizarReserva.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		btnRealizarReserva.setBounds(500, 665, 188, 33);
		contentPane.add(btnRealizarReserva);
	}
}
