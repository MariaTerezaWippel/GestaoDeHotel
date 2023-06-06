package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;

public class TelaExclusaoHospede extends JFrame {

	private JPanel contentPaneTela;
	private JTextField txtCPF;
	private JTextField txtTelefone;
	private JTextField txtQuatdPessoas;
	private JTextField txtCEP;
	private JTextField txtNumeroReserva;
	private JTextField txtCpf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExclusaoHospede frame = new TelaExclusaoHospede();
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
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(0, 0, 0));
		setTitle("Tela Exclusão de Hóspede");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPaneTela = new JPanel();
		contentPaneTela.setBackground(new Color(135, 206, 250));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneTela);
		contentPaneTela.setLayout(null);
		
	
		JLabel lblNewLabel_11 = new JLabel("Para excluir hóspede, digite seu CPF:");
		lblNewLabel_11.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_11.setBounds(72, 11, 231, 20);
		contentPaneTela.add(lblNewLabel_11);
		
		JLabel CPF1 = new JLabel("CPF:");
		CPF1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD, 12));
		CPF1.setBounds(100, 62, 37, 14);
		contentPaneTela.add(CPF1);
		
		txtCpf1 = new JTextField();
		/**********/
		MaskFormatter mascaraCPF1 = null;
		try {
			mascaraCPF1 = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtCpf1 = new JFormattedTextField(mascaraCPF1);
		/**********/
		
		txtCpf1.setBounds(132, 60, 163, 20);
		contentPaneTela.add(txtCpf1);
		txtCpf1.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setForeground(new Color(255, 255, 255));
		btnConfirmar.setBackground(new Color(0, 0, 128));
		btnConfirmar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 12));
		btnConfirmar.setBounds(72, 106, 104, 23);
		contentPaneTela.add(btnConfirmar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 12));
		btnVoltar.setBounds(201, 106, 104, 23);
		contentPaneTela.add(btnVoltar);


	}
}
