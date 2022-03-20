package listaEval2C;

import java.util.Objects;

public class Mascota implements Comparable<Mascota> {
    private String nombre;
    private int edad;
    private String tipo;     // perro, gato, hamster etc.
    private float peso;

    //Implementar
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mascota that = (Mascota) o;
        return getPeso() == that.getPeso() &&
                Objects.equals(getRaza(), that.getRaza());
    }

    // Implementar
    @Override
    public int compareTo(Mascota m){
        if (this.getRaza().equals(m.getRaza()) && this.getPeso() == m.getPeso()) {
            return 0;
        }
        else if (this.getRaza().equals(m.getRaza()) && this.getPeso() > m.getPeso()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public Mascota(String nombre, int edad, String tipo, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getRaza() {
        return tipo;
    }

    public float getPeso() {
        return peso;
    }

    @Override
    public String toString(){
        return "\nNombre: " + nombre + "\nRaza/Tipo: " + tipo + "\nEdad: " + edad + "\nPeso: " + peso;
    }
}