package Aula12;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int matriz[][] = new int[5][1];
		for (int linha = 0; linha < 5; linha++) {
			System.out.println("Digite um valor");
			matriz[linha][0] = info.nextInt();
		}

		int soma = 0;
		for (int linha = 0; linha < 5; linha++) {
			soma += matriz[linha][0];
		}
		double media = soma / 5;
		for (int linha = 0; linha < 5; linha++) {
			if (matriz[linha][0] > media) {
				System.out.println(matriz[linha][0]);
			}
		}
	}

}
