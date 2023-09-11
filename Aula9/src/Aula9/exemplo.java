package Aula9;

import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int idades[] = new int[7];
		idades[0] = 19;
		idades[1] = 17;
		idades[2] = 16;
		idades[3] = 18;
		idades[4] = 18;
		idades[5] = 17;
		idades[6] = 20;
		System.out.println(idades[6]);
		int soma = idades[0] + idades[1] + idades[2] + idades[3] + idades[4] + idades[5] + idades[6];
		System.out.println(soma);
		double media = soma / 7;
		System.out.println(media);
		for (int i = 0; i < 7; i++) {
			System.out.println(idades[i]);
		}
		String nome[] = new String[24];
		for (int i = 0; i < 24; i++) {
			System.out.println("Sla");
			nome[i] = info.next();
		}
		for (int i = 0; i < 24; i++) {
			System.out.println(nome[i]);
		}
	}

}
