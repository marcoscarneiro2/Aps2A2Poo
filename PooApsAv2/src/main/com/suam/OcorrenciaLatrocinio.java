package main.com.suam;

public class OcorrenciaLatrocinio extends OcorrenciaPolicial implements Morte, Roubo {

	private int valorRoubado;
	
	private String localAssassinato;
	
	//int numero, String nomeVitima, String descricaoOcorrencia
	//OcorrenciaLatrocinio() {
		//super("OcorrenciaPolicial");
	//}
	
	
	public int getValorRoubado() {
		return valorRoubado;
	}

	public void setValorRoubado(int valorRoubado) {
		this.valorRoubado = valorRoubado;
	}

	public String getLocalAssassinato() {
		return localAssassinato;
	}

	public void setLocalAssassinato(String localAssassinato) {
		this.localAssassinato = localAssassinato;
	}

	

	@Override
	public Void informaValorRoubado(int valorRoubado) {
		// TODO Auto-generated method stub
		return null;
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
