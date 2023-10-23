package Aula14;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int soma = 0;
		int vet[] = new int[5];
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite  um valor");
			vet[i] = info.nextInt();
		}
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > max) {
				max = vet[i];
			}
			if (vet[i] < min) {
				min = vet[i];
			}
			soma += vet[i];
		}
		double media = soma / 5;
		System.out.println("Maior número: " + max);
		System.out.println("Menor número: " + min);
		System.out.println("Média: " + media);
	}

}
