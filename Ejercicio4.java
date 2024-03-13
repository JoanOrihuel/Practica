package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad = 0;
		final int MAYOR = 18;
		String mensaje = "La persona no es mayor de edad";
		
		System.out.println("Introduce una edad: ");
		edad = teclado.nextInt();
		
		if (edad >= MAYOR) {
			mensaje = "La persona es mayor de edad";
		}	
		System.out.println(mensaje);
		teclado.close();
	}
}
