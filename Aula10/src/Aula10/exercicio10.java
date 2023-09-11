package Aula10;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um valor para o índice " + i);
			num[i] = info.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
	}

}
