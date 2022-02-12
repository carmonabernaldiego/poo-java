package Reproductor;

enum Formato {
    wav, mp3, mp4, midi, avi, mov, mpg, cdAudio, dvd
};

public class Multimedia {
    private String titulo;
    private String autor;
    private Formato formato;
    private double duracion;
    private int año;

    public Multimedia(String titulo, String autor, Formato formato, double duracion, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getAño() {
        return año;
    }

    public String toString() {
        return "Título: " + titulo + " De " + autor + "\n" +
                "Formato " + formato + " Duración " + (int) duracion + " minutos " + "Filmada en " + año;
    }

    public String toStringMusic() {
        return "Canción: " + titulo + " - Artista: " + autor + "\n" +
                "Duración: " + duracion + " minutos." + " - Formato: " + formato + "\nDisco publicado en " + año;
    }
}