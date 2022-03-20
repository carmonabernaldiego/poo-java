package actividadBusquedas;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author vramos
 */

public class SearchGenerica<T extends Comparable<T>> {
	public int lineal(ArrayList<T> a, T b, boolean d) {
		int pos = -1;
		int iter = 0;
		// compareTo
		// 0 : los elemenotos son iguales
		// > 0: el elemento es mayor
		// < 0: el elemento es menor
		for (int i = 0; i < a.size(); i++) {
			if (b.compareTo(a.get(i)) == 0) {
				pos = i;
			}
			if (d) {
				iter++;
			}
		}
		if (d)
			System.out.println("Iter: " + iter);
		return pos;
	}

	// ?
	public int lineal(ArrayList<T> a, T b, Comparator<T> c, boolean d) {
		int pos = -1;
		int iter = 0;
		// compareTo
		// 0 : los elemenotos son iguales
		// > 0: el elemento es mayor
		// < 0: el elemento es menor
		for (int i = 0; i < a.size(); i++) {
			if (c.compare(a.get(i), b) == 0) {
				pos = i;
			}
			if (d) {
				iter++;
			}
		}
		if (d)
			System.out.println("Iter: " + iter);
		return pos;
	}

	public int binaria(ArrayList<T> a, T b, boolean d) {
		int pos = -1;
		int tam = (a.size() - 1) / 2;
		int inicio = 0, fin = a.size() - 1;
		int centro = tam;
		// 0123456789
		// 01234 5 6789
		//         67 8 9
		while (inicio <= fin) {
			centro = inicio + (fin - inicio) / 2;
			if (d) {
				System.out.println("\ninicio:" + inicio + " fin:" + fin + " centro:" + centro + " tam:" + tam);
			}
			if (b.compareTo(a.get(centro)) == 0) { // El elemento
				pos = centro;
				// se encuentra
			}
			// compareTo   regresa 0 si los elementos son iguales
			//             regresa valor positivo si el elemento es mayor
			//             regresa valor negativo si el elemento es menor
			if (b.compareTo(a.get(centro)) > 0) {  // b es mayor a centro Derecha
				inicio = centro + 1;
			} else {
				fin = centro - 1;
				// izquierda
			}
			tam /= 2;

		}
		return pos;
	}

	//  Me genera muchas dudas este método, se implementa, ya que lineal sobre carga el método y agrega Comparator <T> c
	public int binaria(ArrayList<T> a, T b, Comparator<T> c, boolean d) {
		int pos = -1;
		int tam = (a.size() - 1) / 2;
		int inicio = 0, fin = a.size() - 1;
		int centro = tam;
		// 0123456789
		// 01234 5 6789
		//         67 8 9
		while (inicio <= fin) {
			centro = inicio + (fin - inicio) / 2;
			if (d) {
				System.out.println("\ninicio:" + inicio + " fin:" + fin + " centro:" + centro + " tam:" + tam);
			}
			if (c.compare(a.get(centro), b) == 0) { // El elemento
				pos = centro;
				// se encuentra
			}
			// compareTo   regresa 0 si los elementos son iguales
			//             regresa valor positivo si el elemento es mayor
			//             regresa valor negativo si el elemento es menor
			if (c.compare(a.get(centro), b) > 0) {  // b es mayor a centro Derecha
				inicio = centro + 1;
			} else {
				fin = centro - 1;
				// izquierda
			}
			tam /= 2;

		}
		return pos;
	}
}