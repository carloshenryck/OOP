package main;

import java.util.ArrayList;
import java.util.Scanner;

public class testelista {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String acao;
		String name;
		String lin;
		String busca;
		int ind;
		boolean parar = false;
		
		Contato c = new Contato("");
		ArrayList<Fone> f = new ArrayList<Fone>();
		Agenda ag = new Agenda();
		
		while(parar == false) {
			System.out.println("-----------------------");
			System.out.println("Digite um comando (sem as aspas): ");
			System.out.println("'add' - Inserir um contato com seu(s) telefone(s)" + "\n" + "'rmFone' - Remover numero de telefone de algum contato pelo indice" + "\n" + "'rmContato' - Remove um contato pelo nome" + "\n" + "'search' - Faz a pesquisa de algum caractere" + "\n" + "'show' - Mostrar contato(s)" + "\n" + "'end' - Parar programa");
			System.out.println("-----------------------");
			acao = s.next();
			switch(acao) {
				case "add":
					f.clear();
					name = s.next();
					lin = (s.nextLine()).trim();
					
					String a[] = lin.split(" ");
					
					for(String b : a) {
						Fone fon = new Fone(b);
						f.add(fon);
					}
					ag.addContato(name, f);
					break;
				case "rmFone":
					name = s.next();
					ind = s.nextInt();
					Contato con = ag.getContato(name);
					if(con != null) {
						con.rmFone(ind);
					}
					break;
				case "rmContato":
					name = s.next();
					ag.rmContato(name);
					break;
				case "search":
					busca = s.next();
					ArrayList<Contato> cont = ag.search(busca);
					for(Contato x : cont) {
						System.out.println(x);
					}
					break;
				case "show":
					ag.show();
					break;
				case "end":
					parar = true;
					System.out.println("Voce parou o programa.");
					System.out.println("-----------------------");
					break;
				default:
					System.out.println("Comando " + "'" + acao + "'" + " invalido." + "\n");
					break;
			}
		}
	}
}
