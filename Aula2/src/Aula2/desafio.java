package Aula2;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		int num1 = entrada.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("Esse número é par");
		} else {
			System.out.println("Esse número não é par");
		}
	}

}
