package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0, num2 = 0;
		
		System.out.println("Introduce el primer numero: ");
		num = teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		num2 = teclado.nextInt();
		
		if (num > num2) {
			System.out.println("El primer numero es mayor");
		}else if (num2 > num) {
			System.out.println("El segundo numero es mayor");
		}else {
			System.out.println("Los dos numeros son iguales");
		}
		teclado.close();
	}
}
