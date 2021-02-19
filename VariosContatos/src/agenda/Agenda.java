package agenda;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Agenda {
	//Atributos
	private ArrayList<Contato> contatos;
	
	//Construtor
	public Agenda() {
		contatos = new ArrayList<Contato>();
	}
	
	//Métodos 
	private int findContato(String name) {
		ArrayList<Contato> contatos = getContatos();
		
		for(int i = 0; i < contatos.size(); i++) {
			Contato c = contatos.get(i);
			
			if(c.getName().equals(name)) {
				return i;
			}
		}	
		
		return -1;
	}
	
	public void addContato(String name, ArrayList<Fone> fones) {
		Contato contato = null;
		int indice = findContato(name);
		
		if(indice == -1) {
			contato = new Contato(name);
			contatos.add(contato);
		} else {
			contato = getContatos().get(indice);
		}
		
		for(int i = 0; i < fones.size(); i++) {
			contato.addFone(fones.get(i).getLabel(), fones.get(i).getNumber());
			System.out.println("Telefone adicionado com sucesso");
		}
	}
	
	public boolean rmContanto(String name) {
		int indiceContato = findContato(name);
		
		if(indiceContato == -1) {
			System.out.println("Este contato não existe");
		} else {
			contatos.remove(indiceContato);
			System.out.println("Contato removido com sucesso");
			return true;
		}
		
		return false;
	}
	
	public ArrayList<Contato> search(String pattern) {
		ArrayList<Contato> ContatosAchados = new ArrayList<Contato>();
		Pattern p = Pattern.compile(pattern);
		
		for(int i = 0; i < contatos.size(); i++) {
			int contador = 0;
			Matcher m = p.matcher(contatos.get(i).getName());
			
			while(m.find()) {
				ContatosAchados.add(contatos.get(i));
				contador++;
			}
			
			if(contador == 0) {
				ArrayList<Fone> fones = contatos.get(i).getFones();
				
				for(int k = 0; k < fones.size(); k++) {
					Matcher s = p.matcher(fones.get(k).getLabel());
					Matcher d = p.matcher(fones.get(k).getNumber());
					while(s.find() || d.find()) {
						ContatosAchados.add(contatos.get(i));
					}
				}	
			}
		}
		return ContatosAchados;
	}
	
	
	public ArrayList<Contato> getContatos() {
		return contatos;
	}
	
	public int getIndiceContato(String nome) {
		return findContato(nome);
	}
	
	public String toString() {
		String dados = "";
		
		if(contatos.size() == 0) {
			dados += "Sem contatos";
		} else {
			for(Contato contato : contatos) {
				dados += contato + "\n";
			}		
		}
		
		return dados;
	}
	
}
