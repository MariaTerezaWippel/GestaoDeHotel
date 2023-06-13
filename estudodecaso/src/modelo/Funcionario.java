package modelo;

public class Funcionario extends Pessoa {

	private String cargo;
	private String fraseSecreta;
	public Funcionario() {
		
	}

	public Funcionario(String nome, Long cpf, String email, String cargo, String fraseSecreta) {
		super(nome, cpf, email);
		this.cargo = cargo;
		this.fraseSecreta = fraseSecreta;
	}




	public String getFraseSecreta() {
		return fraseSecreta;
	}


	public void setFraseSecreta(String fraseSecreta) {
		this.fraseSecreta = fraseSecreta;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}

