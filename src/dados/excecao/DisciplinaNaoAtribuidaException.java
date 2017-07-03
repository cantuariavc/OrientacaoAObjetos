package dados.excecao;

public class DisciplinaNaoAtribuidaException extends Exception {

	public DisciplinaNaoAtribuidaException(String msg) {
		super(msg);
	}
	
	public DisciplinaNaoAtribuidaException(String msg, Throwable cause){
        super(msg, cause);
    }
	
}
