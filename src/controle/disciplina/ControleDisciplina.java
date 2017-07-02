package controle.disciplina;

import java.util.ArrayList;
import dados.disciplina.*;

public class ControleDisciplina {
	private ArrayList<Disciplina> listaDisciplina;
	private ArrayList<Estagio> listaEstagio;

	public ControleDisciplina() {
		listaDisciplina = new ArrayList<>();
		listaEstagio = new ArrayList<>();
	}
	
	public void cadastraDisciplina(Disciplina disciplina) {
		listaDisciplina.add(disciplina);
	}
	
	public void cadastraEstagio(Estagio estagio) {
		listaEstagio.add(estagio);
	}
	
}
