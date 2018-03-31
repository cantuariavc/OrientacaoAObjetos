package controle.executora;

import dados.aluno.Aluno;
import dados.disciplina.Disciplina;
import dados.professor.Professor;
import dados.turma.Turma;
import visao.principal.*;

public class Executora {
	
	static Principal visao;
	public static Aluno aluno;
	public static Professor professor;
	public static Disciplina disciplina;
	public static Turma turma;
	
	public static void main(String[] args) {
		
		aluno = new Aluno();
		professor = new Professor();
		disciplina = new Disciplina();
		turma = new Turma();
		
		visao = new Principal();
		
	}

}
