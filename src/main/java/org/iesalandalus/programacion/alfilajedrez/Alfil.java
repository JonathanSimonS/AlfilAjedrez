package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {

	// ATRIBUTOS
	private Color color;
	private Posicion posicion;

	// CONTRUCTORES
	public Alfil() throws NullPointerException {
		color= Color.NEGRO;
		posicion = new Posicion(8, 'f');
	}

	public Alfil(Color color) throws NullPointerException {
		if (color == null)
			throw new NullPointerException("ERROR: El color del alfil no puede ser nulo");
		setColor(color);
		if (color.equals(Color.NEGRO))
			posicion = new Posicion(8, 'f');
		else
			posicion = new Posicion(1, 'f');
	}
	
	public Alfil(Color color, char columna) throws NullPointerException, IllegalArgumentException {
		if (color == null)
			throw new NullPointerException("ERROR: El color del alfil no puede ser nulo");
		setColor(color);
		if ((columna!='c') || (columna!='f'))
			throw new IllegalArgumentException("ERROR: La columna inicial de un alfil debe de ser 'c' o 'f'.");
		if (color.equals(Color.NEGRO))
			posicion = new Posicion(8, columna);
		else
			posicion = new Posicion(1, columna);
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

}
