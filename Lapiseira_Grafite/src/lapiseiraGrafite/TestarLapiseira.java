package lapiseiraGrafite;

import java.util.Locale;
import java.util.Scanner;
import java.util.Locale.Category;

public class TestarLapiseira {
	public static void main(String[] args) {
		Locale.setDefault(Category.FORMAT, Locale.ROOT);
		
		Scanner scanner = new Scanner(System.in);
		Lapiseira lapiseira = null;
		
		while(true) {
			String comando = scanner.next();
			float calibre;
			String dureza;
			int tamanho;
			int pressao;
			
			switch(comando) {
				case "$end":
					scanner.close();
					return;
					
				case "$show":
					
					System.out.println(lapiseira);
					
					break;
					
				case "$init":
					calibre = scanner.nextFloat();
					System.out.printf("Iniciado", calibre);
					
					lapiseira = new Lapiseira(calibre);
					
					break;
					
				case "$inserir":
					calibre = scanner.nextFloat();
					dureza = scanner.next();
					tamanho = scanner.nextInt();
					
					lapiseira.inserir(new Grafite(calibre, dureza, tamanho));
					
					break;
					
				case "$remover":
					
					lapiseira.remover();
					
					break;
					
				case "$escrever":
					pressao = scanner.nextInt();
					
					lapiseira.escrever(pressao);
					break;
			}
		}
	}
}
