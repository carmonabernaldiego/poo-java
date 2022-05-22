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
        listaMusic.add(new Musica("Cyber Sex [Explicit]", "Doja Cat", Formato.mp3, 2.45, 2019,
                "HOT PINK [EXPLICIT]", "Kemosabe Records/RCA Records"));
        listaMusic.add(new Musica("King James", "Buckethead", Formato.mp3, 3.57, 2009,
                "CRIME SLUNK SCENE", "Buckethead"));
        listaMusic.add(new Musica("Sober [Explicit]", "TOOL", Formato.mp3, 5.06, 1993,
                "UNDERTOW [EXPLICIT]", "Tool Dissectional, L.L.C/Volcano Entertainment II, L.L.C.."));
        listaMusic.add(new Musica("Breathe (In the Air)", "Pink Floyd", Formato.mp3, 2.49, 1973,
                "The Dark Side of the Moon", "The copyright in this sound recording is owned by Pink Floyd Music Ltd., marketed and distributed by Sony Music Entertainment"));
        listaMusic.add(new Musica("Any Colour You Like", "Pink Floyd", Formato.mp3, 3.25, 1973,
                "The Dark Side of the Moon", "The copyright in this sound recording is owned by Pink Floyd Music Ltd., marketed and distributed by Sony Music Entertainment"));
        listaMusic.add(new Musica("Breaking the Law", "Judas Priest", Formato.mp3, 2.35, 2010,
                "BRITISH STEEL - 30TH ANNIVERSARY", "Sony Music Entertainment UK Limited"));

        System.out.println(listaMusic.toStringMusic());
    }
}