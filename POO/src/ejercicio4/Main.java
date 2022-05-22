package ejercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double velocidad;
		
		System.out.print("Escribe la velocidad en km/h : ");
		velocidad = sc.nextDouble();
		sc.close();
				
		String resultado_formato = String.format("%,.2f", Velocidad(velocidad));
		
		System.out.println("\n" + velocidad + " km/h -> " + resultado_formato + " m/s."); 	
	}
	
	public static double Velocidad(double velocidad) {
		double resultado;
		
		resultado = ((velocidad * 1000) / 3600);
		
		return resultado;
	}
}