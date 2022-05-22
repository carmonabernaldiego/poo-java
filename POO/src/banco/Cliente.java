package banco;

import java.util.Scanner;

public class Cliente extends Opciones {
	public Cliente(int nip, String nombre, double saldo) {
		super(nip, nombre, saldo);
	}

	public void setNIP(int id) {
		super.nip = id;
	}

	public int getId() {
		return super.nip;
	}

	public void setNombre(String nombre) {
		super.nombreCuenta = nombre;
	}

	public String getNombre() {
		return super.nombreCuenta;
	}

	public void setSaldo(double saldo) {
		super.saldoCuenta = saldo;
	}

	public double getSaldo() {
		return super.saldoCuenta;
	}

	@Override
	public void Inicio() {
		System.out.println("\n\nBienvenido Señor(a)          " + getNombre());
		System.out.println("\n(1) Consultar Saldo   (2) Retiro   (3) Deposito   (4) Salir");
	}

	@Override
	public void Consulta() {
		System.out.println("\n\nSeñor(a)                     " + getNombre());
		System.out.println("\nSu saldo es                  $" + String.format("%.2f", getSaldo()));

		System.out.println("\nIngrese (1) y presione enter para continuar.");
		Scanner s = new Scanner(System.in);
		s.next();
	}

	@Override
	public boolean Retiro(double dinero) {
		if (getSaldo() >= dinero) {
			setSaldo(getSaldo() - dinero);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean Deposito(double dinero) {
		double saldoActual = getSaldo();

		setSaldo(getSaldo() + dinero);

		return getSaldo() > saldoActual;
	}
}