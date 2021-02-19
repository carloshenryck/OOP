package trem;

import java.util.ArrayList;

public class Vagao {
	private ArrayList<Pass> elementos;
	private int MaxElementos;
	private boolean isCarga;
	
	public boolean embarcar(Pass pass) {
		if(elementos == null) {
			elementos = new ArrayList<Pass>();
			elementos.add(pass);
			return true;
		}
		
		if(elementos.size() == MaxElementos) {
			return false;
		} else {
			elementos.add(pass);
			return true;
		}

	}

	
	public boolean desembarcar(String idPass) {
		int k = 0;
		
		for(Pass elemento : elementos) {
			if(elemento.getId().equals(idPass)) {
				elementos.remove(k);
				return true;
			} 
			k++;
		}
		
		return false;
	}
	
	public boolean exists(String idPass) {
		if(elementos == null) {
			elementos = new ArrayList<Pass>();
		}
		
		for(Pass elemento : elementos) {
			if(elemento.getId().equals(idPass)) {
				return true;
			} 
		}
		
		return false;
	}
	
	public void setIsCarga(boolean isCarga) {
		this.isCarga = isCarga;
	}
	
	public boolean getIsCarga() {
		return isCarga;
	}
	
	public void setMaxElementos(int maxElementos) {
		this.MaxElementos = maxElementos;
	}
	
	public String toString() {
		String output = " ";
		
		if(isCarga) {
			output += "(";
			if(elementos == null || elementos.size() == 0) {
				output += " _" + this.MaxElementos + " ";
			} else {
				for(int i = 0; i < elementos.size(); i++) {
					output += elementos.get(i).getId();
				}
			}
			
			output += ")";
			
			
		} else {
			output += "[";
			if(elementos == null || elementos.size() == 0) {
				for(int i = 0; i < this.MaxElementos; i++) {
					output += " - ";
				}
			} else {			
				
				for(int i = 0; i < elementos.size(); i++) {
						output += " " + elementos.get(i).getId();
				}
				
				for(int i = 0; i < (MaxElementos - elementos.size()); i++) {
					output += " - ";
			}
			}
			
			output += "]";
		}
		
		
		return output;
	}
}
