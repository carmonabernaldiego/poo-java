package banco;

import java.io.*;

public class Main {
	public static InputStreamReader leer = new InputStreamReader(System.in);

	public static BufferedReader teclado = new BufferedReader(leer);

	public static void main(String[] args) throws IOException {
		boolean error, buscar = false;

		int cuenta = 0;
		int opc, elemento = -1;
		int intentos = 0, dinero = 0;

		Opciones[] opcPolimorfismo = new Opciones[10];

		opcPolimorfismo[0] = new Cliente(5800, "Diego Carmona Bernal", 4800);
		opcPolimorfismo[1] = new Cliente(1234, "Carlos Cisneros Lopez", 7000);
		opcPolimorfismo[2] = new Cliente(2345, "Raul Torres Soles", 6500);
		opcPolimorfismo[3] = new Cliente(3456, "Carlos Macal Con", 9000);
		opcPolimorfismo[4] = new Cliente(4567, "Lulu Hernandez Zuni", 3000);
		opcPolimorfismo[5] = new Cliente(5678, "Antonio Olivera Galvez", 12000);
		opcPolimorfismo[6] = new Cliente(6789, "Juan Carmona Tadeo", 14200);
		opcPolimorfismo[7] = new Cliente(7890, "Pedro Martin Carmona Tadeo", 6700);
		opcPolimorfismo[8] = new Cliente(8901, "Joel Hermenegildo Surte", 8000);
		opcPolimorfismo[9] = new Cliente(9012, "Luna Carrizo Bella", 7400);

		do {
			do {
				do {
					System.out.println("\n\t\tBienvenido");

					intentos++;
					error = false;

					System.out.println("\nIngrese su NIP :");

					try {
						cuenta = Integer.parseInt(teclado.readLine());
					} catch (NumberFormatException e) {
						error = true;

						System.out.println("\n¡No debe ingresar ninguna letra!");
					}
				} while (error);

				for (int i = 0; i < opcPolimorfismo.length; i++) {
					if (opcPolimorfismo[i].nip == cuenta) {
						elemento = i;
						buscar = true;
					}
				}

				if (!buscar) {
					System.out.println("\n¡No se encontró el numero de cuenta!");
				}
			} while ((intentos < 3) && (!buscar));

			if (!buscar) {
				System.out.println("\n¡Ha excedido el numero de intentos!");
				System.exit(0);
			}

			do {
				opcPolimorfismo[elemento].Inicio();

				do {
					System.out.println("\n\t\t¿Que operación desea realizar ?");

					opc = Integer.parseInt(teclado.readLine());
				} while ((opc < 1) || (opc > 4));

				switch (opc) {
					case 1 -> opcPolimorfismo[elemento].Consulta();
					case 2 -> {
						int opcDinero = 0;

						do {
							error = false;

							System.out.println("\n\t\t\t\tRetiro de Efectivo");
							System.out.println("\n(1) 50.00   (2) 100.00   (3) 200.00   (4) 500.00   (5) 1000.00   (6) Cancelar");
							System.out.println("\nIngrese opción :");

							try {
								opcDinero = Integer.parseInt(teclado.readLine());
							} catch (NumberFormatException e) {
								error = true;

								System.out.println("\n¡No debe ingresar ninguna letra!\"");
							}
						} while (error);

						if (opcDinero == 1){
							dinero = 50;
						} else if (opcDinero == 2) {
							dinero = 100;
						} else if (opcDinero == 3) {
							dinero = 200;
						} else if (opcDinero == 4) {
							dinero = 500;
						} else if (opcDinero == 5) {
							dinero = 1000;
						} else if(opcDinero == 6) {
							break;
						}

						if ((dinero < 50) || (dinero > 5000)) {
							System.out.println("\n¡El monto mínimo de retiro es de $50.00 y el máximo es de $5000.00!");
						} else if(dinero > opcPolimorfismo[elemento].saldoCuenta) {
							System.out.println("\n¡Fondos insuficientes!");
						} else {
							if (opcPolimorfismo[elemento].Retiro(dinero)) {
								System.out.println("\n¡Operación exitosa!");
							} else {
								System.out.println("\n¡Fondos insuficientes!");
							}
						}
					}
					case 3 -> {
						do {
							error = false;

							System.out.println("\nIngrese la cantidad a depositar (solo billetes):");

							try {
								dinero = Integer.parseInt(teclado.readLine());
							} catch (NumberFormatException e) {
								System.out.println("Ingrese solo números");

								error = true;
							}
						} while (error);

						if(dinero == 0) {
							break;
						} else {
							if (opcPolimorfismo[elemento].Deposito(dinero)) {
								System.out.println("\n¡Operación exitosa!");
							}
						}
					}
				}
			} while (opc != 4);
			cuenta = 0;
			elemento = 0;
			buscar = false;
			intentos = 0;
		}while (true);
	}
}