package Aula6;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = info.nextInt();
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

}
