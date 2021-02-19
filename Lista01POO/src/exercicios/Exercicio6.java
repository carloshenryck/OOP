package exercicios;

public class Exercicio6 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, aux = 0, result = 0;
		
		System.out.println(num2);
		
		while(result <  100) {
			result = num1  + num2;
			System.out.println(result);
			aux = num2;
			num1 = aux;
			num2 = result;
		}
	}

}
