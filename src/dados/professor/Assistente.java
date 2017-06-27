package dados.professor;

public class Assistente extends Auxiliar {

	private String mestrado;
	private int anoMestrado;
	private String tituloDissertacao;
	
	public Assistente() {
		
	}
	
	public Assistente(int matriculaSiape, int matriculaFUP, String formacao, float salario, String graduacao, int anoGraduacao, 
								String mestrado, int anoMestrado, String tituloDissertacao) {
		super(matriculaSiape, matriculaFUP, formacao, salario, graduacao, anoGraduacao);
		setMestrado(mestrado);
		setAnoMestrado(anoMestrado);
		setTituloDissertacao(tituloDissertacao);
	}
	
	
	public String getMestrado() {
		return mestrado;
	}
	public void setMestrado(String mestrado) {
		this.mestrado = mestrado;
	}
	
	public int getAnoMestrado() {
		return anoMestrado;
	}
	public void setAnoMestrado(int anoMestrado) {
		this.anoMestrado = anoMestrado;
	}
	
	public String getTituloDissertacao() {
		return tituloDissertacao;
	}
	public void setTituloDissertacao(String tituloDissertacao) {
		this.tituloDissertacao = tituloDissertacao;
	}
	
}
