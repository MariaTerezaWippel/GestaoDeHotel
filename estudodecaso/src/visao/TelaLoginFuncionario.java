package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.FuncionarioDao;
import modelo.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Canvas;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Panel;

public class TelaLoginFuncionario extends JFrame {

	private JPanel contentPaneTela;
	private JTextField txtEmail;
	private JTextField txtFraseSecreta;

	private ArrayList<Funcionario> listaFuncionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginFuncionario frame = new TelaLoginFuncionario();
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
	public TelaLoginFuncionario() {
		setExtendedState(MAXIMIZED_BOTH);
		setTitle("Tela Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2000, 2000);
		contentPaneTela = new JPanel();
		contentPaneTela.setBackground(new Color(135, 206, 250));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneTela);
		contentPaneTela.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(155, 214, 249));
		panel.setBounds(703, 147, 534, 660);
		contentPaneTela.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(244, 5, 46, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(51, 61, 46, 14);
		panel.add(lblNewLabel_3);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(161, 481, 211, 44);
		panel.add(btnLogin);

		btnLogin.setBackground(new Color(0, 0, 128));

		btnLogin.setBackground(new Color(25, 25, 112));

		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Sitka Subheading", Font.BOLD, 23));

		txtEmail = new JTextField();
		txtEmail.setBounds(226, 306, 217, 28);
		panel.add(txtEmail);
		txtEmail.setForeground(Color.BLACK);
		txtEmail.setColumns(10);

		txtFraseSecreta = new JTextField();
		txtFraseSecreta.setBounds(226, 361, 217, 28);
		panel.add(txtFraseSecreta);
		txtFraseSecreta.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_5.setBounds(86, 306, 75, 28);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Senha Secreta:");
		lblNewLabel_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_6.setBounds(86, 368, 157, 21);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_1 = new JLabel("Hotel Boulevard");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(112, 83, 485, 44);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaLoginFuncionario.class.getResource("/Imagens/background.png")));
		lblNewLabel.setBounds(0, 0, 1924, 1027);
		contentPaneTela.add(lblNewLabel);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String erros = "";
				String email = txtEmail.getText();
				String fraseSecreta = txtFraseSecreta.getText();
				FuncionarioDao funcionarioDao = FuncionarioDao.getIntancia();
				Funcionario funcionario = new Funcionario();
				if (email == null || email.trim() == "" || email.isEmpty()) {
					erros += "email\n";
				} else {
					funcionario.setEmail(email);

				}
				if (fraseSecreta == null || fraseSecreta.trim() == "" || fraseSecreta.isEmpty()) {
					erros += "fraseSecreta\n";
				} else {
					funcionario.setFraseSecreta(fraseSecreta);
				}
				if (erros.trim() != "") {
					JOptionPane.showMessageDialog(null, "Dados inválidos\n" + erros);
					return;
				} else {
					boolean retornoLogin = funcionarioDao.loginFuncionario(funcionario);
					if (retornoLogin == true) {
						TelaPrincipal telaPrincipal = new TelaPrincipal();
						telaPrincipal.setLocationRelativeTo(null);
						telaPrincipal.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Funcionario não existente");
					}
				}
			}
		});

	}
}
