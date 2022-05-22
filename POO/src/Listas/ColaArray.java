package Listas;

import java.util.NoSuchElementException;

public class ColaArray implements ColeccionSimple {
	private Object[] data;
	private int index;

	public ColaArray(int capacidad){
		data = new Object[capacidad];
		index = 0;
	}

	public boolean añadir(Object o) {
		if (!isFull()) {
			data[index] = o;
			index++;
			return true;
		}
		return false;
	}

	public Object extraer() {
		if (estaVacia()){
			return null;
		}else{
			Object respuesta = data[0];
			// mover los valores hacia delante
			for (int posicion = 0; posicion < index-1; posicion++){
				data[posicion] = data[posicion+1];
			}
			index--;
			return respuesta;
		}
	}

	public Object primero() {
		if(estaVacia())
			throw new NoSuchElementException();
		else
			return data[index-1];
	}

	public boolean estaVacia(){
		return index == 0;
	}

	public boolean isFull(){
		return index == data.length;
	}

	public String toString() {
		String s="[";
		for(int i=0;i<=index-1; i++) {
			s+= data[i].toString()+".";
		}
		if(!estaVacia())
			return s.substring(0,s.length()-1) + "]";
		else
			return s + "]";
	}
}