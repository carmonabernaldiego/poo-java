package reproductor;

public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, Formato formato, double duracion, int año, String actor,
            String actriz) {
        super(titulo, autor, formato, duracion, año);
        if (actor == null && actriz == null) {
            throw new IllegalArgumentException("Tiene que haber al menos un protagonista");
        }
        actorPrincipal = actor;
        actrizPrincipal = actriz;
    }

    public String getActor() {
        return actorPrincipal;
    }

    public String getActriz() {
        return actrizPrincipal;
    }

    public String toString() {
        String s = "Protagonizado por ";
        if (actrizPrincipal != null) {
            s += actrizPrincipal;
            if (actorPrincipal != null) {
                s += " y " + actorPrincipal;
            }
        }
        return super.toString() + "\n" + s;
    }
}
