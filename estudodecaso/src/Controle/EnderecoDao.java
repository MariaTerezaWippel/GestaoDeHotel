package Controle;

import java.util.ArrayList;

import modelo.Endereco;
import modelo.Funcionario;

public class EnderecoDao {
private static ArrayList<Endereco> listaEndereco;
private static EnderecoDao enderecoDao;
public static EnderecoDao getIntancia() {
	if (enderecoDao == null) {
		enderecoDao = new EnderecoDao();
		listaEndereco = new ArrayList<Endereco>();
		listaEndereco.add(
				new Endereco(89110000l, "sc", "gaspar", "mg", "itajai"));
		}
	return enderecoDao;
	}

public boolean inserirEndereco(Endereco endereco) {
	if (endereco != null) {
		EnderecoDao.listaEndereco.add(endereco);
		return true;
		}
	return false;
	}

public boolean deletarEndereco(Endereco endereco) {
	for (Endereco e : listaEndereco) {
		if (e.getCep().equals(endereco.getCep())) {
			listaEndereco.remove(e);
			return true;
			}
		}
	return false;
	}

public boolean alterarEndereco(Endereco endereco) {
	for (Endereco e : listaEndereco) {

		if (e.getCep().equals(endereco.getCep())) {
			e.setBairro(endereco.getBairro());
			e.setCidade(endereco.getCidade());
			e.setEstado(endereco.getEstado());
			e.setRua(endereco.getRua());
			return true;
			}
		}
	return false;
	}

public Endereco consultarEndereco(Endereco endereco) {
	Endereco ende = new Endereco();
	for (Endereco e : listaEndereco) {
		if (e.getCep().equals(endereco.getCep())) {
			ende.setBairro(endereco.getBairro());
			ende.setCidade(endereco.getCidade());
			ende.setEstado(endereco.getEstado());
			ende.setRua(endereco.getRua());
			return ende;
			}
		}
	return null;
	}

public ArrayList<Endereco> listaEndereco() {
	return EnderecoDao.listaEndereco;
	}

public boolean verificarEndereco(Endereco endereco) {
	Endereco ende = new Endereco();
	for (Endereco e : listaEndereco) {
		if (e.getCep().equals(endereco.getCep())) {
			return true;
			}
		}
	return false;
	}
}
