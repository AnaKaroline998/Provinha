
public class Teste {

	public static void main(String[] args) {
		
		Agenda a = new Agenda();
		
		a.inserir("Luiza", "98948444343", "lluiza@gmail.com", 88);
		a.inserir("Renato", "4734743", "renato@gmail.com", 3);
		a.inserir("Renaldo", "888989", "renaldo@gmail.com", 4);
		a.inserir("Eliza", "828998323", "eliza@gmail.com", 9);
		a.inserir("Karol", "8444343", "karol@gmail.com", 8);
		
		a.NomeListar();
		a.NomeAtualizar(88, "Ana Luiza");
		a.FoneAtualizar(4, "844484784884");
		a.EmailAtualiza(88, "analuiza@gmail.com");
		
		a.remover(8);
		
		a.IdListar();
		a.remover(60);
		
		
		
		
		
		
		
		
	}

}
