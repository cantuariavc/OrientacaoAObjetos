package controle.excecao;

public class InformacaoFaltanteException extends Exception {

	public InformacaoFaltanteException(String msg) {
		super(msg);
	}
	
	public InformacaoFaltanteException(String msg, Throwable cause){
        super(msg, cause);
    }
	
}
