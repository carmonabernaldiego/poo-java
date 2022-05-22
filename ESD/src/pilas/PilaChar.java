package pilas;

public class PilaChar{ 
	private char pila[];
	private int tope;
	
	public PilaChar(int capacidad){ 
		pila = new char[capacidad];
		tope = -1;
	} 
	
	public boolean isEmpty(){
		return tope == -1;
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


	public char peek(){
		if(isEmpty())
			return 0;
		return pila[tope];
	}

	public String toString(){
		return new	String(pila,0,tope+1);
	}

	
}