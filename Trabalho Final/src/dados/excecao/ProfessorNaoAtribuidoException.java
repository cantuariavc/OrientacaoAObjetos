package dados.excecao;

public class ProfessorNaoAtribuidoException extends Exception {

	public ProfessorNaoAtribuidoException(String msg) {
		super(msg);
	}
	
	public ProfessorNaoAtribuidoException(String msg, Throwable cause){
        super(msg, cause);
    }
	
}
