package agenda;

import java.util.ArrayList;

public class Contato {
	//Atributos
	private String name;
	private ArrayList<Fone> vector;
	
	//Métodos Públicos
	public void addFone(String label, String number) {
		Fone f = new Fone(label, number);
		
		vector.add(f);
	}
	
	public void rmFone(int index) {
		if(this.vector == null) {
			System.out.println("Não há contatos");
		} else {
			if(index >= vector.size()) {
				System.out.println("Índice não existente");
			} else {
				vector.remove(index);
				System.out.println("Não foi");
			}
		}
	}
	
	//Métodos Especiais
	public Contato(String id) {
		this.name = id;
		vector = new ArrayList<Fone>();
	}
	
	public String toString() {
		String dados = "- " + this.name;
		
		if(vector.size() > 0) {
			for(int i = 0; i < vector.size(); i++) {
				dados += " [" + i + ":" + vector.get(i).getLabel() + ":" + vector.get(i).getNumber() + "]";
			}
		} else {
			dados += "[Sem telefones]";
		}
		
		
		return dados;
	}
}
