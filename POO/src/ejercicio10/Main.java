package ejercicio10;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int opc = 0;

		String menu = "";

		do {
			menu = "";
			menu += "1 .- Validar hora.\n";
			menu += "2 .- Salir.\n";
			menu += "\nEscribe una opción : ";

			String entrada = JOptionPane.showInputDialog(null, menu, "Validación hora",
					JOptionPane.INFORMATION_MESSAGE);

			if (entrada != null) {
				if (!entrada.trim().equals("")) {
					if (esNumero(entrada) == true) {
						opc = Integer.parseInt(entrada);
					} else {
						opc = 0;
					}

					switch (opc) {
						case 1:
							int hora, minuto, segundo;

							hora = Integer.parseInt(entradaDatos("Validación hora", "Escribe la hora : "));

							if (hora != -1) {
								minuto = Integer.parseInt(entradaDatos("Validación hora", "Escribe los minutos : "));

								if (minuto != -1) {
									segundo = Integer
											.parseInt(entradaDatos("Validación hora", "Escribe los segundos : "));

									if (segundo != -1) {
										String resultado_formato = "";

										if (validarHora(hora, minuto, segundo)) {
											resultado_formato = "La hora " + hora + ":" + minuto + ":" + segundo
													+ " es correcta.";
										} else {
											resultado_formato = "La hora " + hora + ":" + minuto + ":" + segundo
													+ " es incorrecta.";
										}
										mostrarDatos("Validación hora", resultado_formato);
									}
								}
							}
							break;
						case 2:
							opc = -1;
							break;
						default:
							JOptionPane.showMessageDialog(null, "¡Opción incorrecta!", "Error",
									JOptionPane.ERROR_MESSAGE);
							break;
					}
				} else {
					JOptionPane.showMessageDialog(null, "¡Escribe una opcion correcta!", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			} else {
				opc = -1;
			}
		} while (opc != -1);
		JOptionPane.showMessageDialog(null, "Fin de la Aplicación.", "Información", JOptionPane.INFORMATION_MESSAGE);
	}

	public static String entradaDatos(String title, String body) {
		int continuar = 1;

		String entrada = "";

		do {
			entrada = JOptionPane.showInputDialog(null, body, title, JOptionPane.INFORMATION_MESSAGE);

			if (entrada != null) {
				if (!entrada.trim().equals("")) {
					if (esNumero(entrada) == true) {
						return entrada;
					} else {
						continuar = 1;
						entrada = "";
					}
				} else {
					JOptionPane.showMessageDialog(null, "Rellena el campo, por favor.", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			} else {
				continuar = -1;
				entrada = "-1";
			}
		} while (continuar != -1);

		return entrada;
	}

	public static void mostrarDatos(String title, String body) {
		JOptionPane.showMessageDialog(null, body, title, JOptionPane.INFORMATION_MESSAGE);
	}

	public static boolean esNumero(String cadena) {
		boolean resultado;

		try {
			Integer.parseInt(cadena);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		}

		return resultado;
	}

	public static boolean validarHora(int hora, int minuto, int segundo) {
		boolean validar;

		if ((hora >= 0 && hora < 24) && (minuto >= 0 && minuto < 60) && (segundo >= 0 && segundo < 60)) {
			validar = true;
		} else {
			validar = false;
		}

		return validar;
	}
}