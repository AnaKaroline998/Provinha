
public class Contato {
	
	String nome;
	String fone;
	String email;
	int id;
	
Contato(String nome, String fone, String email, int id){
		
		this.nome=nome;
		this.fone=fone;
		this.email = email;
		this.id = id;
	}
	
	public void ImprimeContato(){
				
			System.out.println("Nome: "+nome);
			System.out.println("Telefone: "+fone);
			System.out.println("Id: " +id);
			System.out.println("Email: "+email);
			
		
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + fone + ", email=" + email + ", id=" + id + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return fone;
	}

	public void setTelefone(String telefone) {
		this.fone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}
