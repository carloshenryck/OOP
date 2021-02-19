package salario;

public class Terceirizado extends Funcionario{
	private int horas_trab;
	private boolean insalubre;
	
	public Terceirizado(String nome, int horas, boolean insalubre) {
		super(nome, 0);
		this.horas_trab = horas;
		this.insalubre = insalubre;
		this.setBonus(calcSalario());
	}
	
	public double calcSalario() {
		double bonus = 4*horas_trab;
		
		if(insalubre) {
			bonus += 500;
		}
		
		return bonus;
	}
	
	public void addDiaria() {
		System.out.println("fail: terc nao pode receber diaria");
	}
	
	public void show() {
		System.out.printf("Terceirizado %s\nsalario %.0f\n", getNome(), getBonus());
	}
	
	public String toString() {
		String isInsalubre;
		if(insalubre) {
			isInsalubre = "sim";
		} else {
			isInsalubre = "não";
		}
		
		String output = String.format("ter:%s:%d:%s:%.0f", this.getNome(), this.horas_trab, isInsalubre, this.getBonus());
		return output;
	}
}
