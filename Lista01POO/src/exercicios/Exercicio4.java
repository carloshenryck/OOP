package exercicios;

public class Exercicio4 {
	static int fatorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		} else {
			return fatorial(num - 1) * num;
		}
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			int fator = fatorial(i);
			System.out.println("O fatorial de " + i + " é " + fator);
		}
	}
}
