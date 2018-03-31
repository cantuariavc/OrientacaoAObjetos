package dados.aluno;
import java.util.Date;

public class Graduacao extends Aluno {

	private String formaIngresso;
	private String curso;
	private Date provavelFormatura;
	
	public Graduacao() {
		
	}
	
	public Graduacao(int matricula, String nome, String semestreIngresso, String formaIngresso, String curso, Date provavelFormatura) {
		setMatricula(matricula);
		setNome(nome);
		setSemestreIngresso(semestreIngresso);
		setFormaIngresso(formaIngresso);
		setCurso(curso);
		setProvavelFormatura(provavelFormatura);
	}

	
	public String getFormaIngresso() {
		return formaIngresso;
	}
	public void setFormaIngresso(String formaIngresso) {
		this.formaIngresso = formaIngresso;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Date getProvavelFormatura() {
		return provavelFormatura;
	}
	public void setProvavelFormatura(Date provavelFormatura) {
		this.provavelFormatura = provavelFormatura;
	}
	
}
