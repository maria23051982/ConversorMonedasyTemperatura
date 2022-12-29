package convertirDivisas;

import javax.swing.JOptionPane;

public class function {
	convertirMonedas monedas = new convertirMonedas();

	
	public void convertirMonedas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda que desea convertir ", "monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"De pesos a Dolar"	, "De pesos a Euros", " De pesos a Libras esterlinas", "De pesos a yen", "De pesos a Won Coreanos", "De Dolar a pesos"	, "De Euros a pesos", "De Libras esterlinas a pesos", "de yen a pesos", "De Won Coreanos a pesos"},
		
							"Seleccion")).toString();
	switch (opcion) {
	case "De pesos a Dolar": {
		
		monedas.convertirPesosaDolares(Minput);
		break;
	}
	case "De pesos a Euros": {
		
		monedas.convertirPesosaEuros(Minput);
		break;
	}
	case "De pesos a Libras esterlinas": {
		
		monedas.convertirPesosaLibras(Minput);
		break;
	}
	case "De pesos a Yen": {
		
		monedas.convertirPesosaYen(Minput);
		break;
	}
	case "De pesos a Won Coreanos": {
		
		monedas.convertirPesosaWon(Minput);
		break;
	}
	case "De Dolar a pesos": {
		
		monedas.convertirDolaresaPesos(Minput);
		break;
	}
	
	case "De Euro a pesos": {
		
		monedas.convertirEurosaPesos(Minput);
		break;
	
	}
	case "De Libras a pesos": {
		
		monedas.convertirLibrasaPesos(Minput);
		break;
	}
	case "De Yenes a pesos": {
		
		monedas.convertirYenaPesos(Minput);
		break;
	}
	
	case "De Wons coreanos a pesos": {
		
		monedas.convertirWonapesos(Minput);
		break;
	}
	}
	}
}

	
	
	
	
	

