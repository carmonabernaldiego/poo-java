package ordenacion;

import java.util.ArrayList;

public class MainDatos {
	public static void main(String[] args) {
		datos();
	}

	private static void datos() {
		ArrayList<Datos> listaDatos = new ArrayList<>();

		for(int i = 0; i < 99; i++) {
			listaDatos.add(new Datos("d", 2));
		}

		imprimir(listaDatos);
	}

	private static void imprimir(ArrayList<Datos> listaDatos) {
		for (Datos dato:listaDatos) {
			System.out.println(dato.toString());
		}
	}
}