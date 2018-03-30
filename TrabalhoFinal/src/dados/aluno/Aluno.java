package dados.aluno;

import java.util.ArrayList;

public class Aluno {
	
	private int matricula;
	private String nome;
	private String semestreIngresso;
	
	static private ArrayList<Graduacao> listaGraduacao;
	static private ArrayList<PosGraduacao> listaPosGraduacao;
	static private ArrayList<Especial> listaEspecial;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSemestreIngresso() {
		return semestreIngresso;
	}
	public void setSemestreIngresso(String semestreIngresso) {
		this.semestreIngresso = semestreIngresso;
	}
	
	public Aluno() {
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
