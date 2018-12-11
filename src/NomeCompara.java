import java.util.Comparator;

public class NomeCompara implements Comparator <Contato> {

	@Override
	public int compare(Contato n1, Contato n2) {
		
		return n1.getNome().compareTo(n2.getNome());
	}
	
	

}
