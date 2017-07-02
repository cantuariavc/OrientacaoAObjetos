package controle.professor;

import java.util.ArrayList;

import dados.disciplina.Disciplina;
import dados.professor.*;

public class ControleProfessor {
	private ArrayList<Auxiliar> listaAuxiliar;
	private ArrayList<Assistente> listaAssistente;
	private ArrayList<Adjunto> listaAdjunto;
	private ArrayList<Associado> listaAssociado;
	private ArrayList<Titular> listaTitular;
	private ArrayList<Professor> listaProfessor;
	
	public ControleProfessor() {
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
