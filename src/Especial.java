import java.util.Date;

public class Especial extends PosGraduacao {

	private boolean taxaPaga;
	private String semestreCursando;
	
	public Especial() {
		
	}
	
	public Especial(int matricula, String nome, String semestreIngresso, String semestreQualificacao, Date dataDefesa, Professor professor, boolean taxaPaga, String semestreCursando) {
		super(matricula, nome, semestreIngresso, semestreQualificacao, dataDefesa, professor);
		setTaxaPaga(taxaPaga);
		setSemestreCursando(semestreCursando);
	}
	
	
	public boolean isTaxaPaga() {
		return taxaPaga;
	}
	public void setTaxaPaga(boolean taxaPaga) {
		this.taxaPaga = taxaPaga;
	}
	
	public String getSemestreCursando() {
		return semestreCursando;
	}
	public void setSemestreCursando(String semestreCursando) {
		this.semestreCursando = semestreCursando;
	}
	
}
