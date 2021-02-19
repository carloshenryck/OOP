package agenda;

public class Fone {
	//Atributos
	private String label;
	private String number;
	
	//M�todos P�blicos
	public static boolean validate(String number) {
		return number.matches("^[0-9.()]+");
	}
	
	//M�todo especial
	public Fone(String label, String number) {
		this.label = label;
		this.setNumber(number);
	}
	
	public void setNumber(String number) {
		if(validate(number)) {
			this.number = number;
		} else{
			System.out.println("fail: o n�mero n�o � compat�vel");
		}
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public String toString() {
		return "[" + this.label + ":" + this.number + "]";
	}
}
