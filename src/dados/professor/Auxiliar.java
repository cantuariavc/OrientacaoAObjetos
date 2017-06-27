package dados.professor;

public class Auxiliar extends Professor {

	private String graduacao;
	private int anoGraduacao;
	
	public Auxiliar() {
		
	}
	
	public Auxiliar(int matriculaSiape, int matriculaFUP, String formacao, float salario, String graduacao, int anoGraduacao) {
		setMatriculaSiape(matriculaSiape);
		setMatriculaFUP(matriculaFUP);
		setFormacao(formacao);
		setSalario(salario);
		setGraduacao(graduacao);
		setAnoGraduacao(anoGraduacao);
	}
	
	
	public String getGraduacao() {
		return graduacao;
	}
	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}
	
	public int getAnoGraduacao() {
		return anoGraduacao;
	}
	public void setAnoGraduacao(int anoGraduacao) {
		this.anoGraduacao = anoGraduacao;
	}
	
}
