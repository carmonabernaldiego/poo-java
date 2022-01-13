package pilas3;

import pilas2.PilaChar;

public class Main {

	public static void main(String[] args) {
		PilaChar pila = new PilaChar(5);
		
		pila.push('a');
		pila.push('s');
		pila.push('f');
		pila.push('e');
		pila.push('z');
		
		while (!pila.isEmpty()){
            System.out.println("pop:" + pila.pop());
        }
	}

}
