package principal;
import dados.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal
{

	public static void main(String[] args)
	{
		Scanner leTeclado = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("#,###.##");
		Termometro umaTemperatura = null;

		int opcao = 0;
		double temperatura = 0;
		int continua = 0;

		do
		{
			do
			{			
				System.out.println("Qual é a unidade a ser convertida?");
				System.out.println("1 - Celsius");
				System.out.println("2 - Fahrenheit");
				System.out.println("3 - Kelvin");
				System.out.print("Opção: ");
				opcao = leTeclado.nextInt();
				System.out.println();
			}
			while (opcao < 1 || opcao > 3);
	
			System.out.print("Qual valor a ser convertido? ");
			temperatura = leTeclado.nextDouble();
			System.out.println();
			
			switch(opcao)
			{
				case 1:
					umaTemperatura = new Celsius(temperatura);
					break;
				
				case 2:
					umaTemperatura = new Fahrenheit(temperatura);
					break;
					
				case 3:
					umaTemperatura = new Kelvin(temperatura);
					break;
					
				default:
					break;
			}
			
			umaTemperatura.converte();
						
			System.out.println("Temperatura em Celsius: " + mascara.format(umaTemperatura.getCelsius()) + " ºC");
			System.out.println("Temperatura em Fahrenheit: " + mascara.format(umaTemperatura.getFahrenheit()) + " ºF");
			System.out.println("Temperatura em Kelvin: " + mascara.format(umaTemperatura.getKelvin()) + " K");
			
			System.out.println();
			System.out.println("Deseja continuar?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			System.out.print("Opção: ");
			continua = leTeclado.nextInt();
			System.out.println();
		}
		while (continua == 1);

	}

}