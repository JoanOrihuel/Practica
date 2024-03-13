package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
		
		System.out.println((num >= 0)?"Positivo":"Negativo");
		teclado.close();
	}
}
