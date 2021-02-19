package main;

public class Fone {
	private String id; //oi, tim, claro, vivo, fixo, casa
	private String number;
	
	public Fone(String serial) {
		String s[] = serial.split(":");
		this.id = s[0];
		this.number = s[1];
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getId() {
		return id;
	}
	
	public void setNumber(String num) {
		this.number = num;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
    public static boolean validate(String number) {
        char[] c = number.toCharArray();
        boolean result = true;
        for (int i = 0; i < c.length; i++) {
            if (Character.isAlphabetic(c[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
	
	public String toString() {
		return getId() + ":" + getNumber();
	}
	
}
