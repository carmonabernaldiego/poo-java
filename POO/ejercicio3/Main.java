package ejercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double radio;
		
		System.out.print("Escribe el radio de una circunferencia : ");
		radio = sc.nextDouble();
		sc.close();
		
		String longitud_formato = String.format("%,.2f", longitud(radio));
		System.out.print("\nLa longitud de la circunferencia es : " + longitud_formato);
		
		String area_formato = String.format("%,.2f", area(radio));
		System.out.print("\nEl área de la circunferencia es : " + area_formato);
	}
	
	public static double longitud(double radio) {
		double longitud;
		
		longitud = (2 * 3.141592 * radio);
		
		return longitud;
	}
	
	public static double area(double radio) {
		double area;
		
		area = (3.141592 * radio * radio);
		
		return area;
	}
}