package Aula14;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		double vet[] = new double[12];
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite um valor");
			vet[i] = info.nextDouble();
			if (i % 2 == 0) {
				vet[i] = vet [i] * 1.02;
			} else {
				vet[i] = vet [i] * 1.05;
			}
		}
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}

}
