package Aula3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		double num = entrada.nextDouble();
		if (num % 2 == 0) {
			System.out.println("Esse número é par");
		} else {
			System.out.println("Esse número é impar");
		}
	}

}
