package dados;

public abstract class Termometro
{
	private double temperatura;
	private double celsius;
	private double fahrenheit;
	private double kelvin;
	
	public Termometro(double temperatura)
	{
		setTemperatura(temperatura);
		this.celsius = 0;
		this.fahrenheit = 0;
		this.kelvin = 0;
	}
	
	public void setTemperatura(double temperatura)
	{
		this.temperatura = temperatura;
	}
	
	public double getTemperatura()
	{
		return temperatura;
	}
	
	public void setCelsius(double celsius)
	{
		this.celsius = celsius;
	}
	
	public double getCelsius()
	{
		return celsius;
	}
	
	public void setFahrenheit(double fahrenheit)
	{
		this.fahrenheit = fahrenheit;
	}
	
	public double getFahrenheit()
	{
		return fahrenheit;
	}
	
	public void setKelvin(double kelvin)
	{
		this.kelvin = kelvin;
	}
	
	public double getKelvin()
	{
		return kelvin;
	}
	
	public void converte()
	{}
	
}
