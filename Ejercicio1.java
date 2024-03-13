package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		double precio = 0.0, precioDescuento = 0.0;
		final int POR = 15;
		
		System.out.println("Introduce el precio: ");
		precio = teclado.nextDouble();
		
		//hola
		
		if ((precio >= 50) && (precio <= 100)) {
			precioDescuento = (precio*POR) / 100;
		}
		System.out.println(precioDescuento);
		teclado.close();
	}
}
