package main;

import java.util.ArrayList;

public class Contato {
	private String name;
	private ArrayList<Fone> fone;
	
	public Contato(String name) {
		this.name = name;
		fone = new ArrayList<Fone>();
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Fone> getFone() {
		return fone;
	}

	public void setName(String nam) {
		this.name = nam;
	}
	
	public void setFone(ArrayList<Fone> fon) {
		this.fone = fon;
	}
	
	public boolean addFone(String serial) {
		Fone f = new Fone(serial);
		if(Fone.validate(f.getNumber())) {
			fone.add(f);
			return true;
		}
		return false;
	}
	
	public boolean rmFone(int index) {
		fone.remove(index);
		return true;
	}
	
	public String toString() {
		String output = "-";
		
		if(!name.equals("")) {
			output += " " + getName();
		}
		
		if(fone.size() > 0) {
			for(int i = 0; i < fone.size(); i++) {
				output += "[" + i + ":" + fone.get(i).getId() + ":" + fone.get(i).getNumber() + "]";
			}
		}else {
			output += "Não há telefone";
		}
		
		return output;
	}
}
