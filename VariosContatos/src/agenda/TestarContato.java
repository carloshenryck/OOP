package agenda;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale.Category;


public class TestarContato {
	public static void main(String[] args) {
		Locale.setDefault(Category.FORMAT, Locale.ROOT);
		
		Scanner scanner = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		while(true) {
			String comando = scanner.next();
			String nome;
			
			switch(comando) {
				case "end":
					scanner.close();
					return;
					
				case "show":				
					String output = agenda.toString();
					System.out.println(output);
					break;
					
				case "search":
					String pattern = scanner.next();
					ArrayList<Contato> ContatosAchados = agenda.search(pattern);
					
					if(ContatosAchados.size() == 0) {
						System.out.println("Nenhum contando encontrado");
					} else {
						for(Contato contato : ContatosAchados) {
							System.out.println(contato);
						}
					}
					
					break;
					
				case "add":
					String dados = scanner.nextLine();
					String[] SepararDados = dados.split(" ");
					nome = SepararDados[1];
					
					if(SepararDados.length - 1 < 2) {
						System.out.println("Parâmetros Insuficientes");
					} else {
						ArrayList<Fone> fones = new ArrayList<Fone>();
						
						for(int i = 2; i < SepararDados.length; i++) {
							if(SepararDados[i].contains(":")) {
								String serial = SepararDados[i];
								fones.add(new Fone(serial));
							} else {
								System.out.println("Serial inválido");
							}
						}
						
						if(fones.size() > 0) {
							agenda.addContato(nome, fones);
						}
					}
					
					
					break;
					
				case "rmv":
					String remover = scanner.nextLine();
					String[] separar = remover.split(" ");
					ArrayList<Contato> contatos = agenda.getContatos();
					nome = separar[1];
					
					if(separar.length == 2) {
						agenda.rmContanto(nome);
					} else if(separar.length == 3) {
						int indiceContato = agenda.getIndiceContato(nome);
						int indiceFone = Integer.parseInt(separar[2]);
						
						if(contatos.size() == 0) {
							System.out.println("Sem contatos");
						} else {
							contatos.get(indiceContato).rmFone(indiceFone);
						}
						
;					} else {
						System.out.println("Parâmetros inválidos");
					}
					
					break;
			}
		}
	}
}
