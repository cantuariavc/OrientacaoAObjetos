package dados.professor;

import java.util.ArrayList;

public class Professor {

	private int matriculaSiape;
	private int matriculaFUP;
	private String formacao;
	private float salario;
	
	static private ArrayList<Auxiliar> listaAuxiliar;
	static private ArrayList<Assistente> listaAssistente;
	static private ArrayList<Adjunto> listaAdjunto;
	static private ArrayList<Associado> listaAssociado;
	static private ArrayList<Titular> listaTitular;
	static private ArrayList<Professor> listaProfessor;
	
	public int getMatriculaSiape() {
		return matriculaSiape;
	}
	public void setMatriculaSiape(int matriculaSiape) {
		this.matriculaSiape = matriculaSiape;
	}
	
	public int getMatriculaFUP() {
		return matriculaFUP;
	}
	public void setMatriculaFUP(int matriculaFUP) {
		this.matriculaFUP = matriculaFUP;
	}
	
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public Professor() {
		listaAuxiliar = new ArrayList<>();
		listaAssistente = new ArrayList<>();
		listaAdjunto = new ArrayList<>();
		listaAssociado = new ArrayList<>();
		listaTitular = new ArrayList<>();
	}

	public void cadastraAuxiliar(Auxiliar professorAuxiliar) {
		listaAuxiliar.add(professorAuxiliar);
		listaProfessor.add(professorAuxiliar);
	}
	
	public void cadastraAssistente(Assistente professorAssistente) {
		listaAssistente.add(professorAssistente);
		listaProfessor.add(professorAssistente);

	}
	
	public void cadastraAdjunto(Adjunto professorAdjunto) {
		listaAdjunto.add(professorAdjunto);
		listaProfessor.add(professorAdjunto);

	}
	
	public void cadastraAssociado(Associado professorAssociado) {
		listaAssociado.add(professorAssociado);
		listaProfessor.add(professorAssociado);

	}
	
	public void cadastraTitular(Titular professorTitular) {
		listaTitular.add(professorTitular);
		listaProfessor.add(professorTitular);

	}
	
	public Professor confirmaProfessor(int professor) {
		for (Professor p : listaProfessor) {
			if (p.getMatriculaSiape() == professor) {
				return p;
			}
		}
		return null;
	}
	
}
