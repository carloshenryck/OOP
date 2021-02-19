package agenda;

import java.util.Locale;
import java.util.Scanner;
import java.util.Locale.Category;

public class TestarContato {
	public static void main(String[] args) {
		Locale.setDefault(Category.FORMAT, Locale.ROOT);
		
		Scanner scanner = new Scanner(System.in);
		Contato contato = null;
		
		while(true) {
			String comando = scanner.next();
			String id;
			String label;
			String number;
			int index;
			
			switch(comando) {
				case "$end":
					scanner.close();
					return;
					
				case "$show":				
					System.out.println(contato);	
					break;
					
				case "$init":
					id = scanner.next();		
					contato = new Contato(id);
					System.out.printf("Contato criado");
					
					break;
					
				case "$add":
					label = scanner.next();
					number = scanner.next();
					
					if(contato == null) {
						System.out.println("Você não tem nenhum contato criado");
					} else {
						contato.addFone(label, number);
					}
					
					break;
					
				case "$rmv":
					index = scanner.nextInt();
					
					contato.rmFone(index);
					break;
			}
		}
	}
}
