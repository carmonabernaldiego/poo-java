package pilas;

public class Main {
    public static void main (String[] args) { 
        PilaChar miPila = new PilaChar(20);
		
		miPila.push ('h');
		System.out.println("Elemento:" + miPila.pop());
		miPila.push ('9');
		miPila.push ('y');
		miPila.push ('R');
		System.out.println("Elemento:" + miPila.pop());	
		System.out.println("Elementos en la Pila: " + miPila);
		
		// Obteniendo los elementos restantes de la pila
		System.out.println("\nobteniendo el resto de la Pila: " );
		while (!miPila.isEmpty()){
			System.out.println("Elemento: " + miPila.pop());
		}
		
	}
		
}