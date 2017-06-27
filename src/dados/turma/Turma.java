package dados.turma;
import dados.disciplina.*;
import dados.professor.*;

public class Turma {

	private int codigo;
	private String horario;
	private Disciplina disciplina;
	private Professor professor;
	
	public Turma() {
		
	}
	
	public Turma(int codigo, String horario, Disciplina disciplina, Professor professor) {
		setCodigo(codigo);
		setHorario(horario);
		setDisciplina(disciplina);
		setProfessor(professor);
	}

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
