package ordenamiento;

public class Pila{ 
	private int pila[];
	private int tope;
	
	public Pila(int capacidad){
		pila = new int[capacidad];
		tope = -1;
	}
	
	public boolean isEmpty(){
		return tope == -1;
	}
	
	public void push(int i){
		if(tope+1 < pila.length)
			pila[++tope] = i;
	}
	
	public int pop(){
		if(isEmpty())
			return 0;
		return 
			pila[tope--];
	}

	public int peek(){
		if(isEmpty())
			return 0;
		return pila[tope];
	}
}