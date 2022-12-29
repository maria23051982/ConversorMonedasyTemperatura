package conversorMonedas;

import javax.swing.JOptionPane;

import convertirDivisas.function;
import convertirTemperatura.functionTemperatura;

public class principal {

	public static void main(String[] args) {
		
		function monedas= new function();
		functionTemperatura temperaturas = new functionTemperatura();
		
		while(true) {
		String opciones = (JOptionPane.showInputDialog(null,"seleccione una opcion", "menu", 
				JOptionPane.QUESTION_MESSAGE, null,new Object[] {"conversor de monedas", "conversor de temperatura"}, "Seleccion")).toString();
		
		switch (opciones) {
		case "conversor de monedas": 
			String input = JOptionPane.showInputDialog("Ingrese la cantidad de divisas a convertir: ");
					if(validarNumero(input)==true) {
						double Minput = Double.parseDouble(input);
						monedas.convertirMonedas(Minput);
						
						int respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion");
						
						if(JOptionPane.OK_OPTION == respuesta) {
							System.out.println("selecciona otra opcion");
						}else {
							JOptionPane.showMessageDialog(null, "Finalizacion del programa");
						} 
					}
					else {
							JOptionPane.showMessageDialog(null, "valor invalido");
						}
						break;
						
					
		case "conversor de temperatura": 
			input = JOptionPane.showInputDialog("Ingrese la temperatura a convertir: ");
					if(validarNumero(input)==true) {
						double Minput = Double.parseDouble(input);
						temperaturas.convertirTemperatura(Minput);
						
						int respuesta = 0;
						respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion");
						
						if((respuesta == 0) && (validarNumero(input) == true)) {
							System.out.println("selecciona otra opcion");
						}else {
							JOptionPane.showMessageDialog(null, "Finalizacion del programa");
						} 
					}
					else {
							JOptionPane.showMessageDialog(null, "valor invalido");
						}
						break;
						
					
		
				
		}
	
		}

	}



	public static boolean validarNumero(String input) {
		try {
		double x = Double.parseDouble(input);
		if(x >= 0 || x < 0) {
			return true;
		} 
		}catch (NumberFormatException e) {
			return false;
		}
		return false;
		
	}
	
	}




				
	


