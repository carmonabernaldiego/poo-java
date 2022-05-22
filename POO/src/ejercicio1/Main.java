package ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingresa un número: ");
		num = sc.nextInt();
		sc.close();
		
		if (esPrimo(num)) {
			System.out.println(num + " es primo.");
		} else {
			System.out.println(num + " no es primo.");
		}
	}
	
	public static boolean esPrimo(int num) {
		/*
		if (num == 0 || num == 1 || num == 4) {
			return false;
		}
		
		for (int x = 2; x < num / 2; x++) {
			if (num % x == 0) {
				return false;
			}
		}
		
		return true;
		*/
		
		int cont = 0;
		
	    for (int i = 1; i <= num; i++) {
	        if (num % i == 0) {
	            cont++;
	        }
	    }
	    
	    if (num == 1) {
	        return false;
	    }
	    
	    if ( cont == 2) {
	        return true;
	    } else {
	        return false;
	    }		
	}
}