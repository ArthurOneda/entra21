package Aula1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual é a minha altura?");
		final double altura1 = entrada.nextDouble();
		System.out.println("Qual é a 2º altura?");
		final double altura2 = entrada.nextDouble();
		double media = (altura1 + altura2) / 2;
		System.out.println(media);
	}
}
