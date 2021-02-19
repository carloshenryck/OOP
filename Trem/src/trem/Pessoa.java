package trem;

public class Pessoa implements Pass{
	private String id;
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
