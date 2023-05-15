package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;

public class TelaPagamento extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPagamento frame = new TelaPagamento();
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
	public TelaPagamento() {
		setTitle("Tela Pagamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setForeground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Preço Diária : ");
		lblNewLabel.setBounds(693, 297, 141, 56);
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblServioDeQuarto = new JLabel("Serviço de Quarto :");
		lblServioDeQuarto.setBounds(693, 364, 220, 56);
		lblServioDeQuarto.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblServioDeQuarto);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar : ");
		lblTotalAPagar.setBounds(693, 489, 244, 56);
		lblTotalAPagar.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblTotalAPagar);
		
		JLabel lblFormaPagamento = new JLabel("Forma de pagamento : ");
		lblFormaPagamento.setBounds(693, 577, 228, 56);
		lblFormaPagamento.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		contentPane.add(lblFormaPagamento);
		
		JButton btnNewButton_2 = new JButton("Finalizar ");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 128));
		btnNewButton_2.setBounds(719, 750, 228, 56);
		btnNewButton_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 24));
		contentPane.add(btnNewButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sim");
		rdbtnNewRadioButton.setBackground(new Color(135, 206, 250));
		rdbtnNewRadioButton.setBounds(693, 427, 68, 34);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Não");
		rdbtnNewRadioButton_1.setBackground(new Color(135, 206, 250));
		rdbtnNewRadioButton_1.setBounds(778, 427, 68, 34);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(693, 644, 288, 22);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(824, 318, 153, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(824, 510, 153, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(TelaPagamento.class.getResource("/Imagens/LogoHotel.png")));
		lblNewLabel_1.setBounds(594, 184, 364, 82);
		contentPane.add(lblNewLabel_1);
		
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
		tabbedPaneMenu.addTab("LISTAGEM DE HÓSPEDE", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPaneMenu.addTab("EXCLUSÃO DE HÓSPEDE", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPaneMenu.addTab("CHECK-IN", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPaneMenu.addTab("PAGAMENTO", null, panel_6, null);
	}
}
