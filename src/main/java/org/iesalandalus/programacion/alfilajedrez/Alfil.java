package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {

	// ATRIBUTOS
	private Color color;
	private Posicion posicion;

	
	// alfil negro en la posición '8f'.
	//CONTRUCTORES
	public Alfil() {
		this.color=Color.NEGRO;
		Posicion posicion = new Posicion(8, 'f');
	}

	// METODOS GET Y SET
	public Color getColor() {
		return color;
	}

	// NullPointerException PORQUE ESTARIAMOS TRATANDO DE USAR UNA VARIABLE NULA
	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("El color no puede ser nulo ni vacío.");
		}
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("La posicion no puede ser nula ni vacía.");
		}
		this.posicion = posicion;
	}

}
