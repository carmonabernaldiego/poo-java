package CalculadoraBasica;
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		int opc = 0;
		
		do {
			Operacion miOperacion = new Operacion();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Calculadora Básica");
			System.out.print("\n\n(1). Suma.");
			System.out.print("\n(2). Resta.");
			System.out.print("\n(3). Multiplicación.");
			System.out.print("\n(4). División.");
			System.out.print("\n(0). Salir.");
			System.out.print("\n\nPor favor, elige una opción : ");
			opc = sc.nextInt();
			
			if(opc == 1) {
				miOperacion.setOperacion("suma");
				
				miOperacion.setNum();
				
				String resultado = String.format("%,.2f", miOperacion.getResultado());
				System.out.println("\nEl Resultado de la " + miOperacion.getTipo() + " es : " + resultado);
				System.out.println("\nPulse enter para continuar...");
		        new java.util.Scanner(System.in).nextLine();
			}else if(opc == 2) {
				miOperacion.setOperacion("resta");
				
				miOperacion.setNum();
				
				String resultado = String.format("%,.2f", miOperacion.getResultado());
				System.out.println("\nEl Resultado de la " + miOperacion.getTipo() + " es : " + resultado);
				System.out.println("\nPulse enter para continuar...");
		        new java.util.Scanner(System.in).nextLine();
			}else if(opc == 3) {
				miOperacion.setOperacion("multiplicacion");
	
				miOperacion.setNum();
				
				String resultado = String.format("%,.2f", miOperacion.getResultado());
				System.out.println("\nEl Resultado de la " + miOperacion.getTipo() + " es : " + resultado);
				System.out.println("\nPulse enter para continuar...");
		        new java.util.Scanner(System.in).nextLine();
			}else if(opc == 4) {
				miOperacion.setOperacion("division");
				
				miOperacion.setNum();
				
				String resultado = String.format("%,.2f", miOperacion.getResultado());
				System.out.println("\nEl Resultado de la " + miOperacion.getTipo() + " es : " + resultado);
				System.out.println("\nPulse enter para continuar...");
		        new java.util.Scanner(System.in).nextLine();
			}
			else if(opc == 0) {
				opc = -1;
			}
			else {
				System.out.println("\nOpción incorrecta!");
				 System.out.println("\nPulse enter para continuar...");
		         new java.util.Scanner(System.in).nextLine();
			}
		}while(opc != -1);
		System.out.println("\nAdios...");
	}
}