package main;

import java.util.ArrayList;

public class Agenda {
	ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	public int findContato(String name) {
		ArrayList<Contato> verifica = new ArrayList<Contato>();
//        boolean pass = false;
        verifica = getContatos();
		int tr = 0;
		for(Contato c : verifica) {
			if(c.getName().equals(name)) {
				if(tr == 0) {
					System.out.print(c.getName());			
				}
				tr++;
				System.out.print(" : " + c.getFones());
			} 
		} 
		if(tr==0) {
			System.out.println("Esse contato não existe");
			return 0;
		}
		System.out.println("\n-------------------------------");
		return 1;	
	}
	
	public boolean addContato(String name, ArrayList<Fone> fones) {
		ArrayList<Contato> verifica = new ArrayList<Contato>();
        boolean pass = false;
        verifica = getContatos();
        for(Contato c : verifica) {
            if (c.getName().equals(name)) {
                pass = true;
                ArrayList<Fone> adicionando = new ArrayList<Fone>();
                adicionando = fones;
                for(Fone adicionar : adicionando) {
                    c.addFone(adicionar.getId(),adicionar.getNumber());
                }
                return true;
            }
        } if (!pass) {
            Contato novo = new Contato(name);
            novo.setFones(fones);
            contatos.add(novo);
            return false;
        }
        return true;
	}
	
	public boolean rmContato(String name) {
		contatos.remove(name);
		return true;
	}
	
	public void showContatos() {
		System.out.println("Contatos: ");
		for(Contato c : contatos){
			System.out.println(" ["+ c.getName() +"] ");
		}
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}
	
	public Contato getContato(String name) {
		return null;
	}
}
