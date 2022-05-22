package ordenacion;

import java.util.Objects;

public class Datos implements Comparable<Datos> {
	private String letra;
	private int numero;

	@Override
	public int compareTo(Datos o) {
		return this.letra.compareTo(o.getLetra());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Datos that = (Datos) o; //cast
		return getNumero() == that.getNumero() &&
				Objects.equals(getLetra(), that.getLetra());
	}

	public Datos(String letra, int numero) {
		this.letra = letra;
		this.numero = numero;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Datos { " + getLetra() + ", " + getNumero() + " }";
	}
}