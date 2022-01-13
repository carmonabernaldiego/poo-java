package ordenamiento;

public class Main {
	public static void main (String[] args) { 
        Ordenar miPila = new Ordenar(5);
		
		miPila.push ('h');
		miPila.push ('f');
		miPila.push ('a');
		miPila.push ('r');
		miPila.push ('w');
		
		while (!miPila.isEmpty()){
			System.out.println("Elemento: " + miPila.pop());
		}
	}
}
