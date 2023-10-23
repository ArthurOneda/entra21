package Aula16;

import java.util.Scanner;

public class exercicio4 {
	public static void op(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " é o maior número");
		} else if (num2 > num1) {
			System.out.println(num2 + " é o maior número");
		} else {
			System.out.println("Números iguais");
		}
	}
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int num1 = info.nextInt();
		System.out.println("Digite outro número");
		int num2 = info.nextInt();
		op(num1, num2);
	}

}
