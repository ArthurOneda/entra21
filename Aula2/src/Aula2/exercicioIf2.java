package Aula2;

import java.util.Scanner;

public class exercicioIf2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		int num1 = entrada.nextInt();
		System.out.println("Digite outro número");
		int num2 = entrada.nextInt();
		int rest;
		if (num1 < num2) {
			rest = num2 % num1;
		} else {
			rest = num1 % num2;
		}
		if (rest == 0) {
			System.out.println("Os números são múltiplos");
		} else {
			System.out.println("Os números não são múltiplos");
		}
	}
}
