package FigurasGeometricas;

public class Rectangulo extends Geometria{
	// definición de variables miembro de la claes
	
	private static int numRectangulos = 0;
	protected double x1, y1, x2, y2;
	
	// constructores de la clase
	
	public Rectangulo(double p1x, double p1y, double p2x, double p2y) {
		x1 = p1x;
		x2 = p2x;
		y1 = p1y;
		y2 = p2y;
		numRectangulos++;
	}
	
	 public Rectangulo(){ this(0, 0, 1.0, 1.0); }
	 // definición de métodos
	 
	 	public double perimetro() { return 2.0 * ((x1-x2)+(y1-y2)); }
	 	public double area() { return (x1-x2)*(y1-y2); 
	 }
	
	
	

}
