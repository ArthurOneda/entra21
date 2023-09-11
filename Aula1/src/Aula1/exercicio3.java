package Aula1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o 1º valor");
		double notaA = entrada.nextDouble();
		System.out.println("Digite o 2º valor");
		double notaB = entrada.nextDouble();
		double media = (notaA * 6.5 + notaB * 3.5) / 10;
		System.out.println(media);
	}
}
