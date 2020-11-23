package org.iesalandalus.programacion.alfilajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Después de cada operación se nos mostrará el estado actual de nuestro alfil.
		 * 
		 * El menú se repetirá mientras no elijamos la opción salir.
		 * 
		 * Se debe validar que todas las entradas al programa son correctas
		 * 
		 */
		int opcion;
		mostrarAlfil();
		mostrarMenu();
		elegirOpción();

	}

	private static void mostrarAlfil() {
		System.out.println(Alfil.ALFIL);
	}

	private static void mostrarMenu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Menú con las diferentes opciones ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.println("1.Crear un alfil por defecto. ");
		System.out.println("2.Crear un alfil de un color. ");
		System.out.println("3.Crear un alfil de un color en una columna inicial dada ('c' o 'f'). ");
		System.out.println("4.Mover el alfil.");
		System.out.println("");
		System.out.println("0. Salir");
		System.out.println("");
	}

	private static int elegirOpción() {

		int opcion;
		do {
			System.out.println("Elige una opción: ");
			System.out.println("~~~~~~~0-4~~~~~~~ ");
			System.out.println("");
			opcion = Entrada.entero();
		} while (opcion<0 || opcion>4);

		return opcion;
	}

}
