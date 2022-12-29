package convertirTemperatura;

import javax.swing.JOptionPane;

public class convertirTemperatura {

	public double ConvertirCelciusAfarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
		farenheit = (double) Math.round(farenheit * 100d)/100;
		JOptionPane.showConfirmDialog(null, +valor+ " Grados Celsius son: " + farenheit + " Grados Farenheit");
		return farenheit;
	}
	public void ConvertirCelciusAkelvin(double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round(kelvin * 100d)/100;
		JOptionPane.showConfirmDialog(null, +valor+ " Grados Celsius son: " + kelvin + " Grados kelvin");
		
	}
	
	public void ConvertirfarenheitAcelcius(double valor) {
		double Celsius = (valor - 32) / 1.8;
		Celsius = (double) Math.round(Celsius * 100d)/100;
		JOptionPane.showConfirmDialog(null, +valor+ " Grados Farenheit son: " + Celsius + " Grados Celsius");
		
	}
	
	public double ConvertirKevintAcelsius(double valor) {
		double KevinCelsius = valor + 273.15;
		KevinCelsius = (double) Math.round(KevinCelsius * 100d)/100;
		JOptionPane.showConfirmDialog(null, +valor+ " Grados Kevin son: " + KevinCelsius + " Grados Celsius");
		return KevinCelsius;
	}
	
	public double ConvertirKevintAfarenheit(double valor) {
		double KevinFarenheit = ConvertirKevintAcelsius(valor);
		KevinFarenheit = ConvertirCelciusAfarenheit(KevinFarenheit);
		KevinFarenheit = (double) Math.round(KevinFarenheit * 100d)/100;
		JOptionPane.showConfirmDialog(null, +valor+ " Grados Farenheit son: " + KevinFarenheit + " Grados Celsius");
		return KevinFarenheit;
	}
	
	
}
