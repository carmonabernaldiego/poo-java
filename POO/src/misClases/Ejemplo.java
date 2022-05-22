package misClases;

public class Ejemplo {
	public static void main(String []args) {
		//Creamos un animal cuyo nombré será Falco
        Animal miAnimal = new Animal("Falco");
        //Le establecemos 3 años de edad a Falco.
        miAnimal.setEdad(3);
        //Mostraremos el nombre del animal por pantalla
        System.out.println("El nombre es: " + miAnimal.getNombre());
        //Mostramos la edad del animal por pantalla
        System.out.println(" y tiene " + miAnimal.getEdad() + " años");
        //Este código deberia imprimir "El nombre es: Falco y tiene 3 años"
	}
}