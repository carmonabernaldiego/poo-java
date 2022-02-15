
package reproductorGrafico;

public class Pelicula extends Multimedia {
    
     
    public Pelicula(String titulo,String autor,String interprete,String formato, double duracion, int año){
        super(titulo,autor,interprete,formato,duracion,año);
    }
        
    public String toString(){
        String s = "Protagonizado por ";
        s += this.getInterprete();
        return super.toString() + "\n" + s;
    }
}
