package Aula3;

import java.util.Scanner;

public class exercicioOU3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de um produto: ");
		double p1 = entrada.nextDouble();
		System.out.println("Digite o valor de um segundo produto: ");
		double p2 = entrada.nextDouble();
		System.out.println("Digite o valor de um terceiro produto: ");
		double p3 = entrada.nextDouble();
		if (p1 < p2 && p1 < p3) {
			System.out.println("O primeiro produto é o mais barato");
		} else if (p2 < p1 && p2 < p3) {
			System.out.println("O segundo produto é o mais barato");
		} else if (p3 < p1 && p3 < p2) {
			System.out.println("O terceiro produto é o mais barato");
		} else {
			System.out.println("Os produtos tem o mesmo valor");
		}
	}

}
