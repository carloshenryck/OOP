package trem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
  public static void main(String[] args) { 
	
    Scanner sc = new Scanner(System.in);
    Trem trem = null;
    boolean end = false;
    
    System.out.println("Digite um comando:");
    
    while(!end){
      String line = sc.nextLine();
      String[] cmd = line.split(" ");
      String comando = cmd[0];
      
      int indice;
     
      switch(comando){
        case "init":
        	int maxVagoes = Integer.parseInt(cmd[1]);
        	trem = new Trem(maxVagoes);
        	
        	break;
        	
        case "nwvp":
        	int maxElementos = Integer.parseInt(cmd[1]);
        	
        	Vagao v1 = new Vagao();
        	v1.setIsCarga(false);
        	v1.setMaxElementos(maxElementos);
        	
        	trem.addVagao(v1);
                   
        	
        	break;
        	
        case "nwvc":
        	int capacidade = Integer.parseInt(cmd[1]);
        	
        	Vagao v2 = new Vagao();
        	v2.setIsCarga(true);
        	v2.setMaxElementos(capacidade);
        	
        	trem.addVagao(v2);
        	
        	break;
        	
        case "la":
        	System.out.println(trem);
        	    	
        	break;
        	
        case "addp":
        	String nome = cmd[1];
        	
        	Pessoa p = new Pessoa();
        	p.setId(nome);
        	p.setIsCarga(false);
        	trem.embarcar(p);
        	
        	break;

        case "addc":
        	
        	String id = cmd[1];
        	
        	Carga c = new Carga();
        	c.setId(id);
        	c.setIsCarga(true);
        	trem.embarcar(c);
        	break;
        	
        case "sair":
        	String identidade = cmd[1];
        	trem.desembarcar(identidade);
        	
        	break;
        	
        case "end":
        	sc.close();
        	
        	return;
      }
    }
  }
}

