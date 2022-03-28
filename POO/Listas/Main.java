package Listas;

public class Main {
	public static void main(String[] args) {
		PilaArray pila = new PilaArray(20);

		PruebaColeccionSimple pcsPila = new PruebaColeccionSimple();
		pcsPila.rellenar(pila);

		System.out.println("La pila está llena: " + pila + "\n");

		pcsPila.imprimirYVaciar(pila);

		System.out.println("\nLa pila está vacía: " + pila);


		ColaArray cola = new ColaArray(20);

		PruebaColeccionSimple pcsCola = new PruebaColeccionSimple();
		pcsCola.rellenar(cola);

		System.out.println("\n\nLa cola está llena: " + cola + "\n");

		pcsCola.imprimirYVaciar(cola);

		System.out.println("\nLa cola está vacía: " + cola);
	}
}