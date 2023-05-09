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
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Scrollbar;
import java.awt.ScrollPane;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class TelaReserva extends JFrame {

	private JPanel contentPane;
	private JTextField txtDataEntra;
	private JTextField txtDataSaida;
	private JTextField txtTipoQuarto;
	private JTextField txtNumReserva;
	private JTextField txtQuatdPessoas;

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

		lblNewLabel.setBounds(573, 228, 158, 14);
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(463, 318, 158, 14);

		contentPane.add(lblNewLabel);
		
		txtDataEntra = new JTextField();
		txtDataEntra.setBounds(651, 318, 119, 20);
		contentPane.add(txtDataEntra);
		txtDataEntra.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Reserva da Hospedagem");

		lblNewLabel_1.setBounds(573, 57, 363, 27);
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 26));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Saída:");
		lblNewLabel_2.setBounds(591, 284, 128, 14);
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 48));
		lblNewLabel_1.setBounds(362, 85, 568, 58);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel2 = new JLabel("Data de Saída:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(481, 370, 128, 14);

		contentPane.add(lblNewLabel_2);
		
		txtDataSaida = new JTextField();
		txtDataSaida.setBounds(651, 370, 119, 20);
		contentPane.add(txtDataSaida);
		txtDataSaida.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de Quarto:");

		lblNewLabel_3.setBounds(573, 332, 161, 27);
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(468, 412, 161, 27);

		contentPane.add(lblNewLabel_3);
		
		txtTipoQuarto = new JTextField();
		txtTipoQuarto.setBounds(651, 418, 133, 20);
		contentPane.add(txtTipoQuarto);
		txtTipoQuarto.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Número da Reserva:");

		lblNewLabel_4.setBounds(528, 397, 201, 14);
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));

		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(428, 480, 201, 14);

		contentPane.add(lblNewLabel_4);
		
		txtNumReserva = new JTextField();
		txtNumReserva.setBounds(651, 480, 58, 20);
		contentPane.add(txtNumReserva);
		txtNumReserva.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade de Pessoas:");
		lblNewLabel_5.setBounds(402, 532, 233, 27);
		lblNewLabel_5.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));


		lblNewLabel_5.setBounds(402, 532, 233, 14);

		contentPane.add(lblNewLabel_5);
		
		txtQuatdPessoas = new JTextField();
		txtQuatdPessoas.setBounds(651, 532, 86, 20);
		contentPane.add(txtQuatdPessoas);
		txtQuatdPessoas.setColumns(10);
		
		Button ButRealizarReserva = new Button("Realizar Reserva");
		ButRealizarReserva.setBackground(SystemColor.textHighlight);
		ButRealizarReserva.setForeground(new Color(255, 255, 255));
		ButRealizarReserva.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		ButRealizarReserva.setBounds(551, 678, 173, 32);
		contentPane.add(ButRealizarReserva);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(SystemColor.activeCaption);
		editorPane.setBounds(376, 297, 455, 278);
		contentPane.add(editorPane);
		
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
		verticalStrut_1.setBounds(1208, 34, 26, 880);
		contentPane.add(verticalStrut_1);
	}
}
