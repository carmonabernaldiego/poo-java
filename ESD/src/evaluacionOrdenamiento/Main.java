package evaluacionOrdenamiento;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		jugadores();
	}

	public static void jugadores() {
		ArrayList<Jugador> listaJugadoresOriginal = new ArrayList<>();

		for(int i = 1; i <= 11; i++) {
			listaJugadoresOriginal.add(new Jugador("Verde", i));
		}

		for(int i = 1; i <= 11; i++) {
			listaJugadoresOriginal.add(new Jugador("Rojo", i));
		}

		for(int i = 1; i <= 11; i++) {
			listaJugadoresOriginal.add(new Jugador("Amarillo", i));
		}

		for(int i = 1; i <= 11; i++) {
			listaJugadoresOriginal.add(new Jugador("Azul", i));
		}

		FisherYates<Jugador> fisheryates = new FisherYates<>();
		fisheryates.shuffle(listaJugadoresOriginal);
		System.out.println("Jugadores Desordenados");
		System.out.println("\n- Fisher Yates -");
		imprimir(listaJugadoresOriginal);

		ArrayList<Jugador> equipo1 = new ArrayList<>();
		ArrayList<Jugador> equipo2 = new ArrayList<>();
		ArrayList<Jugador> equipo3 = new ArrayList<>();
		ArrayList<Jugador> equipo4 = new ArrayList<>();


		for(int i = 0; i < 44; i++) {
			if(i >= 0 && i < 11) {
				equipo1.add(listaJugadoresOriginal.get(i));
			} else if(i >= 11 && i < 22) {
				equipo2.add(listaJugadoresOriginal.get(i));
			}
			else if(i >= 22 && i < 33) {
				equipo3.add(listaJugadoresOriginal.get(i));
			}
			else if(i >= 33 && i < 44) {
				equipo4.add(listaJugadoresOriginal.get(i));
			}
		}

		System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println("\n\tEquipo 1");
		imprimir(equipo1);

		MergeSort<Jugador> mergesort = new MergeSort<>();
		mergesort.mergeSort(equipo1, equipo1.size());
		System.out.println("\n\n- Merge Sort -");
		imprimir(equipo1);

		System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println("\n\tEquipo 2");
		imprimir(equipo2);

		CycleSort<Jugador> cyclesort = new CycleSort<>();
		cyclesort.cycleSort(equipo2);
		System.out.println("\n\n- Cycle Sort -");
		imprimir(equipo2);

		System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println("\n\tEquipo 3");
		imprimir(equipo3);

		mergesort.mergeSort(equipo3, equipo3.size());
		System.out.println("\n\n- Merge Sort -");
		imprimir(equipo3);

		System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println("\n\tEquipo 4");
		imprimir(equipo4);

		cyclesort.cycleSort(equipo4);
		System.out.println("\n\n- Cycle Sort -");
		imprimir(equipo4);

		System.out.println("\n\n\t\tHecho por: Diego Carmona Bernal - 213498");
	}

	private static void imprimir(ArrayList<Jugador> listaJugadores) {
		for (Jugador jugador:listaJugadores) {
			System.out.println(jugador.toString());
		}
	}
}