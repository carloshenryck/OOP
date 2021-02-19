package trem;

public class Carga implements Pass{
	private String id;
	private float peso;
	private boolean isCarga;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setIsCarga(boolean isCarga) {
		this.isCarga = isCarga;
	}
	
	public boolean getIsCarga() {
		return isCarga;
	}
}
