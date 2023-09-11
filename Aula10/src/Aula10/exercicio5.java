package Aula10;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		String val[] = new String[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor");
			val[i] = info.next();
		}
		System.out.println("Digite um índice");
		int ind = info.nextInt();
		System.out.println(val[ind]);
	}

}
