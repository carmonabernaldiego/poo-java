package Empleado;

public class Oficial extends Operario {

    public Oficial() {

    }

    public Oficial(String nombre) {
        super(nombre);
        System.out.println("Constructor de Oficial");
    }

    public String toString() {
        return super.toString() + " -> Oficial";
    }
}
