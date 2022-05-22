package conversion;
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		int opc = 0;
		double num;
		
		Scanner sc = new Scanner(System.in);
		
		do {		
			System.out.print("Convertidor de grados");
			System.out.print("\n\n(1). Fahrenheit.");
			System.out.print("\n(2). Kelvin.");
			System.out.print("\n(0). Salir.");
			System.out.print("\n\nPor favor, elige una opción : ");
			opc = sc.nextInt();
			
			if(opc == 1) {
				System.out.print("\nPor favor, ingresa los grados Celsius : ");
				num = sc.nextDouble();
				
				Grados gradosCelsius = new Grados(num);
				
				gradosCelsius.convertFahrenheit();
				
				System.out.print("\n\nLa conversion de " + gradosCelsius.getCelsius() + " grados Celsius a grados Fahrenheit es de : " + gradosCelsius.getFahrenheit());	
				System.out.println("\nPulse enter para continuar...");
		        new java.util.Scanner(System.in).nextLine();
			}else if(opc == 2) {
				System.out.print("\nPor favor, ingresa los grados Celsius : ");
				num = sc.nextDouble();
				
				Grados gradosCelsius = new Grados(num);
				
				gradosCelsius.convertKelvin();
				
				System.out.print("\n\nLa conversion de " + gradosCelsius.getCelsius() + " grados Celsius a grados Kelvin es de : " + gradosCelsius.getKelvin());		
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