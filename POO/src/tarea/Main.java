package tarea;

public class Main {
	public static void main(String[] args) {
		ColaArray c = new ColaArray(20);

		PruebaColeccionSimple pcs = new PruebaColeccionSimple();
		pcs.rellenar(c);

		System.out.println("\n\nLa cola está llena: " + c + "\n");

		pcs.imprimirYVaciar(c);

		System.out.println("\nLa cola está vacía: " + c);
	}
}
