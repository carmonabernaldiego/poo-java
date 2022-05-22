package tarea;

public class PruebaColeccionSimple {
	
	public PruebaColeccionSimple() {}

	public void rellenar(ColeccionSimple c) {
		for(int i=1; i<=10; i++) {
			c.enqueue(i);
		}
	}
	
	public void imprimirYVaciar(ColeccionSimple c) {
		while(!c.isEmpty()) {
			System.out.println(c.dequeue());
		}
	}

}
