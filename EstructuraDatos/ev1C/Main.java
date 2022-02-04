package ev1C;

public class Main {
    public static void main(String[] args) {
        Recipiente recipiente1 = new Recipiente("CERDO", 1, 5);
        Recipiente recipiente2 = new Recipiente("RES", 3, 10);
        Recipiente recipiente3 = new Recipiente("CERDO", 2, 15);
        Recipiente recipiente4 = new Recipiente("RES", 3, 5);
        Recipiente recipiente5 = new Recipiente("BORREGO", 1, 15);
        Recipiente recipiente6 = new Recipiente("CERDO", 1, 20);
        Recipiente recipiente7 = new Recipiente("BORREGO", 3, 20);
        Recipiente recipiente8 = new Recipiente("CERDO", 2, 25);
        Recipiente recipiente9 = new Recipiente("RES", 3, 15);
        Recipiente recipiente10 = new Recipiente("BORREGO", 1, 35);

        ColaRecipiente camion = new ColaRecipiente(30);

        camion.enqueue(recipiente1);
        camion.enqueue(recipiente2);
        camion.enqueue(recipiente3);
        camion.enqueue(recipiente4);
        camion.enqueue(recipiente5);
        camion.enqueue(recipiente6);
        camion.enqueue(recipiente7);
        camion.enqueue(recipiente8);
        camion.enqueue(recipiente9);
        camion.enqueue(recipiente10);

        System.out.println("\n+ - + - + - + - + - + - Camión - + - + - + - + - + - +");
        System.out.println("Contenido : " + recipiente1.getContenido() + " - Tamaño : " + recipiente1.getTamano()
                + " - Caducidad : " + recipiente1.getCaducidad());
        System.out.println("Contenido : " + recipiente2.getContenido() + " - Tamaño : " + recipiente2.getTamano()
                + " - Caducidad : " + recipiente2.getCaducidad());
        System.out.println("Contenido : " + recipiente3.getContenido() + " - Tamaño : " + recipiente3.getTamano()
                + " - Caducidad : " + recipiente3.getCaducidad());
        System.out.println("Contenido : " + recipiente4.getContenido() + " - Tamaño : " + recipiente4.getTamano()
                + " - Caducidad : " + recipiente4.getCaducidad());
        System.out.println("Contenido : " + recipiente5.getContenido() + " - Tamaño : " + recipiente5.getTamano()
                + " - Caducidad : " + recipiente5.getCaducidad());
        System.out.println("Contenido : " + recipiente6.getContenido() + " - Tamaño : " + recipiente6.getTamano()
                + " - Caducidad : " + recipiente6.getCaducidad());
        System.out.println("Contenido : " + recipiente7.getContenido() + " - Tamaño : " + recipiente7.getTamano()
                + " - Caducidad : " + recipiente7.getCaducidad());
        System.out.println("Contenido : " + recipiente8.getContenido() + " - Tamaño : " + recipiente8.getTamano()
                + " - Caducidad : " + recipiente8.getCaducidad());
        System.out.println("Contenido : " + recipiente9.getContenido() + " - Tamaño : " + recipiente9.getTamano()
                + " - Caducidad : " + recipiente9.getCaducidad());
        System.out.println("Contenido : " + recipiente10.getContenido() + " - Tamaño : " + recipiente10.getTamano()
                + " - Caducidad : " + recipiente10.getCaducidad());

        PilaRecipiente refrigerador1 = new PilaRecipiente(30);
        PilaRecipiente refrigerador2 = new PilaRecipiente(30);
        PilaRecipiente refrigerador3 = new PilaRecipiente(30);

        while (!camion.isEmpty()) {
            Recipiente recipiente = camion.dequeue();

            if (recipiente.getContenido() == "RES") {
                refrigerador1.push(recipiente);
            } else if (recipiente.getContenido() == "CERDO") {
                refrigerador2.push(recipiente);
            } else if (recipiente.getContenido() == "BORREGO") {
                refrigerador3.push(recipiente);
            }
        }

        imprimirPila("Refrigerador 1", refrigerador1);
        imprimirPila("Refrigerador 2", refrigerador2);
        imprimirPila("Refrigerador 3", refrigerador3);
    }

    public static void imprimirPila(String etiqueta, PilaRecipiente pila) {
        System.out.println("\n+ - + - + - + - + - + - " + etiqueta + " - + - + - + - + - + - +");
        while (!pila.isEmpty()) {
            Recipiente r = pila.pop();
            System.out.println("Contenido : " + r.getContenido() + " - Tamaño : " + r.getTamano() + " - Caducidad : "
                    + r.getCaducidad());
        }
    }
}