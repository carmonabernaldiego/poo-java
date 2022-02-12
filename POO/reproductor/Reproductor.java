package Reproductor;
public class Reproductor {
    public static void main(String[] args) {
        ListaMultimedia lista = new ListaMultimedia(10);

        lista.add(new Pelicula("Dr. No", "Terence Young", Formato.mov, 109, 1962,
                "Sean Connery", "Ursula Andress"));
        lista.add(new Pelicula("Vive y Deja Morir", "Albert R. Broccoli", Formato.dvd, 121, 1973,
                "Roger Moore", "Jane Seymour"));
        lista.add(new Pelicula("Sin Tiempo para Morir", "Cary Fukunaga", Formato.mp4, 163, 2021,
                "Daniel Craig", "Naomie Harris"));

        System.out.println(lista.toString());

        ListaMultimedia listaMusic = new ListaMultimedia(10);

        listaMusic.add(new Musica("Pneuma", "Tool", Formato.mp3, 10.20, 2019,
                "Fear Inoculum [Explicit]", "Tool Dissectional, L.L.C./Volcano Entertainment II, L.L.C.."));
        listaMusic.add(new Musica("Butter", "BTS", Formato.mp3, 2.44, 2021,
                "Butter", "BIGHIT MUSIC / HYBE"));

        System.out.println(listaMusic.toStringMusic());
    }
}