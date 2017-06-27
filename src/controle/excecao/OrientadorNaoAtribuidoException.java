package controle.excecao;

public class OrientadorNaoAtribuidoException extends Exception {

	public OrientadorNaoAtribuidoException(String msg) {
		super(msg);
	}
	
	public OrientadorNaoAtribuidoException(String msg, Throwable cause){
        super(msg, cause);
    }
	
}
