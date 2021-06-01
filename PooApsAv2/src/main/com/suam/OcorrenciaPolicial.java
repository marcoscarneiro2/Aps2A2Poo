package main.com.suam;

abstract class OcorrenciaPolicial {

	private int numero;

	private String nomeVitima;

	private String descricaoOcorrencia;
	
	public OcorrenciaPolicial(int numero,String nomeVitima, String descricaoOcorrencia) {
		this.numero = numero;
		this.nomeVitima = nomeVitima;
		this.descricaoOcorrencia = descricaoOcorrencia;
	}

	public int getNumero() {
		return 0;
	}

	public Void setNumero(int numero) {
		return null;
	}

	public String getNomeVitima() {
		return null;
	}

	public void setNomeVitima(String nomeVitima) {

	}

	public String getDescricaoOcorrencia() {
		return null;
	}

	public void setDescricaoOcorrencia(String descricaoOcorrencia) {

	}

	public abstract String exibeInfoOcorrencia();

}
