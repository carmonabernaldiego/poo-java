package Reproductor;

public class Musica extends Multimedia {
    private String albumCancion;
    private String productoraCancion;

    public Musica(String titulo, String autor, Formato formato, double duracion, int año, String album,
                    String productora) {
        super(titulo, autor, formato, duracion, año);
        if (album == null) {
            throw new IllegalArgumentException("Tiene que tener Álbum.");
        }else if (productora == null) {
            throw new IllegalArgumentException("Tiene que tener Productora.");
        }
        albumCancion = album;
        productoraCancion = productora;
    }

    public String getAlbum() {
        return albumCancion;
    }

    public String getProductora() {
        return productoraCancion;
    }

    public String toStringMusic() {
        String sAlbum = "Álbum: ";
        String sProductora = "Productora: ";

        if (albumCancion != null) {
            sAlbum += albumCancion;
        }
        if (productoraCancion != null) {
            sProductora += productoraCancion;
        }

        return sAlbum + "\n" + super.toStringMusic() + "\n" + sProductora;
    }
}