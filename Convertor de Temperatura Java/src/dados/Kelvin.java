package dados;

public class Kelvin extends Termometro
{

	public Kelvin(double kelvin)
	{
		super(kelvin);
	}

	public void converte()
	{
		double celsius = getTemperatura() - 273;
		setCelsius(celsius);
		double fahrenheit = (getTemperatura() - 273) * 9 / 5 + 32;
		setFahrenheit(fahrenheit);
		double kelvin = getTemperatura();
		setKelvin(kelvin);
	}
	
}
