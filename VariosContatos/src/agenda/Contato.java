package agenda;

import java.util.ArrayList;

public class Contato {
	//Atributos
	private String name;
	private ArrayList<Fone> fones;
	
	//M�todos P�blicos
	public void addFone(String label, String number) {
		Fone f = new Fone(label, number);
		fones.add(f);
	}
	
	public boolean rmFone(int index) {
		if(this.fones == null) {
			System.out.println("N�o h� contatos");
			return false;
		} else {
			if(index >= fones.size()) {
				System.out.println("�ndice n�o existente");
				return false;
			} else {
				fones.remove(index);
				System.out.println("Fone removido");
				return true;
			}
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Fone> getFones() {
		return fones;
	}
	
	//M�todos Especiais
	public Contato(String id) {
		this.name = id;
		fones = new ArrayList<Fone>();
	}
	
	public String toString() {
		String dados = "- " + this.name;
		
		if(fones.size() > 0) {
			for(int i = 0; i < fones.size(); i++) {
				dados += " [" + i + ":" + fones.get(i).getLabel() + ":" + fones.get(i).getNumber() + "]";
			}
		} else {
			dados += "[Sem telefones]";
		}
		
		
		return dados;
	}
}
