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
	
	public ControleProfessor() {
		listaAuxiliar = new ArrayList<>();
		listaAssistente = new ArrayList<>();
		listaAdjunto = new ArrayList<>();
		listaAssociado = new ArrayList<>();
		listaTitular = new ArrayList<>();
	}

	public void cadastraAuxiliar(Auxiliar professorAuxiliar) {
		listaAuxiliar.add(professorAuxiliar);
	}
	
	public void cadastraAssistente(Assistente professorAssistente) {
		listaAssistente.add(professorAssistente);
	}
	
	public void cadastraAdjunto(Adjunto professorAdjunto) {
		listaAdjunto.add(professorAdjunto);
	}
	
	public void cadastraAssociado(Associado professorAssociado) {
		listaAssociado.add(professorAssociado);
	}
	
	public void cadastraTitular(Titular professorTitular) {
		listaTitular.add(professorTitular);
	}
	
}
