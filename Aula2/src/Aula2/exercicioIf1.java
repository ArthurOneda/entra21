package Aula2;

import java.util.Scanner;

public class exercicioIf1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		double num1 = entrada.nextDouble();
		System.out.println("Digite outro número");
		double num2 = entrada.nextDouble();
		if (num1 > num2) {
			System.out.println(num1 + " é maior que " + num2);
		} else if (num1 == num2) {
			System.out.println("Os números são iguais");
		} else {
			System.out.println(num2 + " é maior que " + num1);
		}
	}

}
