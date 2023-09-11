package Aula3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		double num = entrada.nextDouble();
		if (num > 0) {
			System.out.println("Esse número é positivo");
		} else if (num < 0) {
			System.out.println("Esse número é negativo");
		} else {
			System.out.println("Zero não é positivo nem negativo");
		}
	}

}
