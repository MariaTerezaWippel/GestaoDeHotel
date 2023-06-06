package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTabbedPane;

public class TelaPagamento extends JFrame {

	private JPanel contentPane;
	private JTextField textPrecoDiaria;
	private JTextField textTotalapagar;

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
		lblNewLabel.setBounds(664, 279, 141, 56);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblServioDeQuarto = new JLabel("Serviço de Quarto :");
		lblServioDeQuarto.setBounds(664, 346, 220, 56);
		lblServioDeQuarto.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblServioDeQuarto);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar : ");
		lblTotalAPagar.setBounds(664, 470, 153, 56);
		lblTotalAPagar.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblTotalAPagar);
		
		JLabel lblFormaPagamento = new JLabel("Forma de pagamento : ");
		lblFormaPagamento.setBounds(664, 559, 228, 56);
		lblFormaPagamento.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblFormaPagamento);
		
		/**********/
		MaskFormatter mascaraPrecoDiaria = null;
		try {
			mascaraPrecoDiaria = new MaskFormatter("#######");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		textPrecoDiaria = new JFormattedTextField(mascaraPrecoDiaria);
		/**********/
		
		textPrecoDiaria.setBounds(811, 301, 153, 20);
		contentPane.add(textPrecoDiaria);
		textPrecoDiaria.setColumns(10);
		JButton btnNewButton_2 = new JButton("Finalizar ");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 128));
		btnNewButton_2.setBounds(690, 712, 228, 56);
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
		contentPane.add(btnNewButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sim");
		rdbtnNewRadioButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		rdbtnNewRadioButton.setBackground(new Color(135, 206, 250));
		rdbtnNewRadioButton.setBounds(664, 409, 68, 34);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Não");
		rdbtnNewRadioButton_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		rdbtnNewRadioButton_1.setBackground(new Color(135, 206, 250));
		rdbtnNewRadioButton_1.setBounds(749, 409, 68, 34);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(664, 626, 288, 22);
		comboBox.addItem("                                  -SELECIONE-     ");
		//ArrayList<String>opcoes = dao.listarTodos();
		//For (String opcao; opcoes){
		//	comboBox.addItem(opcao);
		//}
		contentPane.add(comboBox);
		
		
		/**********/
		MaskFormatter mascaraTotalapagar = null;
		try {
			mascaraTotalapagar = new MaskFormatter("#######");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		textTotalapagar = new JFormattedTextField(mascaraTotalapagar);
		/**********/
		textTotalapagar.setBounds(811, 492, 153, 20);
		contentPane.add(textTotalapagar);
		textTotalapagar.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(TelaPagamento.class.getResource("/Imagens/LogoHotel.png")));
		lblNewLabel_1.setBounds(528, 181, 364, 82);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(TelaPagamento.class.getResource("/Imagens/icon.png")));
		lblNewLabel_2.setBounds(-622, -95, 1293, 520);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(TelaPagamento.class.getResource("/Imagens/Design sem nome (1).png")));
		lblNewLabel_3.setBounds(-622, 408, 1232, 425);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_4.setIcon(new ImageIcon(TelaPagamento.class.getResource("/Imagens/Design sem nome (2).png")));
		lblNewLabel_4.setBounds(448, 0, 1087, 425);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(TelaPagamento.class.getResource("/Imagens/Design sem nome.png")));
		lblNewLabel_5.setBounds(380, 408, 1185, 425);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Pagamento");
		lblNewLabel_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_6.setBounds(690, 104, 216, 66);
		contentPane.add(lblNewLabel_6);
	}
}
