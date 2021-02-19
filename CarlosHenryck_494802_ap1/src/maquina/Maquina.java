package maquina;

import java.util.ArrayList;

public class Maquina {
	//Atributos 
	private ArrayList<Espiral> espirais;
	private float saldoCliente;
	private float lucro;
	private int maxProdutos;
	
	//Construtor
	public Maquina(int qtdEspirais, int maxProdutos) {		
		this.maxProdutos = maxProdutos;
		this.saldoCliente = 0;
		this.lucro = 0;
		
		espirais = new ArrayList<Espiral>();
		
		for(int i = 0; i < qtdEspirais; i++) {
			Espiral espiral = new Espiral("empty", 0, 0);
			espirais.add(espiral);
		}
		
	}
	
	//Métodos Públicos
	public boolean inserirDinheiro(float valor) {
		this.saldoCliente += valor;
		return true;
	}
	
	public float pedirTroco() {
		return saldoCliente;
	}
	
	public boolean vender(int indice) {
		if(indice >= espirais.size()) {
			System.out.println("fail: indice não existe");
			return false;
		}
		
		if(espirais.get(indice).qtd == 0) {
			System.out.println("fail: espiral sem produtos");
			return false;
		}
		
		if(saldoCliente < espirais.get(indice).preco) {
			System.out.println("fail: saldo insuficiente");
			return false;
		}
		
		espirais.get(indice).qtd--;
		saldoCliente -= espirais.get(indice).preco;
		
		System.out.println("Você comprou um " + espirais.get(indice).nome);
		
		if(espirais.get(indice).qtd == 0) {
			//Quando o produto acabar a espiral será limpada
			limparEspiral(indice);
		}
		
		return true;
	}
	
	public boolean alterarEspiral(int indice, String nome, int qtd, float preco) {
		if(indice >= espirais.size()) {
			System.out.println("fail: indice não existe");
			return false;
		}
		
		if(qtd > this.maxProdutos) {
			System.out.println("fail: limite excedido");
			return false;
		} 
		
		espirais.get(indice).nome = nome;
		espirais.get(indice).preco = preco;
	    espirais.get(indice).qtd = qtd;
	    
		return true;
	}
	
	public void limparEspiral(int indice) {
		if(indice >= espirais.size()) {
			System.out.println("fail: indice não existe");
			return;
		} else {
			espirais.get(indice).nome = "empty";
			espirais.get(indice).preco = 0;
			espirais.get(indice).qtd = 0;
		}
	}
	
	public float getSaldo() {
		return this.saldoCliente;
	}
	
	public void setSaldo(float saldo) {
		this.saldoCliente = saldo;
	}
	
	//Método especial
	public String toString() {
		String output = String.format("saldo : %.2f \n", this.saldoCliente);
		
		for(int i = 0; i < espirais.size(); i++) {
			output += i + espirais.get(i).toString() + "\n";
		}
		return output;
	}
}
