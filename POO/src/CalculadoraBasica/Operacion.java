package CalculadoraBasica;
import java.util.Scanner;

public class Operacion {
	private String tipo;
	private float numero1;
	private float numero2;
	private float total;
	
	public void setOperacion(String tipoOperacion) {
		tipo = tipoOperacion; //  Definimos el tipo de operacion 
	}
	
	//  Método para ingresar el valor de numero1 y numero2
    public void setNum()
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("\n\nPor favor, ingrese el primer numero : ");
    	numero1 = sc.nextFloat();
		System.out.print("\n\nPor favor, ingrese el segundo numero : ");
		numero2 = sc.nextFloat();
    }
    
    //  Método para obtener el resultado de la operacion
    public float getResultado()
    {
    	switch (tipo)
        {
            case "suma":
            	total = numero1 + numero2;
            	break;
            case "resta":
            	total = numero1 - numero2;
                break;
            case "multiplicacion":
            	total = numero1 * numero2;
                break;
            case "division":
            	total = numero1 / numero2;
            	break;
        }
    	return total;
    }
    
    //  Método para obtener el tipo de operacion
    public String getTipo()
    {
        return tipo;
    }
}