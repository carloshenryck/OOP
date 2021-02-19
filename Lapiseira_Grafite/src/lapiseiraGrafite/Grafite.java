package lapiseiraGrafite;

public class Grafite {
	//Atributos
	private float calibre;
	private String dureza;
	private int tamanho;
	
	//Métodos especiais
	public Grafite(float calibre, String dureza, int tamanho) {
		this.calibre = calibre;
		this.dureza = dureza;
		this.tamanho = tamanho;
	}
	
	public float getCalibre() {
		return calibre;
	}
	
	public String getDureza() {
		return dureza;
	}
	
	public int getTamanho() {
		return tamanho;
	};
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String toString() {
		return "[" + this.calibre + ":" + this.dureza + ":" + this.tamanho + "]";
	}
}
