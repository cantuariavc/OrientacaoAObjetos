package dados.disciplina;

import java.util.ArrayList;

public class Disciplina {

	private String nome;
	private int cargaHoraria;
	
	static private ArrayList<Disciplina> listaDisciplina;
	static private ArrayList<Estagio> listaEstagio;
	
	public Disciplina() {
		listaDisciplina = new ArrayList<>();
		listaEstagio = new ArrayList<>();
	}
	
	public Disciplina(String nome, int cargaHoraria) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public void cadastraDisciplina(Disciplina disciplina) {
		listaDisciplina.add(disciplina);
	}
	
	public void cadastraEstagio(Estagio estagio) {
		listaEstagio.add(estagio);
		listaDisciplina.add(estagio);

	}
	
	public Disciplina confirmaDisciplina(String disciplina) {
		for (Disciplina d : listaDisciplina) {
			if (d.getNome() == disciplina) {
				return d;
			}
		}
		return null;
	}
	
}
