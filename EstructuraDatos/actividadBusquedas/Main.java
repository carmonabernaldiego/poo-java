package actividadBusquedas;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Zapato> zapatos = new ArrayList<>();

		zapatos.add(new Zapato("Tenis", "Adidas", 27));
		zapatos.add(new Zapato("Mocasines", "Alden", 26));
		zapatos.add(new Zapato("Sandalias", "Edward Green", 25));
		zapatos.add(new Zapato("Alpargatas", "Santoni", 28));
		zapatos.add(new Zapato("Zapatillas", "Aubercy", 28));
		zapatos.add(new Zapato("Botas", "Tricker's", 29));
		zapatos.add(new Zapato("Oxford", "Silvano Sassetti", 26));
		zapatos.add(new Zapato("Brogue", "Church's", 25));
		zapatos.add(new Zapato("Botines", "Stefano", 27));
		zapatos.add(new Zapato("Monk", "Clarks", 24));
		zapatos.add(new Zapato("Derby", "Bugatti", 29));


		SearchGenerica<Zapato> searchG = new SearchGenerica<>();

		System.out.println("Lista original");
		System.out.println(zapatos);

		Collections.sort(zapatos);

		System.out.println("\nLista ordenada");
		System.out.println(zapatos);

		// Buscar por nombre, marca y talla. Datos correctos, devuelve la posición del elemento encontrado.
		int resultado = searchG.binaria(zapatos, new Zapato("Monk", "Clarks", 24), true);
		System.out.println("\nEncontrado: " + resultado);

		// Buscar por nombre, marca y talla. Si la talla es diferente, devuelve -1.
		int resultado2 = searchG.binaria(zapatos, new Zapato("Tenis", "Adidas", 28), true);
		System.out.println("\nEncontrado: " + resultado2);

		// Buscar por nombre, marca y talla. Si la marca es diferente, devuelve -1.
		int resultado3 = searchG.binaria(zapatos, new Zapato("Oxford", "Silvano Sasetti", 26), true);
		System.out.println("\nEncontrado: " + resultado3);

		// Buscar por nombre, marca y talla. Si el nombre es diferente, devuelve -1.
		int resultado4 = searchG.binaria(zapatos, new Zapato("Derb", "Bugatti", 29), true);
		System.out.println("\nEncontrado: " + resultado4);
	}
}