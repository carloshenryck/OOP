package main;

import java.util.ArrayList;

public class Contato {
	private String name;
	private ArrayList<Fone> fones = new ArrayList<Fone>();
	
	
	public Contato(String name) {
		this.name = name;
	}
	
	
	public boolean addFone(String id, String number) {
		Fone f = new Fone(id,number);
		if(!fones.contains(f)) {
			Fone fon = new Fone();
			if(fon.validate(number)) {
				fones.add(f);
				return true;							
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean rmFone(int index) {
		fones.remove(index);
		return true;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Fone> getFones() {
		return fones;
	}
	
	public void setFones(ArrayList<Fone> fones) {
		this.fones = fones;
	}

}
