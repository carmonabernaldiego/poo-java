
package reproductorGrafico;

public class Multimedia {
    private String titulo;
    private String autor;
    private String interprete;
    private String formato;
    private double duracion;
    private int año;
    
    //private Formato formato;
    
    
    public Multimedia(String titulo, String autor, String interprete, String formato, double duracion, int año){
        this.titulo = titulo;
        this.autor = autor;
        this.interprete = interprete;
        this.formato = formato;
        this.duracion = duracion;
        this.año = año;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getInterprete(){
        return interprete;
    }
    
    public String getFormato(){
        return formato;
    }
    
    public double getDuracion(){
        return duracion;
    }
    
    public int getAño(){
        return año;
    }
    
    public String toString(){
       if (formato == "mp4" || formato == "dvd"||formato =="mov"||formato=="mpg"){
        return "Título: " + titulo + " Director " + autor + "\n" +
                "Formato " + formato + " Duración " + (int)duracion + " minutos " + "Filmada en "+ año;
       }else {
        return "Título: " + titulo + " Autor " + autor + "\n" +
                "Formato " + formato + " Duración " + duracion + " segundos " + "Compuesta en: "+ año;}
    }
}
