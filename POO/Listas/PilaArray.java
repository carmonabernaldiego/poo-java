package Listas;

import java.util.NoSuchElementException;

public class PilaArray implements ColeccionSimple {
	private Object[] array;
	private int contador;
	
	public PilaArray(int tamañoMaximo) {
		array = new Object[tamañoMaximo];
		contador = 0;
	}
	
	public boolean estaVacia() {
		return contador == 0;
	}
	
	public boolean añadir(Object o) {
		if(contador == array.length)
			return false;
		else {
			array[contador]=o;
			contador++;
			return true;
		}
	}
	
	public Object primero() {
		if(estaVacia())
			throw new NoSuchElementException();
		else
			return array[contador-1];
	}
	
	public Object extraer(){
		if(estaVacia())
			throw new NoSuchElementException();
		else
			return array[--contador];
	}
	
	public String toString() {
		String s="[";
		for(int i=contador-1;i>=0; i--) {
			s+= array[i].toString()+".";
		}
		if(!estaVacia())
			return s.substring(0,s.length()-1) + "]";
		else
			return s + "]";
	}
}
