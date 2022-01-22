package ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		
		System.out.print("Escribe tu nombre : ");
		nombre = sc.nextLine();
		sc.close();
		
		System.out.print("Buenos dias " + nombre);
	}
}