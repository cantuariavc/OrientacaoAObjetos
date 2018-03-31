package dados;

public class Celsius extends Termometro
{

	public Celsius(double temperatura)
	{
		super(temperatura);
	}
	
	public void converte()
	{
		double celsius = getTemperatura();
		setCelsius(celsius);
		double fahrenheit = getTemperatura() * 9 / 5 + 32;
		setFahrenheit(fahrenheit);
		double kelvin = getTemperatura() + 273;
		setKelvin(kelvin);
	}

}
