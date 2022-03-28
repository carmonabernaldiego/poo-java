package Listas;

public class PruebaColeccionSimple {
	
	public PruebaColeccionSimple() {}
	
	public void rellenar(ColeccionSimple c) {
		for(int i=1; i<=10; i++) {
			c.añadir(i);
		}
	}
	
	public void imprimirYVaciar(ColeccionSimple c) {
		while(!c.estaVacia()) {
			System.out.println(c.extraer());
		}
	}
}
