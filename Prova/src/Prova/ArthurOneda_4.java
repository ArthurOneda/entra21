package Prova;

import java.util.Iterator;
import java.util.Scanner;

public class ArthurOneda_4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int op = 1;
		int contV = 0;
		int contI = 0;
		double nt1;
		double nt2;
		double nt3;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while (op != 0) {
			System.out.println("O que você deseja fazer?\n1 - Calcular a média\n2 - Exibir nome e email\n3 - Valor maior e menor\n0 - Encerrar");
			op = info.nextInt();
			switch (op) {
			case 1:
				System.out.println("Digite sua 1º nota");
				nt1 = info.nextDouble();
				System.out.println("Digite sua 2º nota");
				nt2 = info.nextDouble();
				System.out.println("Digite sua 3º nota");
				nt3 = info.nextDouble();
				double media = (nt1 + nt2 + nt3) / 3;
				System.out.println("A média é " + media);
				contV++;
				break;
			case 2:
				System.out.println("Nome: Arthur Valentim Oneda\nEmail: arthur.v.oneda07@gmail.com");
				contV++;
				break;
			case 3:
				for (int i = 1; i <= 5; i++) {
					System.out.println("Digite o " + i + "º valor");
					int num = info.nextInt();
					if (num > max) {
						max = num;
					}
					if (num < min) {
						min = num;
					}
				}
				System.out.println(max + " é o maior valor");
				System.out.println(min + " é o menor valor");
				contV++;
				break;
			case 0:
				contV++;
				break;
			default:
				System.out.println("Opção inválida");
				contI++;
				break;
			}
		}
		System.out.println(contI);
		System.out.println(contV);
		
	}

}
