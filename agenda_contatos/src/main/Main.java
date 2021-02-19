package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		String fone = "";
//		Fone f = new Fone();
//		ArrayList<Fone> fones = new ArrayList<Fone>();
		Agenda a = new Agenda();
		
		boolean stop = false;
		int acao = 0;
		
		while(stop!= true) {
			a.showContatos();
			System.out.println("\n-----------------------------------------------------------------------------------------------");
			System.out.println("Digite a ação desejada: 1- Inserir novo Contato | 2- Selecionar um Contato | 3- Remover um Contato | 4- Sair");
			acao = scan.nextInt();
			if(acao == 1) {
				ArrayList<Fone> fones = new ArrayList<Fone>();
				System.out.println("Digite o nome do novo contato: ");
				name = scan.next();

				
				System.out.println("Digite o numero do contato: ");
				fone = scan.next();
				Fone f = new Fone(Integer.toString(fones.size()),fone);
				fones.add(f);
				a.addContato(name, fones);
				
				if(name.isEmpty()) {
					System.out.println("Nome do contato inválido");
				}
				
			} else if(acao == 2) {
				System.out.println("Digite o nome do contato: ");
				name = scan.next();
				a.findContato(name);
				
			} else if(acao == 3) {
				System.out.println("Digite qual o nome do contato que deseja remover: ");
				name = scan.next();
				a.rmContato(name);
				
			} else if(acao == 4) {
				stop = true;
				a.showContatos();
			}
			else{
				System.out.println("Ação inválida!");
			}
		}
	}
}
