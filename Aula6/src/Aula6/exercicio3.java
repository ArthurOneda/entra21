package Aula6;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 1 para masculino e 2 para feminino");
		int g1 = scan.nextInt();
		System.out.println("Digite 1 para masculino e 2 para feminino novamente");
		int g2 = scan.nextInt();
		System.out.println("Digite 1 para masculino e 2 para feminino novamente");
		int g3 = scan.nextInt();
		System.out.println("Digite 1 para masculino e 2 para feminino novamente");
		int g4 = scan.nextInt();
		int h = 0;
		int m = 0;
		if (g1 == 1) {
			h++;
		} else {
			m++;
		}
		if (g2 == 1) {
			h++;
		} else {
			m++;
		}
		if (g3 == 1) {
			h++;
		} else {
			m++;
		}
		if (g4 == 1) {
			h++;
		} else {
			m++;
		}
		System.out.println("Masculino: " + h);
		System.out.println("Feminino: " + m);
	}

}
