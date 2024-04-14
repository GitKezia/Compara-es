/**
 * 
 */

import javax.swing.JOptionPane;

/**
 * Compara valores inserido pelo usuário
 */
public class Comparison {

		public static void main(String args[]) {
			String primeiroNumero;
			String segundoNumero;
			String resultado;
			int numero1;
			int numero2;
			
			primeiroNumero =
					JOptionPane.showInputDialog("Insira o primeiro número:");
			
			segundoNumero =
					JOptionPane.showInputDialog("Insira o segundo número:");
			
			numero1 = Integer.parseInt(primeiroNumero);
			numero2 = Integer.parseInt(segundoNumero);
			
			resultado = "";
			
			if(numero1 == numero2)
				resultado = resultado + numero1 + " == " + numero2;
			
			if(numero1 != numero2)
				resultado = resultado + numero1 + " != " + numero2;
			
			if(numero1 < numero2)
				resultado = resultado + "\n" + numero1 + " < " + numero2;
			
			if(numero1 > numero2)
				resultado = resultado + "\n" + numero1 + " > " + numero2;
			
			if(numero1 <= numero2)
				resultado = resultado + "\n" + numero1 + " <= " + numero2;
			
			if(numero1 >= numero2)
				resultado = resultado + "\n" + numero1 + " >= " + numero2;
			
			JOptionPane.showMessageDialog(
					null, resultado, "Comparando Resultados", JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);
			
		}

}




