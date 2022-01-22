package ordenamiento;

public class Main {
	public static void main (String[] args) {
		PilaChar miPila = new PilaChar(10);
		
		miPila.push(9);
		miPila.push(3);
		miPila.push(12);
	    miPila.push(77);
	    miPila.push(0);
	    miPila.push(88);
	    miPila.push(34);
	    miPila.push(17);
	    miPila.push(23);
	    miPila.push(44);
	   
	    PilaChar miPilaTmp = new PilaChar(10);
	    
	    while(!miPila.isEmpty()) {
	    	int aux = miPila.pop();
	    	
	    	while(!miPilaTmp.isEmpty() && miPilaTmp.peek() < aux)
	        {
	    		miPila.push(miPilaTmp.pop());
	        }
	    	
	    	miPilaTmp.push(aux);
	    }

	    System.out.println("Los numeros ordenados son:");
	    
	    while(!miPilaTmp.isEmpty()) {
	    	System.out.print(miPilaTmp.pop()+" ");
	    }	
	}
}
