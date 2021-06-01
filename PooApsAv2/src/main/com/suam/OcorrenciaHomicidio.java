package main.com.suam;

public class OcorrenciaHomicidio extends OcorrenciaPolicial implements Morte {

	public OcorrenciaHomicidio(int numero, String nomeVitima, String descricaoOcorrencia) {
		super(numero, nomeVitima, descricaoOcorrencia);
	}

	private String localAssassinato;

	public String getLocalAssassinato() {
		return localAssassinato;
	}

	public void setLocalAssassinato(String localAssassinato) {
		this.localAssassinato = localAssassinato;
	}

	@Override
	public Void informaLocalAssassinato(String localAssassinato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String exibeInfoOcorrencia() {
		// TODO Auto-generated method stub
		return null;
	}

}
