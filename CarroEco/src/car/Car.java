package car;

public class Car {
	public int gas, gasMax = 100;
	public int pass, passMax = 2;
	public int km;
	private static int contador = 0;
	
	public Car() {
		this.gas = 0;
		this.pass = 0;
		this.km = 0;
		contador++;
	}
	
	public Car(int NewPass, int NewKm, int NewGas) {
		this.gas = NewGas;
		this.pass = NewPass;
		this.km = NewKm;
		contador++;
	}
	
	public static int getContador() {
		return contador;
	}
	
	public boolean in() {
		if(pass < passMax) {
			this.pass += 1;
			return true;
		} else {
			System.out.println("fail: limite de pessoas atingido");
			return false;
		}
	}
	
	public boolean out() {
		if(pass == 0) {
			System.out.println("fail: não há ninguém no carro");
			return false;
		} else {
			this.pass -= 1;
			return true;
		}
	}
	
	public void fuel(int value) {
		if(gas < gasMax) {
			gas += value;
			
			if(gas > gasMax) {
				gas = gasMax;
			}
		} 
	}
	
	public boolean drive(int distance) {
		if(pass > 0 && gas > 0) {
			int distRodado = gas;
			for(int i = distance; i > 0; i--) {	
				
				gas -= 1;
				km += 1;
				
				if(gas < 0) {
					gas += 1;
					km -= 1;
					
					System.out.println("fail: tanque vazio apos andar " + distRodado + " km");
					break;
				} 									
			}
			
			return true;
		} else {
			if(pass == 0) {
				System.out.println("fail: não há ninguém no carro");
			}
			
			if(gas == 0) {
				System.out.println("fail: não há combustível");
			}
			return false;
		}
		
	}
	
	public String toString() {
		return "pass:" + this.pass + ", gas: " + this.gas + ", km: " + this.km;
	}
}
