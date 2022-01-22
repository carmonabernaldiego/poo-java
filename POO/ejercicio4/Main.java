package ejercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double v;
		
		System.out.print("Escribe la velocidad en Km/h : ");
		v = sc.nextDouble();
		sc.close();
				
		String resultado_formato = String.format("%,.2f", Velocidad(v));
		
		System.out.println("\n" + v + " Km/h -> " + resultado_formato + " m/s."); 	
	}
	
	public static double Velocidad(double v) {
		double resultado;
		
		resultado = ((v * 1000) / 3600);
		
		return resultado;
	}
}