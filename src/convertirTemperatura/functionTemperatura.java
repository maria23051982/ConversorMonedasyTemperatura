package convertirTemperatura;

import javax.swing.JOptionPane;

public class functionTemperatura {
	
	convertirTemperatura convertirTemperatura = new convertirTemperatura();
	
	public void convertirTemperatura(double Minput) {
		
		String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda que desea convertir ", "monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"De grados Celcius a Farenheit"	, "De grados Celcius a Kelvin", " De grados Farenheit a Celcius", "De grados Kelvin a Celcius", "De grados Kelvin a Farenheit"},
		
							"Seleccion")).toString();
	switch (opcion) {
	case "De grados Celcius a Farenheit": {
		
		convertirTemperatura.ConvertirCelciusAfarenheit(Minput);
		break;
	}
	case "De grados Celcius a Kelvin": {
		
		convertirTemperatura.ConvertirCelciusAkelvin(Minput);
		break;
	}
	case " De grados Farenheit a Celcius": {
		
		convertirTemperatura.ConvertirfarenheitAcelcius(Minput);
		break;
	}
	case "De grados Kelvin a Celcius": {
		
		convertirTemperatura.ConvertirKevintAcelsius(Minput);
		break;
	}
	case "De grados Kelvin a Farenheit": {
		
		convertirTemperatura.ConvertirKevintAfarenheit(Minput);
		break;
	}
	
	}
	}


	
	
	
	
	


	}


