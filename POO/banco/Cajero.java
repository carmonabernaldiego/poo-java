package banco;

public class Cajero implements Hardware {
	protected double dineroCajero;

	public Cajero() {
		this.dineroCajero = 0;
	}

	public Cajero(double dinero) {
		this.dineroCajero = dinero;
	}

	public void setDineroCajero(double dinero) {
		this.dineroCajero = dinero;
	}

	public double getDineroCajero() {
		return this.dineroCajero;
	}

	public boolean RanuraRetiro(double dinero) {
		if (getDineroCajero() >= dinero) {
			setDineroCajero(getDineroCajero() - dinero);
			return true;
		} else {
			return false;
		}
	}
}