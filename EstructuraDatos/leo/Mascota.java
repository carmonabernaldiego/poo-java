package leo;


//import org.hamcrest.core.StringContains;

public class Mascota implements Comparable<Mascota> {
    private String nombre;
    private int edad;
    private String tipo;     // perro, gato, hamster etc.
    private float peso;
    
    public Mascota(String nombre, int edad, String tipo, float peso) {
    	this.nombre = nombre;
    	this.edad = edad;
    	this.tipo = tipo;
    	this.peso = peso;
    }
    
    //Mi matricula es 213497 - Matr�cula 7,8 raza (tipo) y peso
    //Implementar
    @Override
    public boolean equals(Object o) {
    	if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Mascota that = (Mascota) o;
        return getTipo().equals(that.getTipo()) &&
        		getPeso() == that.getPeso();
    }

    // Implementar
    @Override
    public int compareTo(Mascota m){
    	int n = getTipo().compareTo(this.getTipo());
    	int p = (int) (this.getPeso() - m.getPeso());
    	
    	if(n > 0) {
    		return 1;
    	} else if (n < 0) {
    		return -1;
    	} else {
    		if(p > 0) {
    			return 1;
    		} else if( p == 0) {
    			return 0;
    		} else {
    			return -1;
    		}
    	}
    }

    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String Nombre) {
    	this.nombre = nombre;
    }
    
    public int  getEdad() {
    	return edad;
    }
    
    public void setEdad(int Edad) {
    	this.edad = edad;
    }
    
    public String getTipo() {
    	return tipo;
    }
    
    public void setTipo(String Tipo) {
    	this.tipo = tipo;
    }
    
    public float getPeso() {
    	return peso;
    }
    
    public void setPeso(float Peso) {
    	this.peso = peso;
    }
    
    @Override
    public String toString(){
        return nombre + ":" + tipo;
    }
}