package modelo;

public class Endereco {

	private Long Cep;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	
	public Endereco() {
}
	

	public Endereco(Long cep) {
		Cep = cep;
	}


	public Endereco(Long cep, String estado, String cidade, String bairro, String rua) {
		Cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
	}

	public Long getCep() {
		return Cep;
	}

	public void setCep(Long cep) {
		Cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	

	
}