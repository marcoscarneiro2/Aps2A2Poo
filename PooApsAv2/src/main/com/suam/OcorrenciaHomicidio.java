package main.com.suam;

public class OcorrenciaHomicidio extends OcorrenciaPolicial implements Morte {

	private String localAssassinato;
	
	//public OcorrenciaHomicidio(int numero, String nomeVitima, String descricaoOcorrencia) {
	//	super(numero, nomeVitima, descricaoOcorrencia);
	//}

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
