package modules;

public class EquipamentoSonoro extends Equipamento {
	private short volume;
	private boolean stereo;
		
	public EquipamentoSonoro(boolean ligado, short volume, boolean stereo) {
		super(ligado);
		this.volume = volume;
		this.stereo = stereo;
	}
	//Os 2 métodos abaixo lançam mão do POLIMORFISMO!!!!
	public String toString(){
		return (super.toString()+"\nVolume: "+volume+"\nStereo: "+stereo);		
	}
	
	public boolean liga() {
		volume=5;
		return super.liga();
	}

	public short getVolume() {
		return volume;
	}

	public void setVolume(short volume) {
		this.volume = volume;
	}

	public boolean isStereo() {
		return stereo;
	}

	public void setStereo(boolean stereo) {
		this.stereo = stereo;
	}	

}
