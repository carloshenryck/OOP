package exercicios;

public class Exercicio3 {
	public static void main(String[] args) {
		int multiplos = 0;
		for(int i = 0; i < 100; i++) {
			if(i % 3 == 0) {
				multiplos = i;
				System.out.println(multiplos);
			}
		}
	}
}
