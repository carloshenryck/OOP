package main;

public class Fone {
	private String id;
	private String number;
	
	
	public Fone() {
		
	}
	
	public Fone(String id, String number) {
		this.id = id;
		this.number = number;
	}
	
	public boolean validate(String number) {
		if(number.contains("(") && number.contains(")")) {
			if(number.matches("[0-9]+")) {
				return true;
			}
			
		} else if(!number.contains("(") && !number.contains(")")) {
			if(number.matches("[0-9]+")) {
				return true;
			}
		} else {
			System.out.println("Erro numero invalido");
			return false;			
		}
		return true;	
	}
	
	public String toString() {
		return this.number;
	}

	public String getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}
}
