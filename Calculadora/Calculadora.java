import java.text.DecimalFormat;

public class Calculadora {
	private String resultado;
	DecimalFormat df = new DecimalFormat("#,##0.00");
	
	public void adicao(String numeroX, String numeroY) throws Exception {
		
		setResultado(df.format(Double.parseDouble(numeroX) + Double.parseDouble(numeroY)));
	}
	
	public void subtracao(String numeroX, String numeroY) throws Exception {
		setResultado(df.format(Double.parseDouble(numeroX) - Double.parseDouble(numeroY)));
	}
	
	public void multiplicacao(String numeroX, String numeroY) throws Exception {
		setResultado(df.format(Double.parseDouble(numeroX) * Double.parseDouble(numeroY)));
	}
	
	public void divisao(String numeroX, String numeroY) throws Exception {
		setResultado(df.format(Double.parseDouble(numeroX) / Double.parseDouble(numeroY)));
	}
	
	public void exponenciacao(String numeroX, String numeroY) throws Exception {
		setResultado(df.format(Math.pow(Double.parseDouble(numeroX), Double.parseDouble(numeroY))));
	}

	public void logaritimo(String numeroX) throws Exception {
		setResultado(df.format(Math.log(Double.parseDouble(numeroX))));
	}
	
	public void logaritimoBaseD(String numeroX, String numeroY) throws Exception {
		setResultado(df.format(Math.log(Double.parseDouble(numeroX))/Math.log(Double.parseDouble(numeroY))));
	}
	
	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
}
