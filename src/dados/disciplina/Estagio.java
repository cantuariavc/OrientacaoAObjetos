package dados.disciplina;

public class Estagio extends Disciplina {

	private String localDeEstagio;
	private String responsavel;
	
	public Estagio() {
		
	}
	
	public Estagio(String nome, int cargaHoraria, String localDeEstagio, String responsavel) {
		super(nome, cargaHoraria);
		setLocalDeEstagio(localDeEstagio);
		setResponsavel(responsavel);
	}
	
	
	public String getLocalDeEstagio() {
		return localDeEstagio;
	}
	public void setLocalDeEstagio(String localDeEstagio) {
		this.localDeEstagio = localDeEstagio;
	}
	
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
}
