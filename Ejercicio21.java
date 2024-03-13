package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main (String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int nota = 0;
			
			System.out.println("Introduce una nota");
			nota = teclado.nextInt();
			
			switch (nota) {
			case 1, 2, 3, 4:
				System.out.println("Suspendido");
				break;
			case 5:
				System.out.println("Aprobado");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7, 8:
				System.out.println("Notable");
				break;
			case 9, 10:
				System.out.println("Sobresaliente");
				break;
			}if (nota > 10) {
				System.out.println("No presentado");
			}
			teclado.close();
		}
	}
}
