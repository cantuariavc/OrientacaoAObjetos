package dados.professor;

public class Associado extends Adjunto {

	private String areaDePesquisa;

	public Associado() {
		
	}
	
	public Associado(int matriculaSiape, int matriculaFUP, String formacao, float salario, String graduacao, int anoGraduacao, 
							String mestrado, int anoMestrado, String tituloDissertacao, String doutorado, int anoDoutorado, String tituloTese, 
									String areaDePesquisa) {
		super(matriculaSiape, matriculaFUP, formacao, salario, graduacao, anoGraduacao, mestrado, anoMestrado, tituloDissertacao, 
					doutorado, anoDoutorado, tituloTese);
		setAreaDePesquisa(areaDePesquisa);
	}
	
	
	public String getAreaDePesquisa() {
		return areaDePesquisa;
	}
	public void setAreaDePesquisa(String areaDePesquisa) {
		this.areaDePesquisa = areaDePesquisa;
	}
	
}
