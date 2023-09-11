package Aula10;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num[] = new int[5];
		int soma = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um valor");
			num[i] = info.nextInt();
			soma += num[i];
			if (maior < num[i]) {
				maior = num[i];
			}
			if (menor > num[i]) {
				menor = num[i];
			}
		}
		double media = soma / 5;
		System.out.println("O maior numero é " + maior);
		System.out.println("O menor numero é " + menor);
		System.out.println("A média dos numeros é " + media);
	}

}
