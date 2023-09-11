package Aula10;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor");
			num[i] = info.nextInt();
		}
		System.out.println("Digite um valor");
		int val = info.nextInt();
		for (int i = 0; i < 10; i++) {
			if (num[i] == val ) {
				System.out.println(i);
			}
		}
	}

}
