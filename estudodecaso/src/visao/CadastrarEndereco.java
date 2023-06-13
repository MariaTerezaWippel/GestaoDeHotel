package visao;

import java.awt.Color; 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

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

public class CadastrarEndereco extends JFrame {

	private JPanel contentPane;
	private JTextField txtCep;
	private JTextField txtEstado;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtRua;

	public CadastrarEndereco() {
		setTitle("Tela Cadastro Endereço");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2000, 2000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cadastrar Endereço");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("DejaVu Sans Mono", Font.BOLD, 24));
		lblNewLabel.setBounds(754, 103, 293, 32);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("CEP:");
		lblNewLabel_1.setFont(new Font("DejaVu Sans Mono", Font.BOLD, 18));
		lblNewLabel_1.setBounds(619, 228, 46, 32);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Estado:");
		lblNewLabel_2.setFont(new Font("DejaVu Sans Mono", Font.BOLD, 18));
		lblNewLabel_2.setBounds(619, 276, 94, 32);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Cidade:");
		lblNewLabel_3.setFont(new Font("DejaVu Sans Mono", Font.BOLD, 18));
		lblNewLabel_3.setBounds(619, 331, 94, 32);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Bairro:");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4.setBounds(619, 381, 60, 32);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Rua:");
		lblNewLabel_5.setFont(new Font("DejaVu Sans Mono", Font.BOLD, 18));
		lblNewLabel_5.setBounds(619, 433, 46, 32);
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

		txtCep.setBounds(741, 236, 129, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);

		txtEstado = new JTextField();
		txtEstado.setBounds(741, 287, 39, 20);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);

		txtCidade = new JTextField();
		txtCidade.setBounds(741, 342, 129, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);

		txtBairro = new JTextField();
		txtBairro.setBounds(741, 390, 129, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);

		txtRua = new JTextField();
		txtRua.setBounds(740, 442, 169, 20);
		contentPane.add(txtRua);
		txtRua.setColumns(10);

		JButton btnEndereco = new JButton("Cadastrar ");
		btnEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String erros = "";

				String cep = txtCep.getText().replace("-", "");
				String estado = txtEstado.getText();
				String cidade = txtCidade.getText();
				String bairro = txtBairro.getText();
				String rua = txtRua.getText();

				Endereco endereco = new Endereco();

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
		btnEndereco.setBackground(new Color(255, 255, 255));
		btnEndereco.setForeground(new Color(0, 0, 255));
		btnEndereco.setFont(new Font("DejaVu Sans Mono", Font.BOLD, 20));
		btnEndereco.setBounds(963, 230, 170, 32);
		contentPane.add(btnEndereco);

		JButton btnEditarEnde = new JButton("Editar");
		btnEditarEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String erros = "";

				String cep = txtCep.getText().replace("-", "");
				String estado = txtEstado.getText();
				String cidade = txtCidade.getText();
				String bairro = txtBairro.getText();
				String rua = txtRua.getText();

				Endereco endereco = new Endereco();

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
		btnEditarEnde.setBackground(new Color(255, 255, 255));
		btnEditarEnde.setForeground(new Color(0, 0, 255));
		btnEditarEnde.setFont(new Font("DejaVu Sans Mono", Font.BOLD, 20));
		btnEditarEnde.setBounds(960, 287, 173, 32);
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
		btnExcluirEnde.setFont(new Font("Dialog", Font.BOLD, 20));
		btnExcluirEnde.setBounds(963, 342, 170, 37);
		contentPane.add(btnExcluirEnde);

		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setFont(new Font("DejaVu Sans Mono", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setLocationRelativeTo(null);
				telaPrincipal.setVisible(true);
				dispose();

			}
		});
		btnNewButton_1.setBounds(972, 491, 120, 37);
		contentPane.add(btnNewButton_1);
	}

	public void limparDados() {
		txtCep.setText("");
		txtEstado.setText("");
		txtCidade.setText("");
		txtBairro.setText("");
		txtRua.setText("");

	}
}