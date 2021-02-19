package maquina;

public class Espiral {
	//Atributos
	public String nome;
	public int qtd;
	public float preco;
	
	//Construtor
	public Espiral(String nome, int qtd, float preco) {
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
	}
	
	//Método especial
	public String toString() {		
		//Formatar saida OBS: só aceitara nome de até 10 caracteres
		String output = String.format ("[%-10.10s : %d U : %.2f R$]",
	    this.nome, this.qtd, this.preco);
			
		return output;
	}
}
