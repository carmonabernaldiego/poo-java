
package reproductorGrafico;


public class ListaMultimedia {
    private Multimedia[] lista;
    private int contador;
    
    public ListaMultimedia(int tamañoMaximo){
        lista = new Multimedia[tamañoMaximo];
        contador = 0;
    }
    
    public int size(){
        return contador;
    }
    
    private boolean llena(){
        return contador == lista.length;
    }
    
    public boolean add(Multimedia m){
        if (llena()){
            return false;
        }else{
            lista[contador] = m;
            contador++;
            return true;
        }
    }
        
    public String toString(){
        String s="";
        for(int i=0; i<contador; i++){
            s += lista[i].toString() + "\n\n";
        }
        return s;
    }
    
}
