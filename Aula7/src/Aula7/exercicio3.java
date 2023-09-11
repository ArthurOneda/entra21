package Aula7;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número entre 12 e 20");
		int num = info.nextInt();
		while (num < 12 || num > 20) {
			System.out.println("Digite um número entre 12 e 20");
			num = info.nextInt();
			if (num >= 12 && num <= 20) {
				System.out.println(num + " está entre 12 e 20");
			} else {
				System.out.println("Valor inválido");
			}
		}
	}

}
