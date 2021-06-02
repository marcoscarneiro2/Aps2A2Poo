package main.com.suam;

abstract class OcorrenciaPolicial {

	private int numero;

	private String nomeVitima;

	private String descricaoOcorrencia;
	
	public OcorrenciaPolicial() {
		
	}
	
	public OcorrenciaPolicial(int numero, String nomeVitima, String descricaoOcorrencia) {
		this.numero = numero;
		this.nomeVitima = nomeVitima;
		this.descricaoOcorrencia = descricaoOcorrencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeVitima() {
		return nomeVitima;
	}

	public void setNomeVitima(String nomeVitima) {
		this.nomeVitima = nomeVitima;
	}

	public String getDescricaoOcorrencia() {
		return descricaoOcorrencia;
	}

	public void setDescricaoOcorrencia(String descricaoOcorrencia) {
		this.descricaoOcorrencia = descricaoOcorrencia;
	}

	public abstract String exibeInfoOcorrencia();

}
