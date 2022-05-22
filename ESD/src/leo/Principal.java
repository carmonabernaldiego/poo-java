package leo;

public class Principal {
    public static void main(String[] args) {
        ListaSimple<Mascota> mascotas = new ListaSimple<>();
        // agregar 10 mascotas a la lista
        mascotas.add(new Mascota("Firulais", 1, "Perro", (float) 0.51));//1
        mascotas.add(new Mascota("Fito", 2, "Gato", (float) 0.62));//2
        mascotas.add(new Mascota("Simba", 3, "Hamster", (float) 0.73));//3
        mascotas.add(new Mascota("Coco", 4, "Cuyo", (float) 0.84));//4
        mascotas.add(new Mascota("Lucas", 5, "Loro", (float) 0.95));//5
        mascotas.add(new Mascota("Tyson", 6, "Cotorro", (float) 1.06));//6
        mascotas.add(new Mascota("Toby", 7, "Conejo", (float) 1.17));//7
        mascotas.add(new Mascota("Bruno", 8, "Pez", (float) 1.28));//8
        mascotas.add(new Mascota("Scar", 9, "Tortuga", (float) 1.39));//9
        mascotas.add(new Mascota("Nacho", 10, "Serpiente", (float) 1.40));//10

        // tomar la mascota4 y ejecutar la busqueda, imprimir ls posicion en que se encontro
        // ej: mascotas.contains(mascota8)
        
        System.out.println("Buscar: " + mascotas.contains(new Mascota("Bruno", 8, "Pez", (float) 1.28)));

        // comparar la mascota4 y la mascota7, imprimir el resultado
        // ej: mascota4.compareTo(mascota7)
        
        Mascota ca = (new Mascota("Coco", 7, "Conejo", (float) 1.17));//4
        Mascota cb = (new Mascota("Toby", 7, "Conejo", (float) 1.17));//7
        
        System.out.println("Comparado " + ca.compareTo(cb));

        imprimir(mascotas);

    }

    private static void imprimir(ListaSimple<Mascota> mascotas) {
    	for(int i = 0; i < mascotas.size(); i++) {
    		System.out.println(mascotas.get(i));
    	}
    }
    
}