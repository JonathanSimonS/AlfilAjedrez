package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

public class Alfil {

	// ATRIBUTOS
	private Color color;
	private Posicion posicion;
	private Direccion direccion;
	private int pasos;
	public static Alfil alfil;

	// CONTRUCTORES
	public Alfil() {

		color = Color.NEGRO;
		posicion = new Posicion(8, 'f');
	}

	public Alfil(Color color) {

		if (color == null)
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		setColor(color);
		if (color.equals(Color.NEGRO))
			posicion = new Posicion(8, 'f');
		else
			posicion = new Posicion(1, 'f');
	}

	public Alfil(Color color, char columna) {

		if (color == null)
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		setColor(color);
		if ((columna != 'c') && (columna != 'f')) {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		if (color.equals(Color.NEGRO)) {
			posicion = new Posicion(8, columna);
		} else {
			posicion = new Posicion(1, columna);
		}
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
		return new Posicion(posicion);
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null)
			throw new NullPointerException("ERROR: La posicion no puede ser nula.");
		this.posicion = new Posicion(posicion);
	}

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {

		int nuevaFila = 0;
		char nuevaColumna = 0;

		if (direccion == null)
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		this.direccion = direccion;

		if (pasos <= 0)
			throw new IllegalArgumentException("ERROR: El número de pasos debe ser positivo.");
		this.pasos = pasos;

		switch (direccion) {
		case ABAJO_DERECHA:
			nuevaFila -= nuevaFila;
			nuevaColumna += nuevaColumna;
			// suma columna, resta fila
			break;
		case ABAJO_IZQUIERDA:
			nuevaFila -= nuevaFila;
			nuevaColumna -= nuevaColumna;
			// resta columna, resta fila
			break;
		case ARRIBA_DERECHA:
			nuevaFila += nuevaFila;
			nuevaColumna += nuevaColumna;
			// suma columna, suma fila
			break;
		case ARRIBA_IZQUIERDA:
			nuevaFila += nuevaFila;
			nuevaColumna -= nuevaColumna;
			// resta columna, suma fila
			break;
		default:
		}

		// capturo la posible excepción de la clase Posición
		try {
			setPosicion(new Posicion(nuevaFila, nuevaColumna));
		} catch (IllegalArgumentException e) {
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		} // falta arreglar error- TESTALFIL
			// No deberia saltar ninguna excepcion ya que los movimientos son válidos
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + pasos;
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alfil other = (Alfil) obj;
		if (color != other.color)
			return false;
		if (direccion != other.direccion)
			return false;
		if (pasos != other.pasos)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return posicion + ", color=" + color;
	}
}
