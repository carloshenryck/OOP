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
	
	//M�todo especial
	public String toString() {		
		//Formatar saida OBS: s� aceitara nome de at� 10 caracteres
		String output = String.format ("[%-10.10s : %d U : %.2f R$]",
	    this.nome, this.qtd, this.preco);
			
		return output;
	}
}
