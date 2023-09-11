package Aula6;

import java.util.Scanner;

public class exercico1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número que querira subtrair ");
		int num = info.nextInt();
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite por qual número você quer subtrair");
			int numS = info.nextInt();
			num = num - numS;
			System.out.println(num);
		}
	}
}
