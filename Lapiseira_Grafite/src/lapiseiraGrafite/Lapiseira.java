package lapiseiraGrafite;

public class Lapiseira {
	//Atributos
	private float calibre;
	private Grafite grafite;
	
	//Métodos Públicos
	public void inserir(Grafite grafite) {
		if(this.grafite != null) {
			System.out.println("fail: ja existe grafite");
		} else if(grafite.getCalibre() == this.calibre) {
			this.grafite = grafite;
			System.out.println("Inserido");
		} else {
			System.out.println("fail: calibre incompatível");
		}
	}
	
	public void remover() {
		if(this.grafite != null) {
			this.grafite = null;
			System.out.println("Removido");
		} else {
			System.out.println("Não há grafite na sua lapiseira");
		}
	}
	
	public void escrever(int pressao) {
		if(this.grafite == null) {
			System.out.println("fail: nao existe grafite");
		} else {
			int GrafiteGasto = 2 * pressao;
			int SobradoGrafite = grafite.getTamanho() - GrafiteGasto;
			
			if(SobradoGrafite < 0) {
				System.out.println("fail: folha ficou pela metade");
				System.out.println("fail: grafite acabou");
				this.grafite = null;
			} else if(SobradoGrafite == 0) {
				System.out.println("fail: grafite acabou");
				this.grafite = null;
			} else {
				this.grafite.setTamanho(SobradoGrafite);
				System.out.println("Escrito");
			}
		}
	}
	
	public String toString() {
		return "calibre: " + this.calibre + ", grafite: " + this.grafite;
	}
	
	//Métodos Especiais
	public Lapiseira(float calibre) {
		this.calibre = calibre;
		this.grafite = null;
	}
}
