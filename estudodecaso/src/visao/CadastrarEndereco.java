package visao;

import java.awt.Color; 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Controle.EnderecoDao;
import Controle.HospedeDao;
import modelo.Endereco;
import modelo.Hospede;
import javax.swing.JComboBox;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.ImageIcon;

public class CadastrarEndereco extends JFrame {

	private JPanel contentPane;
	private JTextField txtCep;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtRua;
	private ArrayList<String>listaEstados;
	private JComboBox cbxEstados;

	public CadastrarEndereco() {
		setTitle("Tela Cadastro Endereço");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2000, 2000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("CEP:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(684, 298, 60, 32);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Estado:");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBounds(684, 346, 94, 32);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Cidade:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_3.setBounds(684, 401, 94, 32);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Bairro:");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_4.setBounds(684, 451, 83, 32);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Rua:");
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_5.setBounds(684, 503, 46, 32);
		contentPane.add(lblNewLabel_5);

		/**********/
		MaskFormatter mascaraCep1 = null;
		try {
			mascaraCep1 = new MaskFormatter("#####-###");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtCep = new JFormattedTextField(mascaraCep1);
		/**********/

		txtCep.setBounds(741, 306, 129, 24);
		contentPane.add(txtCep);
		txtCep.setColumns(10);

		txtCidade = new JTextField();
		txtCidade.setBounds(771, 409, 204, 24);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);

		txtBairro = new JTextField();
		txtBairro.setBounds(759, 459, 216, 24);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);

		txtRua = new JTextField();
		txtRua.setBounds(740, 511, 235, 24);
		contentPane.add(txtRua);
		txtRua.setColumns(10);

		JButton btnEndereco = new JButton("Cadastrar ");
		btnEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String erros = "";

				String cep = txtCep.getText().replace("-", "");
				String cidade = txtCidade.getText();
				String bairro = txtBairro.getText();
				String rua = txtRua.getText();
				String estado =(String) cbxEstados.getSelectedItem();

				Endereco endereco = new Endereco();
				endereco.setEstado(estado);
				
				if (cep == null || cep.trim() == "" || cep.isEmpty()) {
					erros += " Cep\n";
				} else {
					Long cepInt = Long.valueOf(cep);
					endereco.setCep(cepInt);
				}

				if (bairro == null || bairro.trim() == "" || bairro.isEmpty()) {
					erros += " Bairro\n";
				} else {
					endereco.setBairro(bairro);
				}
				if (cidade == null || cidade.trim() == "" || cidade.isEmpty()) {
					erros += " Cidade\n";
				} else {
					endereco.setCidade(cidade);
				}
				if (rua == null || rua.trim() == "" || rua.isEmpty()) {
					erros += " Rua\n";
				} else {
					endereco.setRua(rua);
				}
				if (erros.trim() != "") {
					JOptionPane.showMessageDialog(null, "Dados inválidos\n" + erros);
					return;
				}
				EnderecoDao enderecoDao = new EnderecoDao();
				enderecoDao.getIntancia();
				boolean retornoEndereco = enderecoDao.inserirEndereco(endereco);
				if (retornoEndereco == true) {
					JOptionPane.showMessageDialog(null, "Endereço cadastrado");
					limparDados();
				} else {
					JOptionPane.showMessageDialog(null, "Erro, endereço não cadastrado");
					limparDados();
				}

			}
		});
		btnEndereco.setBackground(new Color(0, 0, 128));
		btnEndereco.setForeground(new Color(255, 255, 255));
		btnEndereco.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnEndereco.setBounds(791, 602, 173, 58);
		contentPane.add(btnEndereco);

		JButton btnEditarEnde = new JButton("Alterar");
		btnEditarEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String erros = "";

				String cep = txtCep.getText().replace("-", "");
				String cidade = txtCidade.getText();
				String bairro = txtBairro.getText();
				String rua = txtRua.getText();

				Endereco endereco = new Endereco();
				String estado =(String) cbxEstados.getSelectedItem();

				endereco.setEstado(estado);

				if (cep == null || cep.trim() == "" || cep.isEmpty()) {
					erros += " Cep\n";
				} else {
					Long cepInt = Long.valueOf(cep);
					endereco.setCep(cepInt);
				}

				if (bairro == null || bairro.trim() == "" || bairro.isEmpty()) {
					erros += " Bairro\n";
				} else {
					endereco.setBairro(bairro);
				}
				if (cidade == null || cidade.trim() == "" || cidade.isEmpty()) {
					erros += " Cidade\n";
				} else {
					endereco.setCidade(cidade);
				}
				if (rua == null || rua.trim() == "" || rua.isEmpty()) {
					erros += " Rua\n";
				} else {
					endereco.setRua(rua);
				}
				if (erros.trim() != "") {
					JOptionPane.showMessageDialog(null, "Dados inválidos\n" + erros);
					return;
				}
				EnderecoDao enderecoDao = new EnderecoDao();
				boolean retornoEndereco = enderecoDao.alterarEndereco(endereco);
				if (retornoEndereco == true) {
					JOptionPane.showMessageDialog(null, "Endereço alterado");
					limparDados();
				} else {
					JOptionPane.showMessageDialog(null, "Erro, endereco não alterado");
					limparDados();
				}

			}
		});
		btnEditarEnde.setBackground(new Color(0, 0, 255));
		btnEditarEnde.setForeground(new Color(255, 255, 255));
		btnEditarEnde.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnEditarEnde.setBounds(1005, 602, 173, 58);
		contentPane.add(btnEditarEnde);

		JButton btnExcluirEnde = new JButton("Excluir");
		btnExcluirEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String erros = "";

				Endereco endereco = new Endereco();

				String cep = txtCep.getText().replace("-", "");

				if (cep == null || cep.trim() == "" || cep.isEmpty()) {
					erros += " Cep\n";
				} else {
					Long cepInt = Long.valueOf(cep);
					endereco.setCep(cepInt);
				}
				EnderecoDao enderecoDao = new EnderecoDao();
				boolean retornoEndereco = enderecoDao.deletarEndereco(endereco);
				if (retornoEndereco == true) {
					JOptionPane.showMessageDialog(null, "Endereço excluido");
					limparDados();
				} else {
					JOptionPane.showMessageDialog(null, "Erro, exclusao não realizada");
					limparDados();
				}

			}
		});
		btnExcluirEnde.setForeground(new Color(0, 0, 255));
		btnExcluirEnde.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnExcluirEnde.setBounds(1005, 695, 170, 58);
		contentPane.add(btnExcluirEnde);

		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 255));
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setLocationRelativeTo(null);
				telaPrincipal.setVisible(true);
				dispose();

			}
		});
		btnNewButton_1.setBounds(791, 695, 170, 58);
		contentPane.add(btnNewButton_1);
		
		cbxEstados = new JComboBox();
		cbxEstados.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				listaEstados = new ArrayList<>();
				listaEstados = listaEstado();
				for(int i = 0; i < listaEstados.size();i++) {
					cbxEstados.addItem(listaEstados.get(i));
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		cbxEstados.setBounds(771, 354, 138, 24);
		contentPane.add(cbxEstados);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cep = txtCep.getText().replace("-", "");
				Endereco endereco = new Endereco();
				endereco.setCep(Long.parseLong(cep));
				listaEndereco(endereco);
			}
		});
		btnNewButton.setBounds(1078, 298, 173, 37);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(0, 0, 1924, 53);
		contentPane.add(panel);
		
		JLabel lblNewLabel_7 = new JLabel("Cadastrar Endereço");
		lblNewLabel_7.setForeground(new Color(0, 0, 128));
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 42));
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CadastrarEndereco.class.getResource("/Imagens/background.png")));
		lblNewLabel.setBounds(0, 0, 2251, 1141);
		contentPane.add(lblNewLabel);
	}

	public void limparDados() {
		txtCep.setText("");
		txtCidade.setText("");
		txtBairro.setText("");
		txtRua.setText("");

	}
	public static ArrayList<String>listaEstado(){
		ArrayList<String>listaEstados= new ArrayList<>();
		listaEstados.add("SC");
		listaEstados.add("RS");
		listaEstados.add("PR");
		return listaEstados;
		
	}
	public void listaEndereco(Endereco endereco) {
	EnderecoDao	enderecoDao = new EnderecoDao();
	enderecoDao.getIntancia();
	Endereco enderecoNovo = new  Endereco();
	enderecoNovo=  enderecoDao.consultarEndereco(endereco);
	txtCep.setText(String.valueOf(enderecoNovo.getCep()));
    txtCidade.setText(enderecoNovo.getCidade());
	txtBairro.setText(enderecoNovo.getBairro());
	txtRua.setText(enderecoNovo.getRua());
	cbxEstados.setSelectedItem(enderecoNovo.getEstado());
	
	}
}