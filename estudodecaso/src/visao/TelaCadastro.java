package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import modelo.Hospede;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

import java.awt.Button;

public class TelaCadastro extends JFrame {

	private JPanel contentPaneTela;
	private JTextField txtNome;
	private JTextField txtDataNascimento;
	private JTextField txtCep;
	private JTable table;
	private DefaultTableModel dataModel;
	private JTextField txtCpf;
	private JTextField textField_1;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * CONSTRUTOR DA CLASSE
	 */
	public TelaCadastro() {
		setTitle("Tela Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 991);
		contentPaneTela = new JPanel();
		contentPaneTela.setBackground(new Color(135, 206, 250));
		contentPaneTela.setForeground(new Color(0, 0, 0));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneTela);
		contentPaneTela.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(495, 253, 75, 21);

		contentPaneTela.add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setForeground(new Color(240, 248, 255));
		txtNome.setBounds(495, 290, 405, 21);
		contentPaneTela.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(495, 322, 66, 21);
		contentPaneTela.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(495, 385, 66, 21);

		contentPaneTela.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Telefone:");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(495, 446, 95, 21);

		contentPaneTela.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento:");
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(495, 509, 205, 21);
		contentPaneTela.add(lblNewLabel_4);

		/**********/
		MaskFormatter mascaraDataNasc = null;
		try {
			mascaraDataNasc = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtDataNascimento = new JFormattedTextField(mascaraDataNasc);
		/**********/
		txtDataNascimento.setBounds(495, 534, 98, 20);
		contentPaneTela.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("CEP:");
		lblNewLabel_6.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_6.setBounds(495, 565, 46, 14);

		contentPaneTela.add(lblNewLabel_6);

		/**********/
		MaskFormatter mascaraCep = null;
		try {
			mascaraCep = new MaskFormatter("#####-###");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtCep = new JFormattedTextField(mascaraCep);
		/**********/
		
		txtCep.setBounds(495, 590, 177, 20);
		contentPaneTela.add(txtCep);
		txtCep.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(928, 252, 518, 354);
		contentPaneTela.add(scrollPane);

		table = new JTable();
		dataModel = new DefaultTableModel(new Object[][] {}, new String[] { "Email", "Cpf", "Nome" });
		table.setModel(dataModel);
		scrollPane.setViewportView(table);

		JLabel lblNewLabel_7 = new JLabel(" Cadastro do Hóspede");
		lblNewLabel_7.setForeground(new Color(0, 0, 128));
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_7.setBounds(721, 70, 424, 48);
		contentPaneTela.add(lblNewLabel_7);

		/**********/
		MaskFormatter mascaraCpf = null;
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtCpf = new JFormattedTextField(mascaraCpf);
		/**********/
		
		txtCpf.setBounds(495, 354, 184, 20);
		contentPaneTela.add(txtCpf);
		txtCpf.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(495, 415, 403, 20);
		contentPaneTela.add(textField_1);
		textField_1.setColumns(10);
        
		/**********/
		MaskFormatter mascaraTel = null;
		 try {
		      mascaraTel = new MaskFormatter("(##) ####-####");
		 } catch (ParseException e) {
		      e.printStackTrace();
		 }
		txtTelefone = new JFormattedTextField(mascaraTel);
		/**********/
		
		txtTelefone.setBounds(495, 478, 184, 20);
		contentPaneTela.add(txtTelefone);
		txtTelefone.setColumns(10);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(832, 670, 148, 38);
		contentPaneTela.add(btnNewButton);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(TelaCadastro.class.getResource("/Imagens/LogoHotel.png")));
		lblNewLabel_5.setBounds(646, 143, 334, 79);
		contentPaneTela.add(lblNewLabel_5);

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(TelaCadastro.class.getResource("/Imagens/icon.png")));
		lblNewLabel_8.setBounds(-622, -110, 1183, 550);
		contentPaneTela.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(TelaCadastro.class.getResource("/Imagens/Design sem nome (1).png")));
		lblNewLabel_9.setBounds(-622, 408, 1232, 425);
		contentPaneTela.add(lblNewLabel_9);

	}
}
