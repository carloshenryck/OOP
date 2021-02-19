package salario;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um comando:");
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		double bonus = 0;
		
		while(true) {
			String line = sc.nextLine();
		    String[] cmd = line.split(" ");
		    String comando = cmd[0];
		    
		    String nome;
		    char classe;
		    int index;
		    int flag;
		    
			switch(comando) {
				case "addProf":
					nome = cmd[1];
					classe = cmd[2].charAt(0);
					
					Professor p1 = new Professor(nome, classe);
					funcionarios.add(p1);
					System.out.println("Professor adicionado");
					
					break;
					
				case "addSta":				
					nome = cmd[1];
					int nivel = Integer.parseInt(cmd[2]);
					
					STA s1 = new STA(nome, nivel);
					funcionarios.add(s1);
					System.out.println("Sta adicionado");
					
					break;
					
				case "addTer":
					nome = cmd[1];
					int horas = Integer.parseInt(cmd[2]);
					boolean insalubre = false;
					
					if("sim".equalsIgnoreCase(cmd[3])) {
						insalubre = true;
					} else if("nao".equalsIgnoreCase(cmd[3])) {
						insalubre = false;
					} else {
						System.out.println("fail: parâmetro inválido");
						break;
					}
					
					Terceirizado t1 = new Terceirizado(nome, horas, insalubre);
					funcionarios.add(t1);
					System.out.println("Terceirizado adicionado");
					
					break;
					
				case "addDiaria":
					nome = cmd[1];
					index = 0;
				    flag = 0;
					for(int i = 0; i < funcionarios.size(); i++) {
						if(funcionarios.get(i).getNome().equals(nome)) {
							index = i;
							flag = 1;
							i = funcionarios.size();
						}
					}
					
					if(flag == 1) {
						funcionarios.get(index).addDiaria();
					} else {
						System.out.println("fail: funcionario não econtrado");
					}
					
					break;
					
				case "setBonus":
				
					for(Funcionario funcionario : funcionarios) {
						funcionario.setBonus(funcionario.getBonus() - bonus);
					}
					
					bonus = Double.parseDouble(cmd[1])/funcionarios.size();
					
					for(Funcionario funcionario : funcionarios) {
						funcionario.setBonus(funcionario.getBonus() + bonus);
						funcionario._calcSalario_();
					}
					
					break;	
					
				case "show":
					if(cmd.length < 2) {
						for(Funcionario funcionario : funcionarios) {
							System.out.println(funcionario);
						}
						
						if(funcionarios.isEmpty()) {
							System.out.println("nenhum funcionário cadastrado");
						}
						
					} else {
						nome = cmd[1];
						index = 0;
						flag = 0;
						for(int i = 0; i < funcionarios.size(); i++) {
							if(funcionarios.get(i).getNome().equals(nome)) {
								index = i;
								flag = 1;
								i = funcionarios.size();
							}
						}
						
						if(flag == 1) {
							funcionarios.get(index).show();
						} else {
							System.out.println("fail: funcionário não econtrado");
						}
					}
					
					
					break;
					
				case "rm":
					nome = cmd[1];
					index = 0;
					flag = 0;
					for(int i = 0; i < funcionarios.size(); i++) {
						if(funcionarios.get(i).getNome().equals(nome)) {
							index = i;
							flag = 1;
							i = funcionarios.size();
						}
					}
					
					if(flag == 1) {
						funcionarios.remove(index);
						System.out.println("funcionario removido");
					} else {
						System.out.println("fail: funcionario não econtrado");
					}
					
					break;
					
				case "end":
					sc.close();
					return;
			
			}
		}
	}
}

