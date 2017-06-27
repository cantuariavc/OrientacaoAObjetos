package dados.disciplina;
import dados.professor.*;

public class Estagio extends Disciplina {

	private String localDeEstagio;
	private String responsavel;
	private Professor professor;
	
	public Estagio() {
		
	}
	
	public Estagio(String nome, int cargaHoraria, String localDeEstagio, String responsavel, Professor professor) {
		super(nome, cargaHoraria);
		setLocalDeEstagio(localDeEstagio);
		setResponsavel(responsavel);
		setProfessor(professor);
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

	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
