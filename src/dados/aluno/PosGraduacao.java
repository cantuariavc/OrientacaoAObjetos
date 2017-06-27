package dados.aluno;
import java.util.Date;

import dados.professor.Professor;

public class PosGraduacao extends Aluno {

	private String semestreQualificacao;
	private Date dataDefesa;
	private Professor professor;
	
	public PosGraduacao() {
		
	}

	public PosGraduacao(int matricula, String nome, String semestreIngresso, String semestreQualificacao, Date dataDefesa, Professor professor) {
		setMatricula(matricula);
		setNome(nome);
		setSemestreIngresso(semestreIngresso);
		setSemestreQualificacao(semestreQualificacao);
		setDataDefesa(dataDefesa);
		setProfessor(professor);
	}
	
	
	public String getSemestreQualificacao() {
		return semestreQualificacao;
	}
	public void setSemestreQualificacao(String semestreQualificacao) {
		this.semestreQualificacao = semestreQualificacao;
	}

	public Date getDataDefesa() {
		return dataDefesa;
	}
	public void setDataDefesa(Date dataDefesa) {
		this.dataDefesa = dataDefesa;
	}

	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
