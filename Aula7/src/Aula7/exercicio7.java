package Aula7;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Deseja começar?");
		char op = info.next().charAt(0);
		int numG = Integer.MIN_VALUE;
		int numP = Integer.MAX_VALUE;
		while (op == 's') {
			System.out.println("Digite um número");
			int num = info.nextInt();
			if (num > numG) {
				numG = num;
			}
			if (num < numP) {
				numP = num;
			}
			System.out.println("Deseja continuar?");
			op = info.next().charAt(0);
			while (op != 's' && op != 'n') {
				System.out.println("Inválido");
				System.out.println("Digite novamente");
				op = info.next().charAt(0);
			}
		}
		System.out.println(numG + " é o maior numero");
		System.out.println(numP + " é o menor numero");
	}

}
