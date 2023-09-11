package Aula9;

import java.util.Scanner;

public class exercicio_Vet2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um numero");
			num[i] = info.nextInt();
		}
		for (int i = 4; i >= 0; i--) {
			System.out.println(num[i]);
		}
	}

}
