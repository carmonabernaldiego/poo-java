package Empleado;

public class Operario extends Empleado {

    // Constructor por defecto.

    public Operario() {

    }

    // Constructor con un parámetro.

    public Operario(String nombre) {
        super(nombre);
        System.out.println("Constructor de Operario");
    }

    // Modificacion del metodo toString() para mostrar el mensaje adecuado.

    public String toString() {
        return super.toString() + " -> Operario";
    }
}
