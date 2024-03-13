package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = -1;
		
		System.out.println("1.- Altas.");
		System.out.println("2.- Bajas.");
		System.out.println("0.- Salir.");
		System.out.println("Elige una opcion: ");
		opcion = teclado.nextInt();
		
		if (opcion == 1) {
			System.out.println("Eligió Altas");
		}else if (opcion == 2) {
			System.out.println("Eligió Bajas");
		}else {
			System.out.println("¿Esta usted seguro? (S/N)");
		}
		teclado.close();
	}
}
