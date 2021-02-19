package salario;

public class Professor extends Funcionario {
	private char classe;
	
	public Professor(String nome, char classe) {
		super(nome, 2);
		this.classe = classe;
		this.setBonus(_calcSalario_());
	}
	
	public double _calcSalario_() {
		double bonus = 0;
		switch(classe) {
			case 'A':
				bonus = 3000;
				break;
				
			case 'B':
				bonus = 5000;
				break;
				
			case 'C':
				bonus = 7000;
				break;
				
			case 'D':
				bonus = 9000;
				break;
				
			case 'E':
				bonus = 11000;
				break;
		}
		
		bonus += this.getQtd_diarias() * 100;
		return bonus;
	}
	
	public void addDiaria() {
		if(this.getQtd_diarias() == 2) {
			System.out.println("fail: limite de diárias atingido");
		} else {
			setQtd_diarias();
			setBonus(_calcSalario_());
		}
	}
	
	public void show() {
		System.out.printf("Prof %s classe %c\nsalario %.0f\n", getNome(), classe, getBonus());
	}
	
	public String toString() {
		String output = String.format("prof:%s:%c:%.0f", this.getNome(), this.classe, this.getBonus());
		return output;
	}
}
