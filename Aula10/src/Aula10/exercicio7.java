package Aula10;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor");
			num[i] = info.nextInt();
		}
		System.out.println("Digite um índice");
		int ind = info.nextInt();
		num[ind] = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
