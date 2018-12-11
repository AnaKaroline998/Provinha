
public class ContatoNaoExisteException extends NullPointerException {

	private static final long serialVersionUID = 1L;
	
	ContatoNaoExisteException(){
		super();
	}
	
	ContatoNaoExisteException(String mensagem){
		super(mensagem);
		
	}
	

}
