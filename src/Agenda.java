import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Agenda {
	
	Set<Contato> contatos = new HashSet<>();
	
	public void inserir(String nome, String fone, String email , int id) {
		Contato c = new Contato (nome, fone,email,id);
		contatos.add(c);	
	}
	
	public Contato buscar(int id) {
		
		for(Contato contato : contatos) {
			if(contato.getId() == id) {
				return contato;
			}
		}
		
		return null;
		
		
	}
	
	public void NomeAtualizar(int id, String nomenovo) {
			
		Contato c = buscar(id);
		c.setNome(nomenovo);
		
		System.out.println("Nome: " + nomenovo + "\nAtualização feita com sucesso!!!\n");
	}
	
	
	public void FoneAtualizar(int id, String fonenovo) {
		Contato c = buscar(id);
		c.setTelefone(fonenovo);
		System.out.println("Telefone:  " + fonenovo + "\nAtualização feita com sucesso!!\n");
	}
	
	
	
	public void EmailAtualiza(int id,String emailnovo) {
		Contato c = buscar(id);
		c.setEmail(emailnovo);
		
		System.out.println("ID:  " + emailnovo + "\nAtualização feita com sucesso!!\n");
	}
	
	
	
	public ArrayList<Contato> hashToArraylist(Set<Contato> contatos){
		ArrayList<Contato> cont = new ArrayList<Contato>();
			for (Contato contato : contatos) {
				cont.add(contato);
			}
			return cont;
		
	}
	
	
	public void NomeListar() {
		
		NomeCompara nomecompara = new NomeCompara();
		ArrayList<Contato> tato = hashToArraylist(contatos);
		Collections.sort(tato, nomecompara);
		System.out.println("CONTATOS LISTADOS POR NOMES\n");
		for(Contato c : tato) {
			System.out.println(c);
		}
		
		System.out.println("_________________________________");
	}
	
	public void IdListar() {
		IdCompara idcompara = new IdCompara();
		ArrayList<Contato> tato = hashToArraylist(contatos);
		Collections.sort(tato, idcompara);
		System.out.println("CONTATOS LISTADOS POR ID\n");
		for(Contato c : tato) {
			System.out.println(c);
		}
		
		System.out.println("_________________________________");
	}
	
	
	public void remover(int id) {
		boolean remove = false;
		Contato c = buscar(id);
		
		remove = contatos.remove(c);
		if(remove) {
			System.out.println("Id do Contato " + id + "\nContato removido com sucesso!!\n");
		}
		
		else {
			throw new ContatoNaoExisteException ("Contato nao localizado"); 
		}
	}
	
	
	
	
	
}
