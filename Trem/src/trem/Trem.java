package trem;

import java.util.ArrayList;

public class Trem {
	private int maxVagoes;
	private ArrayList<Vagao> vagoes;
	
	public Trem(int maxVagoes) {	
		this.maxVagoes = maxVagoes;
	}
	
	public void addVagao(Vagao vagao) {
		if(vagoes == null) {
			vagoes = new ArrayList<Vagao>();
		}
		
		if(vagoes.size() == maxVagoes) {
			System.out.println("fail: limite de vagões atingido");
		} else {
			vagoes.add(vagao);
			System.out.println("Vagão adicionado");
		}
		
	}
	
	public void embarcar(Pass passageiro) {
		if(this.exists(passageiro.getId())) {
			System.out.println("fail: " + passageiro.getId() + " já está no trem");
			return;
		} 
		
		boolean isEmbarcado = false;
		
		if(passageiro.getIsCarga()) {
			for(Vagao vagao : vagoes) {
				if(vagao.getIsCarga()) {
					isEmbarcado = vagao.embarcar(passageiro);
					if(isEmbarcado) {
						System.out.println("Embarcado com suceeso");
						return;
					}
				}
			}
			
		} else {
			
			for(Vagao vagao : vagoes) {
				if(!vagao.getIsCarga()) {
					isEmbarcado = vagao.embarcar(passageiro);
					if(isEmbarcado) {
						System.out.println("Embarcado com suceeso");
						return;
					}
				}
			}
				
		}
		
		System.out.println("fail: trem lotado");
	}
	
	public void desembarcar(String idPass) {
		boolean isDesembarcado = false;
		
		if(!this.exists(idPass)) {
			System.out.println("fail: " + idPass + " não está no trem");
			return;
		} 
		
		for(Vagao vagao : vagoes) {
			isDesembarcado = vagao.desembarcar(idPass);
			if(isDesembarcado) {
				System.out.println(idPass + " foi desembarcado");
				return;
			}	
		}
		
		
	}
	
	public boolean exists(String idPass) {
		boolean exists = false;
		
		for(Vagao vagao : vagoes) {
			exists = vagao.exists(idPass);
			if(exists) {
				return true;
			}
		}
		
		return false;
	}
	
	public ArrayList<Vagao> getVagoes() {
		return vagoes;
	}
	
	public int getMaxVagoes() {
		return maxVagoes;
	}
	
	public String toString() {
		String output = " ";
		
		for(int i = 0; i < vagoes.size(); i++) {
			output += vagoes.get(i);
		}
		
		return output;
	}
	
	
}
