package exercicios;

public class exercicio7 {
	public static void main(String[] args) {
		String frase = "Socorram-me, subi no ônibus em Marrocos";
		String[] inverteFrase = frase.split(" ");
		String novaFrase = "";
		
		for(int i = inverteFrase.length - 1; i >= 0; i--) {
			novaFrase += inverteFrase[i] + " "; 
		}
		
		System.out.println(novaFrase);
	}
}
