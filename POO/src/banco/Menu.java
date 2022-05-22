package banco;

public interface Menu {
	void Inicio();
	void Consulta();
	boolean Retiro(double cant);
	boolean Deposito(double cant);
}