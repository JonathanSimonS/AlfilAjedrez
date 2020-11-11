package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {

	// Declaro variables
	private int fila;
	private char columna;

	// Creo los contructores
	public Posicion(int fila, char columna) {

	}


	// Genero métodos get y set
	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if (fila >= 1 && fila <= 8)
			this.fila = fila;
		// else PONER EXCEPCION AQUI
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		if (columna >= 'a' && columna <= 'h')
			this.columna = columna;
		// else PONER EXCEPCION AQUI
	}

}
