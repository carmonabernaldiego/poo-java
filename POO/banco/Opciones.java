package banco;

public abstract class Opciones implements Menu {
	protected int nip;
	protected String nombreCuenta;
	protected double saldoCuenta;

	public Opciones() {
		this.nip = 0;
		this.nombreCuenta = null;
		this.saldoCuenta = 0;
	}

	public Opciones(int nip, String nombre, double saldo) {
		this.nip = nip;
		this.nombreCuenta = nombre;
		this.saldoCuenta = saldo;
	}

	public abstract void Inicio();

	public abstract void Consulta();

	public abstract boolean Retiro(double Cantidad);

	public abstract boolean Deposito(double Cantidad);
}