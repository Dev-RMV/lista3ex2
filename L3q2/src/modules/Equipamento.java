package modules;

public class Equipamento {
	private boolean ligado;
	
	public Equipamento(boolean ligado) {
		super();
		this.ligado = ligado;
	}
	
	public String toString() {
		return("\nLigado: "+ligado);
	}
	
	public boolean liga() {
		return ligado=true;
	}
	public boolean desliga() {
		return ligado=false;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

}
