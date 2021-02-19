package agenda;

public class Fone {
	//Atributos
	private String id;
	private String number;
	//M�todos P�blicos
	public static boolean validate(String number) {
		return number.matches("^[0-9.()]+");
	}
	
	//M�todo especial
	public Fone(String label, String number) {
		this.id = label;
		this.setNumber(number);
	}
	
	public Fone(String serial) {
		String linha[] = serial.split(":");
		this.id = linha[0];
		this.setNumber(linha[1]);
	}
	
	public void setNumber(String number) {
		if(validate(number)) {
			this.number = number;
		} else{
			System.out.println("fail: o n�mero n�o � compat�vel");
		}
	}
	
	public String getLabel() {
		return this.id;
	}
	
	public String getNumber() {
		return this.number;
	}

		
}
