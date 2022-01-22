package ejercicio6;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		int opc = 0;
		
		boolean continuar;
		
        String menu = "";
        
        do{
        	menu = "";
            menu += "1 .- Calcular longitud de hipotenusa.\n";
            menu += "2 .- Salir.\n";
            menu += "\nEscribe una opción : ";
            
            do {
                try {
                    opc = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Longitud de hipotenusa", JOptionPane.INFORMATION_MESSAGE));
                    continuar = true;
                }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "¡Escribe una opcion correcta!", "Error", JOptionPane.ERROR_MESSAGE);
                    continuar = false;
                }
            } while (!continuar);
            
            switch(opc){
            case 1:
            	calcularHipotenusa();
                break;
            case 2:
                opc = -1;
                break;
            default:
            	JOptionPane.showMessageDialog(null, "¡Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }while(opc != -1);
        
        JOptionPane.showMessageDialog(null, "Fin de la Aplicación.", "Información", JOptionPane.INFORMATION_MESSAGE);
	}
    
    static void calcularHipotenusa(){
    	String dato = "";
    	
    	double hipotenusa;
    	
        dato = JOptionPane.showInputDialog(null, "Escribe la longitud del primer cateto : ", "Longitud de hipotenusa", JOptionPane.QUESTION_MESSAGE);
        Double cateto1 = Double.parseDouble(dato);
        
        dato = JOptionPane.showInputDialog(null, "Escribe la longitud del segundo cateto : ", "Longitud de hipotenusa", JOptionPane.QUESTION_MESSAGE);
        Double cateto2 = Double.parseDouble(dato);
        
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        String hipotenusa_formato = String.format("%,.2f", hipotenusa);
        JOptionPane.showMessageDialog(null, "La hipotenusa es : " + hipotenusa_formato, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
