package Aula16;

import java.util.Scanner;

public class exercicio6 {
	public static void soma(int num) {
		for (int i = 0; i <= 20; i++) {
			int soma = num + i;
			System.out.println(soma);
		}
	}
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = info.nextInt();
		soma(num);
	}

}
