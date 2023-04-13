package modelo;

public class Hospedagem {
	
	private Long cpf;
	private String nome;
	private String dataNascimento;
	private Long telefone;
	private Long cep;
	private String email;
	private Integer numeroPessoas;
	
	
	public Hospedagem() {
	}
	public Hospedagem(Long cpf, String nome, String dataNascimento, Long telefone, Long cep, String email,
			Integer numeroPessoas) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.cep = cep;
		this.email = email;
		this.numeroPessoas = numeroPessoas;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getNumeroPessoas() {
		return numeroPessoas;
	}
	public void setNumeroPessoas(Integer numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}
	@Override
	public String toString() {
		return "Hospedagem [cpf=" + cpf + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", telefone="
				+ telefone + ", cep=" + cep + ", email=" + email + ", numeroPessoas=" + numeroPessoas + "]";
	}
	
	
	

}
