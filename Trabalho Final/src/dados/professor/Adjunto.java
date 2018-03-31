package dados.professor;

public class Adjunto extends Assistente {

	private String doutorado;
	private int anoDoutorado;
	private String tituloTese;
	
	public Adjunto() {
		
	}
	
	public Adjunto(int matriculaSiape, int matriculaFUP, String formacao, float salario, String graduacao, int anoGraduacao, 
						String mestrado, int anoMestrado, String tituloDissertacao, String doutorado, int anoDoutorado, String tituloTese) {
		super(matriculaSiape, matriculaFUP, formacao, salario, graduacao, anoGraduacao, mestrado, anoMestrado, tituloDissertacao);
		setDoutorado(doutorado);
		setAnoDoutorado(anoDoutorado);
		setTituloTese(tituloTese);
	}
	
	
	public String getDoutorado() {
		return doutorado;
	}
	public void setDoutorado(String doutorado) {
		this.doutorado = doutorado;
	}
	
	public int getAnoDoutorado() {
		return anoDoutorado;
	}
	public void setAnoDoutorado(int anoDoutorado) {
		this.anoDoutorado = anoDoutorado;
	}
	
	public String getTituloTese() {
		return tituloTese;
	}
	public void setTituloTese(String tituloTese) {
		this.tituloTese = tituloTese;
	}
	
}
