package modelo;

public abstract class Pessoa {

	private String nome;
	private Long cpf;
	private String email;
	
	public Pessoa() {
		
	}
	
	public Pessoa( String nome, Long cpf, String email) {
	
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
