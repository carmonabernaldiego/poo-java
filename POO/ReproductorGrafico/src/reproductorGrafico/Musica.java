
package reproductorGrafico;

public class Musica extends Multimedia {
    
    
    public Musica(String titulo,String autor,String interprete,String formato, double duracion, int año){
        super(titulo,autor,interprete,formato,duracion,año);
    }
    
    public String toString(){
        String cancion = "Interpretado por ";
        cancion += this.getInterprete();
        return super.toString() + "\n" + cancion;
    }
}
