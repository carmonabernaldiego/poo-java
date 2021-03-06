package auxiliares;

import java.util.Objects;

public class Recipiente {
    private String contenido;
    private int tamano;
    private int peso;

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(o == null || getClass() != o.getClass()) {
            return false;
        }

        Recipiente that = (Recipiente) o; // cast

        return getTamano() == that.getTamano() && Objects.equals(getContenido(), that.getContenido());
    }

    public Recipiente(String contenido, int tamano, int peso) {
        this.contenido = contenido;
        this.tamano = tamano;
        this.peso = peso;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
