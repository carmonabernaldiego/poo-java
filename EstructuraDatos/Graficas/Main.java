package Graficas;

public class Main {
    public static void main(String[] args) {
        Complejidad c = new Complejidad();
        int ejecuciones = 20;
        int resultados[][] = new int[ejecuciones][2];

        for (int renglon = 0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 1;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.log(n);
        }

        imprimir(resultados);

        System.out.println();

        imprimirVertical(resultados);
    }

    private static void imprimir(int[][] resultado) {
        for (int renglon = 0; renglon < resultado.length; renglon++) {
            for (int veces = 0; veces < resultado[renglon][1]; veces++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void imprimirVertical(int[][] resultado) {
        //  Determinar valor máximo
        int altura = resultado[resultado.length - 1][1];

        while (altura > 0) {
            for (int i = 0; i < resultado.length; i++) {
                System.out.print(" ");
                if (resultado[i][1] >= altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //  Salto de línea
            System.out.println();
            altura--;
        }
    }
}