package controle.aluno;

import java.util.ArrayList;
import dados.aluno.*;

public class controleAluno {
	private ArrayList<Graduacao> listaGraduacao;
	private ArrayList<PosGraduacao> listaPosGraduacao;
	private ArrayList<Especial> listaEspecial;
	
	public controleAluno() {
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
	
	public void cadastrarEspecial(Especial alunoEspecial) {
		listaEspecial.add(alunoEspecial);
	}
	
}
