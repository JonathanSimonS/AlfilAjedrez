package org.iesalandalus.programacion.alfilajedrez;

import empresa.Seccion;

public class Alfil {

	// ATRIBUTOS
	private Color color;
	private Posicion posicion;

	// CONTRUCTORES
	public Alfil() {
		this.color = Color.NEGRO;
		posicion = new Posicion(8, 'f');
	}

	public Alfil(Color color) {
		if (color.equals(Color.NEGRO)) {
			posicion = new Posicion(8, 'f');
		}
		posicion = new Posicion(1, 'f');
	}

	public Alfil(Color color, char columna) {
		this.color = color;
		// this.columna
		// IllegalArgumentException con columna
	}

	// METODOS GET Y SET
	public Color getColor() {
		return color;
	}

	// NullPointerException PORQUE ESTARIAMOS TRATANDO DE USAR UNA VARIABLE NULA
	// (OBJETO)
	private void setColor(Color color) {
		if (color == null)
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null)
			throw new NullPointerException("ERROR: La posicion no puede ser nula.");
		this.posicion = posicion;
	}

}
