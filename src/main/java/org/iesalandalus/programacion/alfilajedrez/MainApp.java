package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		do {
			
			mostrarMenu();
			opcion=elegirOpción();
			ejecutarOpcion(opcion);	
			
		} while (opcion!=0);
		
		System.out.println("Muchas gracias. Hasta luego. ");
	}
	
	private static void mostrarAlfil() {
		System.out.println("");
		System.out.println(Alfil.alfil);
		System.out.println("");
	}

	private static void mostrarMenu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Menú con las diferentes opciones ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.println("1.Crear un alfil por defecto. ");
		System.out.println("2.Crear un alfil de un color. ");
		System.out.println("3.Crear un alfil de un color y una columna. ");
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
		} while (opcion < 0 || opcion > 4);

		return opcion;
	}

	private static Color elegirColor() {
		int opcion;
		do {
			System.out.println("~~~~~~~~~~~~~~~ ");
			System.out.println("Elige un color: ");
			System.out.println("~~~~~~~~~~~~~~~ ");
			System.out.println("0. BLANCO");
			System.out.println("1. NEGRO");
			System.out.println("");
			opcion = Entrada.entero();
		} while (opcion != 0 && opcion != 1);

		if (opcion == 1)
			return Color.NEGRO;
		else
			return Color.BLANCO;

	}

	private static char elegirColumnaInicial() {
		int opcion;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			System.out.println("Elige la columna inicial: ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			System.out.println("0. C ");
			System.out.println("1. F ");
			System.out.println("");
			opcion = Entrada.entero();
		} while (opcion != 0 && opcion != 1);
		if (opcion == 1)
			return 'f';
		else
			return 'c';
	}

	private static void mostrarMenuDirecciones() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Menú con las diferentes direcciones: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.println("1.Arriba a la derecha. ");
		System.out.println("2.Arriba a la izquierda. ");
		System.out.println("3.Abajo a la derecha. ");
		System.out.println("4.Abajo a la izquierda. ");
		System.out.println("");
	}

	private static Direccion elegirDireccion() {

		int opcion;
		do {
			System.out.println("Elige una dirección");
			System.out.println("~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~1-4~~~~~~~~");
			System.out.println("");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 4);

		Direccion direccion = Direccion.ABAJO_DERECHA;
		switch (opcion) {
		case 1:
			direccion = Direccion.ARRIBA_DERECHA;
			break;
		case 2:
			direccion = Direccion.ARRIBA_IZQUIERDA;
			break;
		case 3:
			direccion = Direccion.ABAJO_DERECHA;
			break;
		case 4:
			direccion = Direccion.ABAJO_IZQUIERDA;
			break;
		default:
			break;
		}
		return direccion;
	}

	private static void crearAlfilDefecto() {
		Alfil.alfil = new Alfil();
		mostrarAlfil();
	}

	private static void crearAlfilColor() {
		Alfil.alfil = new Alfil(elegirColor());
		mostrarAlfil();
	}

	private static void crearAlfilColorColumna() {
		Alfil.alfil = new Alfil(elegirColor(), elegirColumnaInicial());
		mostrarAlfil();
	}

	private static void mover() {
//		try {
			int pasos =0;
		
			mostrarMenuDirecciones();
			elegirDireccion();
			System.out.println("Cuantos pasos mueves?");
			pasos=Entrada.entero();
			
			mostrarAlfil();
			// mover(Direccion direccion, int pasos)
//		} catch (OperationNotSupportedException e) {
//			System.out.println(e.getMessage());
//		}
	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1: // Creo alfil por defecto
			crearAlfilDefecto();
			break;
		case 2: // Creo alfil eligiendo color
			crearAlfilColor();
			break;
		case 3: // Creo alfil eligiendo color y columna
			crearAlfilColorColumna();
			break;
		case 4: // mover el alfil
			mover();
			break;
		default: //salir
			break;
		}
	}

}
