
public abstract class Aluno {
	
	private int matricula;
	private String nome;
	private String semestreIngresso;
	
	public Aluno() {
		
	}
	
	public Aluno(int matricula, String nome, String semestreIngresso) {
		setMatricula(matricula);
		setNome(nome);
		setSemestreIngresso(semestreIngresso);
	}
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSemestreIngresso() {
		return semestreIngresso;
	}
	public void setSemestreIngresso(String semestreIngresso) {
		this.semestreIngresso = semestreIngresso;
	}
	
}
