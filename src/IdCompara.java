import java.util.Comparator;

public class IdCompara implements Comparator <Contato> {

	@Override
	public int compare(Contato i1, Contato i2) {
		return i1.getId() - i2.getId();
	}
	
	

}
