package ejercicio9;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int opc = 0;
		
		String menu = "";
		
		do{
        	menu = "";
            menu += "1 .- Calcular número de la suerte.\n";
            menu += "2 .- Salir.\n";
            menu += "\nEscribe una opción : ";
		
			String entrada = JOptionPane.showInputDialog(null, menu, "Número de la suerte", JOptionPane.INFORMATION_MESSAGE);

			if (entrada != null) {
				if (!entrada.trim().equals("")) {
					if (esNumero(entrada) == true) {
						opc = Integer.parseInt(entrada);
			        } else {
			        	opc = 0;
			        }
					
					switch(opc){
		            case 1:
		            	int day, month, year;
		                
		            	day = Integer.parseInt(entradaDatos("Número de la suerte", "Escribe tu día de nacimiento : "));
		                
		                if (day != -1) {
		                	month = Integer.parseInt(entradaDatos("Número de la suerte", "Escribe tu mes de nacimiento : "));
		                    
		                	if (month != -1) {
		                		year = Integer.parseInt(entradaDatos("Número de la suerte", "Escribe tu año de nacimiento : "));
		                        
		                		if (year != -1) {		
		                			String resultado_formato = "Tu número de la suerte es: " +  numeroSuerte(day, month, year);
		                			mostrarDatos("Número de la suerte", resultado_formato);		
		                		}
		                    }
		                }
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
		int continuar = 1;
		
		String entrada = "";
		
		do{
			entrada = JOptionPane.showInputDialog(null, body, title, JOptionPane.INFORMATION_MESSAGE);

			if (entrada != null) {
				if (!entrada.trim().equals("")) {
					if (esNumero(entrada) == true) {
						return entrada;
			        } else {
			        	continuar = 1;
						entrada = "";
			        }
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
	
	public static boolean esNumero(String cadena) {
        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
	
	public static int numeroSuerte(int day, int month, int year) {
		int suma, cifra1, cifra2, cifra3, cifra4, numeroSuerte;
		
        suma = day + month + year;
        
        cifra1 = suma / 1000;
        cifra2 = (suma / 100) % 10;
        cifra3 = (suma / 10) % 10;
        cifra4 = suma % 10;
        
        numeroSuerte = cifra1 + cifra2 + cifra3 + cifra4; 
		
		return numeroSuerte;
	}
}