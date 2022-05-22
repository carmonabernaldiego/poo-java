package ordenamiento;

public class Ordenar {
	private char pila[];
	private char pilaTemp[];
	private char auxiliar;
	private int tope;
	private int topeTemp;

	public Ordenar(int capacidad){ 
		pila = new char[capacidad];
		pilaTemp = new char[capacidad];
		tope = -1;
		topeTemp = -1;
	}
	
	public void push(char i){
		if(tope+1 < pila.length)
			pila[++tope] = i;
	}
	
	public char pop(){
		if(isEmpty())
			return 0;
		return 
			pila[tope--];
	}
	
	public boolean isEmpty(){
		return tope == -1;
	}
}