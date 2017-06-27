package dados.professor;

import java.util.Date;

public class Titular extends Associado {

	private Date concurso;
	private Date dataDeAdmissao;
	
	public Titular() {
		
	}
	
	public Titular(int matriculaSiape, int matriculaFUP, String formacao, float salario, String graduacao, int anoGraduacao, 
						String mestrado, int anoMestrado, String tituloDissertacao, String doutorado, int anoDoutorado, String tituloTese, 
								String areaDePesquisa, Date concurso, Date dataDeAdmissao) {
		super(matriculaSiape, matriculaFUP, formacao, salario, graduacao, anoGraduacao, mestrado, anoMestrado, tituloDissertacao, 
					doutorado, anoDoutorado, tituloTese, areaDePesquisa);
		setConcurso(concurso);
		setDataDeAdmissao(dataDeAdmissao);		
	}
	
	
	public Date getConcurso() {
		return concurso;
	}
	public void setConcurso(Date concurso) {
		this.concurso = concurso;
	}
	
	public Date getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setDataDeAdmissao(Date dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
}
