package Archivo;

public class Main {

    public static void main(String[] args) {
	    Complejidad c = new Complejidad();
        /*c.lineal(100);
        c.lineal(200);
        c.lineal(300);

        c.cuadratica(100);
        c.cuadratica(200);
        c.cuadratica(300);

        System.out.println("Gauss:" + "N*(1+N)/2" );
        c.gauss(100);
        c.gauss(200);
        c.gauss(300);

        System.out.println("logaritmica mult");
        c.log(100);
        c.log(200);
        c.log(300);*/

        System.out.println("logaritmica div");
        c.logd(100);
        c.logd(200);
        c.logd(3000000);

        System.out.println("N log N ");
        c.nlogn(100);
        c.nlogn(200);
        c.nlogn(3000000);

    }


}
