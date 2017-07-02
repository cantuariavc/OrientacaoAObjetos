package controle.aluno;

import java.util.ArrayList;
import dados.aluno.*;

public class ControleAluno {
	private ArrayList<Graduacao> listaGraduacao;
	private ArrayList<PosGraduacao> listaPosGraduacao;
	private ArrayList<Especial> listaEspecial;
	
	public ControleAluno() {
		listaGraduacao = new ArrayList<>();
		listaPosGraduacao = new ArrayList<>();
		listaEspecial = new ArrayList<>();
	}
	
	public void cadastraGraduacao(Graduacao alunoGraduacao) {
		listaGraduacao.add(alunoGraduacao);
	}
	
	public void cadastraPosGraduacao(PosGraduacao alunoPosGraduacao) {
		listaPosGraduacao.add(alunoPosGraduacao);
	}
	
	public void cadastraEspecial(Especial alunoEspecial) {
		listaEspecial.add(alunoEspecial);
	}
	
}
