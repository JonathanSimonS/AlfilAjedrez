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

	// CONSTRUCTOR COPIA CREADO
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

}