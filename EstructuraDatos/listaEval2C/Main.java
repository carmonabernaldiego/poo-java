package listaEval2C;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Mascota> mascotas = new ListaSimple<>();

        // agregar 10 mascotas a la lista
        mascotas.add(new Mascota("Lulu", 2, "Perro", 6.5f));
        mascotas.add(new Mascota("Joe", 3, "Perro", 5.4f));
        mascotas.add(new Mascota("Perlita", 1, "Perro", 0.5f));
        mascotas.add(new Mascota("Kira", 1, "Perro", 2.3f)); // mascota 4, cambiar a gato o perro da 0.
        mascotas.add(new Mascota("Bruno", 1, "Perro", 4.6f));
        mascotas.add(new Mascota("Karen", 3, "Conejo", 1.1f));
        mascotas.add(new Mascota("Canela", 5, "Perro", 2.3f)); // mascota 7 cambiar el peso da -1, pesos iguales da 1.
        mascotas.add(new Mascota("Falula", 7, "Perro", 10.6f));
        mascotas.add(new Mascota("Luna", 3, "Perro", 14.2f));
        mascotas.add(new Mascota("Cumbia", 8, "Perro", 8.7f));

        System.out.println("\n----- Buscar -----");
        // tomar la mascota4 y ejecutar la busqueda, imprimir ls posicion en que se encontro
        // ej: mascotas.contains(mascota8)
        System.out.println(mascotas.contains(new Mascota("Bruno", 1, "Perro", 4.6f)));

        System.out.println("\n----- Comparar -----");
        // comparar la mascota4 y la mascota7, imprimir el resultado
        // ej: mascota4.compareTo(mascota7)
        //mascotas.get(3) es la posicion de la mascota 4 y mascotas.get(6) es la posicion de la mascota 7
        System.out.println(mascotas.get(3).compareTo(mascotas.get(6)));

        System.out.println("\n----- Imprimir -----");
        imprimir(mascotas);
    }

    private static void imprimir(ListaSimple<Mascota> mascotas) {
        for (int i = 0; i < mascotas.size(); i++){
            System.out.println(mascotas.get(i));
        }
    }
}