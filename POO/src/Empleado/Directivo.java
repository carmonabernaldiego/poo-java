package Empleado;

public class Directivo extends Empleado {

    public Directivo() {

    }

    public Directivo(String nombre) {
        super(nombre);
        System.out.println("Constructor de Directivo");
    }

    public String toString() {
        return super.toString() + " -> Directivo";
    }
}
