package Aula9;

import java.util.Scanner;

public class exercicioVet1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		double notas[] = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite a nota");
			notas[i] = info.nextDouble();
		}
		double soma = notas[0] + notas[1] + notas[2];
		double media = soma / 3;
		System.out.println("Media = " + media);
	}

}
