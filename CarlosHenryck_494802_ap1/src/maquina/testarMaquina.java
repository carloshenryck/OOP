package maquina;

import java.util.Locale;
import java.util.Scanner;

public class testarMaquina {
	
	public static void InitializeMessage() {
	  //Mensagem para caso o usuário tente iniciar um método 
	  //sem inicializar a máquina
  	  System.out.println("Inicie a máquine primeiro");
    }
	
	public static void ParametersMessage() {
		  //Mensagem para caso a pessoa tente iniciar um método 
		  //sem passar os parâmetros corretos
	  	  System.out.println("Parâmetros insuficientes");
	    }
	
  public static void main(String[] args) { 
	  
	Locale.setDefault(Locale.US); //Trocar virgulas por pontos
	
    Scanner sc = new Scanner(System.in);
    Maquina maquina = null;
    boolean end = false;
    
    System.out.println("Digite um comando:");
    
    while(!end){
      String line = sc.nextLine();
      String[] cmd = line.split(" ");
      String comando = cmd[0];
      
      int indice;
     
      switch(comando){
        case "init":
        	if(cmd.length < 3) {ParametersMessage();  break;}
        	int qtdEspirais = Integer.parseInt(cmd[1]);
        	int maxProdutos = Integer.parseInt(cmd[2]);
        	
        	
        	if(maquina != null) {
        		maquina = null;
        		maquina = new Maquina(qtdEspirais, maxProdutos);
        	} else {
        		maquina = new Maquina(qtdEspirais, maxProdutos);
        	}
        	
        	break;
        	
        case "set":
        	if(maquina == null) {InitializeMessage(); break;}
        	if(cmd.length < 5) {ParametersMessage();  break;}
        	
			indice = Integer.parseInt(cmd[1]);
			String nome = cmd[2];
			int qtd = Integer.parseInt(cmd[3]);
			float preco = Float.parseFloat(cmd[4]);
			
			maquina.alterarEspiral(indice, nome, qtd, preco);
			
        	break;
        	
        case "show":
        	if(maquina == null) {InitializeMessage(); break;}
        	
        	String output = maquina.toString();
        	System.out.println(output);
        	
        	break;
        	
        case "limpar":
        	if(maquina == null) {InitializeMessage(); break;}
        	if(cmd.length < 2) {ParametersMessage();  break;}
        	
        	indice = Integer.parseInt(cmd[1]);
        	maquina.limparEspiral(indice);
        	
        	break;
        	
        case "dinheiro":
        	if(maquina == null) {InitializeMessage(); break;}
        	if(cmd.length < 2) {ParametersMessage();  break;}
        	
        	float valor = Float.parseFloat(cmd[1]);
        	maquina.inserirDinheiro(valor);
        	
        	break;

        case "comprar":
        	if(maquina == null) {InitializeMessage(); break;}
        	if(cmd.length < 2) {ParametersMessage();  break;}
        	
        	indice = Integer.parseInt(cmd[1]);
        	maquina.vender(indice);
        	
        	break;
        	
        case "troco":
        	if(maquina == null) {InitializeMessage(); break;}
        	
        	float saldoaReceber = maquina.pedirTroco();
        	
        	if(saldoaReceber > 0) {
        		maquina.setSaldo(0);
    			System.out.printf("Você recebeu %.2f R$ \n", saldoaReceber);
    		} else {
    			System.out.println("Você não tem saldo");
    		}
        	
        	break;
        	
        case "end":
        	sc.close();
        	
        	return;
      }
    }
  }
}

