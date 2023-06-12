package modelo;

public class Reserva {

	private Long id;
	private String codigoQuarto;
	private Hospede hospede;
	private float diaria;
	private String servicoQuarto;
	private int quantidadeHospede;
	private int quantidadeDedias;
	private String formaPagamento;
	
	public Reserva() {
}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoQuarto() {
		return codigoQuarto;
	}

	public void setCodigoQuarto(String codigoQuarto) {
		this.codigoQuarto = codigoQuarto;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public float getDiaria() {
		return diaria;
	}

	public void setDiaria(float diaria) {
		this.diaria = diaria;
	}

	public String getServicoQuarto() {
		return servicoQuarto;
	}

	public void setServicoQuarto(String servicoQuarto) {
		this.servicoQuarto = servicoQuarto;
	}

	public int getQuantidadeHospede() {
		return quantidadeHospede;
	}

	public void setQuantidadeHospede(int quantidadeHospede) {
		this.quantidadeHospede = quantidadeHospede;
	}

	public int getQuantidadeDedias() {
		return quantidadeDedias;
	}

	public void setQuantidadeDedias(int quantidadeDedias) {
		this.quantidadeDedias = quantidadeDedias;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
}
