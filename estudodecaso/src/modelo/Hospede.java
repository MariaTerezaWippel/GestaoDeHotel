package modelo;

import java.util.ArrayList;

public class Hospede extends Pessoa {

	private String dataNascimento;
	private Long telefone;
	private Endereco endereco;
	private ArrayList<Reserva> listReserva;
	
	
	
	public Hospede() {
		
	}

	public Hospede(String string, long l, String string2, int i, long m, Endereco endereco2) {

	}
	

	public Hospede(String nome, Long cpf, String email, String dataNascimento, Long telefone, Endereco endereco) {
		super(nome, cpf, email);
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}


	public Hospede(String nome, Long cpf, String email, String dataNascimento, Long telefone,
			Endereco endereco, ArrayList<Reserva> listReserva) {
		super( nome, cpf, email);
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.listReserva = listReserva;
	}




	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Reserva> getListReserva() {
		return listReserva;
	}

	public void setListReserva(ArrayList<Reserva> listReserva) {
		this.listReserva = listReserva;
	}

}