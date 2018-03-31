package dados;

public class Fahrenheit extends Termometro
{

	public Fahrenheit(double fahrenheit)
	{
		super(fahrenheit);
	}
	
	public void converte()
	{
		double celsius = (getTemperatura() - 32) * 5 / 9;
		setCelsius(celsius);
		double fahrenheit = getTemperatura() ;
		setFahrenheit(fahrenheit);
		double kelvin = (getTemperatura() - 32) * 5 / 9 + 273;
		setKelvin(kelvin);
	}

}
