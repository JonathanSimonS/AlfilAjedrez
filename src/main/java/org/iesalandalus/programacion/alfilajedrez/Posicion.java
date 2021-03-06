package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {

	// Declaro variables
	private int fila;
	private char columna;

	// CONTRUCTORES
	public Posicion(int fila, char columna) throws IllegalArgumentException {
		setFila(fila);
		setColumna(columna);
	}

	// CONSTRUCTOR COPIA
	public Posicion(Posicion e){
		if(e==null)
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		setFila(e.getFila());
		setColumna(e.getColumna());
	}

	// METODOS GET Y SET
	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if (fila < 1 || fila > 8)
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		else
			this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h')
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		else
			this.columna = columna;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
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
		Posicion other = (Posicion) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "fila=" + fila + ", columna=" + columna;
	}

}