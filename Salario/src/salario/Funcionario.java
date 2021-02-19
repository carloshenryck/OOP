package salario;

public class Funcionario {
	private String nome;
	private int max_diarias;
	private int qtd_diarias;
	private double bonus;
	
	public Funcionario(String nome, int max_diarias) {
		super();
		this.nome = nome;
		this.max_diarias = max_diarias;
		this.qtd_diarias = 0;
	}
	
	public void addDiaria() {
		qtd_diarias++;
	}
	
	public void show() {
		
	}
	
	public double _calcSalario_() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getQtd_diarias() {
		return qtd_diarias;
	}
	
	public void setQtd_diarias() {
		this.qtd_diarias++;
	}

	public String toString() {
		return "Funcionario [nome=" + nome + "]";
	}
	
	
}
