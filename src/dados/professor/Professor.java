package dados.professor;

public abstract class Professor {

	private int matriculaSiape;
	private int matriculaFUP;
	private String formacao;
	private float salario;
	
	
	public int getMatriculaSiape() {
		return matriculaSiape;
	}
	public void setMatriculaSiape(int matriculaSiape) {
		this.matriculaSiape = matriculaSiape;
	}
	
	public int getMatriculaFUP() {
		return matriculaFUP;
	}
	public void setMatriculaFUP(int matriculaFUP) {
		this.matriculaFUP = matriculaFUP;
	}
	
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
}
