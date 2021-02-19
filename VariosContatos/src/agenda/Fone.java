package agenda;

public class Fone {
	//Atributos
	private String id;
	private String number;
	//Métodos Públicos
	public static boolean validate(String number) {
		return number.matches("^[0-9.()]+");
	}
	
	//Método especial
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
			System.out.println("fail: o número não é compatível");
		}
	}
	
	public String getLabel() {
		return this.id;
	}
	
	public String getNumber() {
		return this.number;
	}

		
}
