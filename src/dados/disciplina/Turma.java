package dados.disciplina;
import dados.professor.*;

public class Turma extends Disciplina {

	private int codigo;
	private String horario;
	private Professor professor;
	
	public Turma() {
		
	}
	
	public Turma(String nome, int cargaHoraria, int codigo, String horario, Professor professor) {
		super(nome, cargaHoraria);
		setCodigo(codigo);
		setHorario(horario);
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

	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
