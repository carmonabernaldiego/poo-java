package tarea;

public class ColaArray implements ColeccionSimple {
	private Object[] array;
	private int contador;

	public ColaArray(int capacidad){
		array = new Object[capacidad];
		contador = 0;
	}

	public void enqueue(Object o) {
		if (!isFull()) {
			array[contador] = o;
			contador++;
		}
	}

	public Object dequeue() {
		if (isEmpty()){
			return null;
		}else{
			Object respuesta = array[0];
			// mover los valores hacia delante
			for (int posicion = 0; posicion < contador-1; posicion++){
				array[posicion] = array[posicion+1];
			}
			contador--;
			return respuesta;
		}
	}

	public boolean isEmpty(){
		return contador == 0;
	}

	public boolean isFull(){
		return contador == array.length;
	}

	public String toString() {
		String s="[";
		for(int i=0;i<=contador-1; i++) {
			s+= array[i].toString()+".";
		}
		if(!isEmpty())
			return s.substring(0,s.length()-1) + "]";
		else
			return s + "]";
	}
}