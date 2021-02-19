package salario;

public class STA extends Funcionario {
	private int nivel;
	
	public STA(String nome, int nivel) {
		super(nome, 1);
		this.nivel = nivel;
		this.setBonus(_calcSalario_());
	}
	
	public double _calcSalario_() {
		double bonus = 3000;
		bonus += 300 * nivel; 
		bonus += this.getQtd_diarias() * 100;
		return bonus;
	}
	
	public void addDiaria() {
		if(this.getQtd_diarias() == 1) {
			System.out.println("fail: limite de diárias atingido");
		} else {
			setQtd_diarias();
			setBonus(_calcSalario_());
		}
	}
	
	public void show() {
		System.out.printf("Sta %s nivel %d\nsalario %.0f\n", getNome(), nivel, getBonus());
	}
	
	public String toString() {
		String isInsalubre;
		
		String output = String.format("ter:%s:%d:%.0f", this.getNome(), this.nivel, this.getBonus());
		return output;
	}
}
