package convertirDivisas;

import javax.swing.JOptionPane;

public class convertirMonedas {

	 public void convertirPesosaDolares(double valor) {
		double cotizacionDolar= 176.38;
		double monedaDolar = valor / cotizacionDolar;
		monedaDolar = (double)Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaDolar + " dolares");
		
	}
	 
	 public void convertirPesosaEuros(double valor) {
		double cotizacionEuro= 187.39;
		double monedaEuro= valor / cotizacionEuro;
		monedaEuro = (double)Math.round(monedaEuro*100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " Euros");
		
	}
	 
	 public void convertirPesosaLibras(double valor) {
		double cotizacionLibra= 212.27;
		double monedaLibras = valor / cotizacionLibra;
		monedaLibras = (double)Math.round(monedaLibras*100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaLibras + " libras Esterlinas");
		
	}
	 
	 public void convertirPesosaYen(double valor) {
		double cotizacionyen = 1.31;
		double monedayen = valor / cotizacionyen;
		monedayen = (double)Math.round(monedayen*100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedayen + " yuanes");
		
	}
	 
	 public void convertirPesosaWon(double valor) {
		double cotizacionWon = 0.14;
		double monedaWon = valor / cotizacionWon;
		monedaWon = (double)Math.round(monedaWon*100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaWon + " Wons");
		
	}
	 public void convertirDolaresaPesos(double valor) {
			double cotizacionDolar= 176.38;
			double monedaDolar = valor * cotizacionDolar;
			monedaDolar = (double)Math.round(monedaDolar*100d)/100;
			JOptionPane.showMessageDialog(null, "tienes $ " + monedaDolar + " pesos argentinos");
			
		}
		 
		 public void convertirEurosaPesos(double valor) {
			double cotizacionEuro= 187.39;
			double monedaEuro= valor * cotizacionEuro;
			monedaEuro = (double)Math.round(monedaEuro*100d)/100;
			JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " pesos argentinos");
			
		}
		 
		 public void convertirLibrasaPesos(double valor) {
			double cotizacionLibra= 212.27;
			double monedaLibras = valor * cotizacionLibra;
			monedaLibras = (double)Math.round(monedaLibras*100d)/100;
			JOptionPane.showMessageDialog(null, "tienes $ " + monedaLibras + " pesos argentinos");
			
		}
		 
		 public void convertirYenaPesos(double valor) {
			double cotizacionyen = 1.31;
			double monedayen = valor * cotizacionyen;
			monedayen = (double)Math.round(monedayen*100d)/100;
			JOptionPane.showMessageDialog(null, "tienes $ " + monedayen + " pesos argentinos");
			
		}
		 
		 public void convertirWonapesos(double valor) {
			double cotizacionWon = 0.14;
			double monedaWon = valor * cotizacionWon;
			monedaWon = (double)Math.round(monedaWon*100d)/100;
			JOptionPane.showMessageDialog(null, "tienes $ " + monedaWon + " pesos argentinos");
			
		}

}
