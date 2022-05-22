package ejercicio5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
        System.out.print("Escribe un número entero de 5 cifras : ");
        num = sc.nextInt();
        sc.close();
        
        if(num <= 99999) {
        	System.out.print("\n");
        	Cifras(num);
        } else {
        	System.out.print("\nEl número no es de 5 cifras.");
        }
	}
	
	public static void Cifras(int num) {
		System.out.println(num / 10000);
        System.out.println(num / 1000);
        System.out.println(num / 100);
        System.out.println(num / 10);
        System.out.println(num / 1);
	}
}
