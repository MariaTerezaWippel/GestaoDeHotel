package Controle;

import java.util.ArrayList;

import modelo.Endereco;
import modelo.Funcionario;
import modelo.Hospede;
import modelo.Reserva;

public class HospedeDao {

	private static ArrayList<Hospede> listaHospede;

	private static HospedeDao hospedeDao;

	public static HospedeDao getIntancia() {
		if (hospedeDao == null) {
			hospedeDao = new HospedeDao();
			listaHospede = new ArrayList<Hospede>();

		}
		return hospedeDao;
	}

	public boolean inserirHospede(Hospede hospede) {
		if (hospede != null) {
			HospedeDao.listaHospede.add(hospede);
			return true;
		}
		return false;
	}

	public boolean deletarHospede(Hospede hospede) {
		for (Hospede h : listaHospede) {
			if (h.getCpf().equals(hospede.getCpf())) {
				listaHospede.remove(h);
				return true;
			}
		}
		return false;
	}

	public boolean alterarHospede(Hospede hospede) {
		for (Hospede h : listaHospede) {

			if (h.getCpf().equals(hospede.getCpf())) {
				h.setDataNascimento(hospede.getDataNascimento());
				h.setEmail(hospede.getEmail());
				h.setEndereco(hospede.getEndereco());
				h.setTelefone(hospede.getTelefone());
				h.setNome(hospede.getNome());
				return true;
			}
		}
		return false;
	}

	public Hospede consultarHospede(Hospede hospede) {
		Hospede hosp = new Hospede();
		for (Hospede h : listaHospede) {

			if (h.getCpf().equals(hospede.getCpf())) {
				hosp.setCpf(h.getCpf());
				hosp.setDataNascimento(h.getDataNascimento());
				hosp.setEmail(h.getEmail());
				hosp.setEndereco(h.getEndereco());
				hosp.setTelefone(h.getTelefone());
				hosp.setNome(h.getNome());
				return hosp;
			}
		}
		return null;
	}

	public ArrayList<Hospede> listaHospede() {
		return HospedeDao.listaHospede;
	}
}