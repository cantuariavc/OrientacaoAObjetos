package controle.executora;

import controle.aluno.ControleAluno;
import controle.disciplina.ControleDisciplina;
import controle.professor.ControleProfessor;
import controle.turma.ControleTurma;
import visao.principal.*;

public class Executora {
	
	static Principal visao;
	public static ControleAluno aluno;
	public static ControleProfessor professor;
	public static ControleDisciplina disciplina;
	public static ControleTurma turma;
	
	public static void main(String[] args) {
		
		aluno = new ControleAluno();
		professor = new ControleProfessor();
		disciplina = new ControleDisciplina();
		turma = new ControleTurma();
		
		visao = new Principal();
		
	}

}
