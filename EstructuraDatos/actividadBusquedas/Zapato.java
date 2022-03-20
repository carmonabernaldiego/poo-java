package actividadBusquedas;

import java.util.Objects;

public class Zapato implements Comparable<Zapato> {
	private String nombre;
	private String marca;
	private int talla;

	@Override
	public int compareTo(Zapato o) {
		int res = this.getNombre().compareTo(o.getNombre());

		if (res == 0) {
			if (this.getMarca().equals(o.getMarca()) && this.getTalla() == o.getTalla()) {
				return 0;
			} else {
				return -1;
			}
		}

		return res;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Zapato that = (Zapato) o; //cast
		return Objects.equals(getMarca(), that.getMarca());
	}

	public Zapato(String nombre, String marca, int talla) {
		this.nombre = nombre;
		this.marca = marca;
		this.talla = talla;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public int getTalla() {
		return talla;
	}

	@Override
	public String toString() {
		return "{ Nombre: " + nombre +
				", Marca: " + marca +
				", Talla: " + talla + " }";
	}
}