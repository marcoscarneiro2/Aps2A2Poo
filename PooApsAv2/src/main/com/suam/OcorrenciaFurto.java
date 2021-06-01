package main.com.suam;

public class OcorrenciaFurto extends OcorrenciaPolicial implements Roubo {

	private int valorRoubado;

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

}
