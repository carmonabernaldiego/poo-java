package calculointeres02;
import java.util.Scanner;

public class calculointeres02 {
	
	public static void main(String[] args) {
		//	Declaración de constantes
		double interes_semestral = 2.75/100/2;
		double impuestoretenido = 0.18;
		
		//	Se declara el objeto de entrada de datos
		Scanner sc = new Scanner(System.in);
		//	Entrada de datos (depósito en efectivo a cuenta)
		System.out.print("Dinero ingresado: ");
		double deposito = sc.nextDouble();
		
		//	Implementación de Métodos y Formateo
		double intereses_semestral = calculo_interes_semestral(deposito, interes_semestral);
		String interes_semestral_formato = String.format("$%,.2f", interes_semestral);
		double retenciones = calculo_retenciones(deposito, interes_semestral, impuestoretenido);
		String retencion_formato = String.format("$%,.2f", retenciones);
		double interes_cobrados = calculo_interes_cobrados(deposito, interes_semestral, impuestoretenido);
		String impuestoretenido_formato = String.format("$%,.2f", interes_cobrados);
		
		//	Impresión de resultados
		System.out.println("Intereses a los seis meses: " + intereses_semestral);
		System.out.println("Retenciones realizadas: " + retencion_formato);
		System.out.println("Intereses cobrados: " + impuestoretenido_formato);
	}
	
	public static double calculo_interes_semestral(double depo, double intsemes) {
		double interes_semestral_final = depo * intsemes;
		return interes_semestral_final;
	}
	
	public static double calculo_retenciones(double depo, double intsemes, double imprete) {
		double retencionesfinal = depo * intsemes * imprete;
		return retencionesfinal;		
	}
	
	public static double calculo_interes_cobrados(double depo, double intsemes, double imprete) {
		double interes_cobrados_final = depo * intsemes * (1 - imprete);
		return interes_cobrados_final;
	}
}