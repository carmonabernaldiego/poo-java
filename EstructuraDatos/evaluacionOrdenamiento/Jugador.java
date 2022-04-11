package evaluacionOrdenamiento;

import java.util.Objects;

public class Jugador implements Comparable<Jugador> {
	private String color;
	private int numero;

	@Override
	public int compareTo(Jugador o) {
		int resultado = this.color.compareTo(o.getColor());
		if(resultado == 0) {
			return this.numero - o.getNumero();
		}
		return resultado;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Jugador that = (Jugador) o; //cast
		return getNumero() == that.getNumero() &&
				Objects.equals(getColor(), that.getColor());
	}

	public Jugador(String color, int numero) {
		this.color = color;
		this.numero = numero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Jugador { " + getColor() + ", " + getNumero() + " }";
	}
}