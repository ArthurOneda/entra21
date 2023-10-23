package Aula19;

import java.util.Scanner;

public class exercicio2 {
	public static String cond(int num1, int num2) {
		int soma = num1 + num2;
		int dif = num1 - num2;
		if (num1 == 5 || num2 == 5 || soma == 5 || dif ==5) {
			num1 = num1 * num1 * num1;
			num2 = num2 * num2 * num2;
		} else {
			num1 = num1 * num1;
			num2 = num2 * num2;
		}
		String resp = num1 + " " + num2;
		return resp;
	}
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int num1 = info.nextInt();
		System.out.println("Digite outro número");
		int num2 = info.nextInt();
		System.out.println(cond(num1, num2));
	}

}
