package ejercicio8;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int opc = 0;
		
		String menu = "";
		
		do{
        	menu = "";
            menu += "1 .- Número de 3 cifras.\n";
            menu += "2 .- Salir.\n";
            menu += "\nEscribe una opción : ";
		
			String entrada = JOptionPane.showInputDialog(null, menu, "Número de 3 cifras", JOptionPane.INFORMATION_MESSAGE);

			if (entrada != null) {
				if (!entrada.trim().equals("")) {
					opc = Integer.parseInt(entrada);
					
					switch(opc){
		            case 1:
		            	separarNumero();
		                break;
		            case 2:
		                opc = -1;
		                break;
		            default:
		            	JOptionPane.showMessageDialog(null, "¡Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
		                break;
		            }
				} else {
					JOptionPane.showMessageDialog(null, "¡Escribe una opcion correcta!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				opc = -1;
			}
		} while (opc != -1);
		JOptionPane.showMessageDialog(null, "Fin de la Aplicación.", "Información", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static String entradaDatos(String title, String body) {
		int continuar = 0;
		
		String entrada = "";
		
		do{
			entrada = JOptionPane.showInputDialog(null, body, title, JOptionPane.INFORMATION_MESSAGE);

			if (entrada != null) {
				if (!entrada.trim().equals("")) {
					return entrada;
				} else {
					JOptionPane.showMessageDialog(null, "Rellena el campo, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				continuar = -1;
				entrada = "-1";
			}
		} while (continuar != -1);
		
		return entrada;
	}
	
	public static void mostrarDatos(String title, String body) {
		JOptionPane.showMessageDialog(null, body, title, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void separarNumero() {
		int num;
        
		String resultado;
		
        num = Integer.parseInt(entradaDatos("Número de 3 cifras", "Escribe un número : "));
        
        if (num != -1) {
        	resultado = "Número : " + num;
        	resultado += "\n\nPrimera cifra : " + (num / 100);
        	resultado += "\nSegunda cifra : " + ((num / 10) % 10);
        	resultado += "\nTercera cifra : " + (num % 10);
        	
        	mostrarDatos("Número de 3 cifras", resultado);
        }
	}
}