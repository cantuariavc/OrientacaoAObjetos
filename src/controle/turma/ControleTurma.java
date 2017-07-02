package controle.turma;

import java.util.ArrayList;
import dados.turma.Turma;

public class ControleTurma {
	private ArrayList<Turma> listaTurma;
	
	public ControleTurma() {
		listaTurma = new ArrayList<>();
	}
	
	public void cadastraTurma(Turma turma) {
		listaTurma.add(turma);
	}

}
