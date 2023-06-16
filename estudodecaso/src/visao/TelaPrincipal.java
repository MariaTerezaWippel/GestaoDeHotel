package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controle.ReservaDao;
import modelo.Reserva;

import java.awt.SystemColor;

public class TelaPrincipal extends JFrame {

	private JPanel contentPaneTela;
	private JTable table;
	private ArrayList<Reserva> listaReserva;

	public TelaPrincipal() {
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2000, 1500);
		contentPaneTela = new JPanel();
		contentPaneTela.setBackground(new Color(100, 149, 237));
		contentPaneTela.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneTela);
		contentPaneTela.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(548, 10, 46, 14);
		contentPaneTela.add(lblNewLabel_2);
		
		JLabel lblHotel = new JLabel("HotelBoulevard.com");
		lblHotel.setForeground(new Color(0, 0, 128));
		lblHotel.setBackground(new Color(255, 255, 255));
		lblHotel.setBounds(778, 115, 396, 41);
		lblHotel.setFont(new Font("Sitka Subheading", Font.BOLD, 42));
		contentPaneTela.add(lblHotel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(209, 292, 690, 476);
		contentPaneTela.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Quantidade de dias", "Serviço de quarto", "Diaria",  "Hospede"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(105);
		table.getColumnModel().getColumn(1).setPreferredWidth(106);
		table.getColumnModel().getColumn(2).setPreferredWidth(56);
		table.getColumnModel().getColumn(3).setPreferredWidth(98);
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("New label");
		scrollPane.setColumnHeaderView(label);
		
		JButton btncadastrarHospede = new JButton("Cadastrar Hospedes");
		btncadastrarHospede.setForeground(new Color(0, 0, 128));
		btncadastrarHospede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroHospede telaCadastroHospede = new TelaCadastroHospede();
				telaCadastroHospede.setLocationRelativeTo(null);
				telaCadastroHospede.setVisible(true);
				dispose();
			}
		});
		btncadastrarHospede.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		btncadastrarHospede.setBounds(1198, 261, 254, 47);
		contentPaneTela.add(btncadastrarHospede);
		
		JButton btnCadastrarFuncionrio = new JButton("Cadastrar Funcionario");
		btnCadastrarFuncionrio.setForeground(new Color(0, 0, 128));
		btnCadastrarFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroFuncionario telaCadastroFuncionario = new TelaCadastroFuncionario();
				telaCadastroFuncionario.setLocationRelativeTo(null);
				telaCadastroFuncionario.setVisible(true);
				dispose();
			}
		});
		btnCadastrarFuncionrio.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		btnCadastrarFuncionrio.setBounds(1198, 368, 254, 47);
		contentPaneTela.add(btnCadastrarFuncionrio);
		
		JButton btnReserva = new JButton("Reserva de Hospede");
		btnReserva.setForeground(new Color(0, 0, 128));
		btnReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaReserva telaReserva = new TelaReserva();
				telaReserva.setLocationRelativeTo(null);
				telaReserva.setVisible(true);
				dispose();
			}
		});
		btnReserva.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		btnReserva.setBounds(1198, 475, 254, 47);
		contentPaneTela.add(btnReserva);
		
		JButton btnEndereço = new JButton("Cadastrar Endereço");
		btnEndereço.setForeground(new Color(0, 0, 128));
		btnEndereço.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarEndereco telaCadastrarEndereco = new CadastrarEndereco();
				telaCadastrarEndereco.setLocationRelativeTo(null);
				telaCadastrarEndereco.setVisible(true);
				dispose();
			}
		});
		btnEndereço.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		btnEndereço.setBounds(1198, 589, 254, 47);
		contentPaneTela.add(btnEndereço);
		
		JButton btnVoltarPricipal = new JButton("Sair");
		btnVoltarPricipal.setForeground(new Color(255, 255, 255));
		btnVoltarPricipal.setBackground(new Color(0, 0, 255));
		btnVoltarPricipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLoginFuncionario telaLoginFuncionario = new TelaLoginFuncionario();
				telaLoginFuncionario.setLocationRelativeTo(null);
				telaLoginFuncionario.setVisible(true);
				dispose();
			}
		});
		btnVoltarPricipal.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		btnVoltarPricipal.setBounds(1198, 721, 254, 47);
		contentPaneTela.add(btnVoltarPricipal);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(155, 214, 249));
		panel.setBounds(209, 261, 690, 30);
		contentPaneTela.add(panel);
		
		JLabel lblNewLabel = new JLabel("RESERVAS");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/background.png")));
		lblNewLabel_1.setBounds(0, 0, 1949, 1061);
		contentPaneTela.add(lblNewLabel_1);
		atualizarTabela();
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	private void atualizarTabela() {
		var reservaDao  = new ReservaDao();
		DefaultTableModel tabela = new DefaultTableModel(new Object[][] {},
				new String[] { "Quantidade de dias", "Serviço de quarto", "Diaria",  "Hospede" });

		if (reservaDao.listaReserva() != null) {
			listaReserva = reservaDao.listaReserva();
			for (int i = 0; i < listaReserva.size(); i++) {
				Reserva reserva = listaReserva.get(i);
				tabela.addRow(new Object[] { reserva.getQuantidadeDedias(),reserva.getServicoQuarto(),reserva.getDiaria(),reserva.getHospede().getNome()});

			}
			table.setModel(tabela);
		}

	}
}