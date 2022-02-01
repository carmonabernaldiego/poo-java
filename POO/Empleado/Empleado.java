package Empleado;

import java.util.Scanner;

/*
 * 
 * Diego Carmona Bernal | 2 C
 *
 */

public class Empleado {
    private String nombre;

    // Constructor por defecto.

    public Empleado() {
    }

    // Constructor con parametro.

    public Empleado(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor Empleado : " + nombre);

    }

    // Metodos GET y SET.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo toString().
    // Devuelve un string formado por la palabra "Empleado" y el nombre de empleado.

    public String toString() {
        return "Empleado : " + nombre;
    }

    public static String leerDatos(String entrada) {
        System.out.println("Escribe el nombre del " + entrada + " : ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    public static void main(String[] args) {
        Empleado E1 = new Empleado(leerDatos("Empleado"));
        Directivo D1 = new Directivo(leerDatos("Directivo"));
        Operario OP1 = new Operario(leerDatos("Operario"));
        Oficial OF1 = new Oficial(leerDatos("Oficial"));
        Tecnico T1 = new Tecnico(leerDatos("Tecnico"));

        System.out.println("= + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + =");
        System.out.println("          " + E1);
        System.out.println("= + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + =");
        System.out.println("          " + D1);
        System.out.println("= + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + =");
        System.out.println("          " + OP1);
        System.out.println("= + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + =");
        System.out.println("          " + OF1);
        System.out.println("= + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + =");
        System.out.println("          " + T1);
        System.out.println("= + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + = + =");
    }

}