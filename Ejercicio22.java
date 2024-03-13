package ejercicios;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = -1;
		int num1 = 0, num2 = 0;
		double resultado = 0.0;
				
		System.out.println("1.- Sumar");
		System.out.println("2.- Restar");
		System.out.println("3.- Multiplicar");
		System.out.println("4.- Dividir");
		System.out.println("0.- Salir");
		System.out.println("Elija opcion:");
		if(teclado.hasNextInt()) {
			opcion = teclado.nextInt();
		}		
		
		switch (opcion) {
		case 1:
			System.out.println("Introduce un numero:");
			if(teclado.hasNextInt()) {
				num1 = teclado.nextInt();
				System.out.println("Introduce otro numero:");
				if(teclado.hasNextInt()) {
					num2 = teclado.nextInt();
					System.out.printf("La suma de " + num1 + " y " + num2 + " es " + (num1+num2));
				}
				else {
					System.out.println("No a introducido un entero");
				}
			}else {
					System.out.println("No a introducido un entero");
				}
			break;	
		case 4:
		System.out.println("Introduce un numero:");
			if(teclado.hasNextInt()) {
				num1 = teclado.nextInt();
				System.out.println("Introduce otro numero:");
				if(teclado.hasNextInt()) {
					num2 = teclado.nextInt();
					if(num2 != 0) {
						resultado = (double) num1/num2;
						System.out.printf("La division de %d entre %d es %.2f", num1, num2, resultado);
					}
					else {
						System.out.println("No se puede dividir entre 0");
					}
				}
				else {
					System.out.println("No a introducido un entero");
				}
			}else {
					System.out.println("No a introducido un entero");
				}
				
					}		
		teclado.close();
	}
}
