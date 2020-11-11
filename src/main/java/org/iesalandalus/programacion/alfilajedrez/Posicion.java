package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {

	// Declaro variables
	private int fila;
	private char columna;

	// CONTRUCTORES
	public Posicion(int fila, char columna) {
		// COMPROBAR ESTA EXCEPCION EN UN FUTURO
		try {
			this.fila = fila;
			this.columna = columna;
		} catch (IllegalArgumentException e) {
			System.out.println("Los valores introducidos no son correctos.");
		}
	}

	// CONSTRUCTOR COPIA
	public Posicion(Posicion posicion) {
		
	}

	// METODOS GET Y SET
	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if (fila < 1 || fila > 8)
			throw new IllegalArgumentException("El valor de fila no es correcto.");
		else
			this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h')
			throw new IllegalArgumentException("El valor de columna no es correcto.");
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
		return "Posicion= " + fila + columna;
	}
	
	
	
	
	

}