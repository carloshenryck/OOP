package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Agenda {
	
	private ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	public int findContato(String name) {
		ArrayList<Contato> c = getContatos();
		for(int i = 0; i < c.size(); i++) {
			if(c.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public void addContato(String name, ArrayList<Fone> fone) {
		ArrayList<Contato> c = getContatos();
		boolean igual = false;
		for(Contato d : c) {
			if(d.getName().equals(name)) {
				igual = true;
				ArrayList<Fone> f = fone;
				for(Fone g : f) {
					d.addFone(g.getId() + ":" + g.getNumber());
				}
			break;
			}
		}if (!igual) {
			Contato ct = new Contato(name);
			for (int i = 0; i < fone.size(); i++) {
				ct.addFone(fone.get(i).getId() + ":" + fone.get(i).getNumber());
			}
			contatos.add(ct);
		}
	}
	
	public boolean rmContato(String name) {
		ArrayList<Contato> con = getContatos();
		for(Contato d : con) {
			if(d.getName().equals(name)) {
				con.remove(d);
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Contato> search(String pattern){
		ArrayList<Contato> cn = getContatos();
		ArrayList<Contato> encontrados = new ArrayList<Contato>();
		for(Contato f : cn) {
			if(f.getName().toLowerCase().contains(pattern.toLowerCase())) {
				encontrados.add(f);
			}else {
				ArrayList<Fone> fon = f.getFone();
				for(Fone g : fon) {
					if(g.getNumber().contains(pattern)) {
						encontrados.add(f);
					}
				}
			}
		}
		return encontrados;
	}
	
	public ArrayList<Contato> getContatos(){
		return contatos;
	}
	
	public Contato getContato(String name) {
		ArrayList<Contato> cont = getContatos();
		for(Contato cn : cont) {
			if(cn.getName().equals(name)) {
				return cn;
			}
		}
		return null;
	}
	
	public void show() {
		String[] nome = new String[contatos.size()];
        
        for(int i = 0; i < contatos.size();i++) {
            nome[i] = contatos.get(i).getName();
        }
        
        Arrays.sort(nome);
        
        for(int j = 0; j < contatos.size();j++) {
            System.out.println(getContato(nome[j]));
        }
	}
	
}
