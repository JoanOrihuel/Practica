package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad = 0;
		final int MAYOR = 18;
		
		System.out.println("Introduce una edad: ");
		edad = teclado.nextInt();
		
		if (edad >= MAYOR) {
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona es menor de edad");
		}
		teclado.close();
	}
}
