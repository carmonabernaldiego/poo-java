package FigurasGeometricas;

import java.util.ArrayList;
import java.awt.*;

public class FigurasGeometricas {

	public static void main(String[] args) {
		 System.out.println("Comienza main()...");
		 Circulo c = new Circulo(2.0, 2.0, 4.0);
		 System.out.println("Radio = " + c.r + " unidades.");
		 System.out.println("Centro = (" + c.x + "," + c.y + ") unidades.");
		 Circulo c1 = new Circulo(1.0, 1.0, 2.0); //1.0, 1.0, 2.0
		 Circulo c2 = new Circulo(0.0, 0.0, 3.0);
		 c = c1.elMayor(c2);
		 //System.out.println("El mayor radio es " + c.r + ".");
		 c = new Circulo(); // c.r = 0.0;
		 c = Circulo.elMayor(c1, c2);
		 System.out.println("El mayor radio es " + c.r + ".");
		 VentanaCerrable ventana = new VentanaCerrable("Figuras Geométricas...");
		 
		 ArrayList vector = new ArrayList();
		 CirculoGrafico cg1 = new CirculoGrafico(200, 200, 100, Color.red); //200,200,100
		 CirculoGrafico cg2 = new CirculoGrafico(300, 200, 100, Color.blue);
		 RectanguloGrafico rg = new RectanguloGrafico(50, 50, 450, 350, Color.green);
		 vector.add(cg1);
		 vector.add(cg2);
		 vector.add(rg);
		 
		 PanelDibujo mipanel = new PanelDibujo(vector);
		 ventana.add(mipanel);
		 ventana.setSize(500, 400);
		 ventana.setVisible(true);
		 System.out.println("Termina main()...");
	}
}
