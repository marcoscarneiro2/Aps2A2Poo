package main.com.suam;

public class OcorrenciaFurto extends OcorrenciaPolicial implements Roubo {

	private int valorRoubado;
	
	public OcorrenciaFurto(int numero, String nomeVitima, String descricaoOcorrencia) {
		super(numero, nomeVitima, descricaoOcorrencia);
	}


	public int getValorRoubado() {
		return valorRoubado;
	}

	public void setValorRoubado(int valorRoubado) {
		this.valorRoubado = valorRoubado;
	}

	@Override
	public Void informaValorRoubado(int valorRoubado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String exibeInfoOcorrencia() {
		// TODO Auto-generated method stub
		return null;
	}

}
