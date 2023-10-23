package Aula14;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num = 1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int cont = 0;
		int soma = 0;
		while (num != 0) {
			System.out.println("Digite um número");
			num = info.nextInt();
			if (num > max && num != 0) {
				max = num;
			}
			if (num < min && num != 0) {
				min = num;
			}
			soma += num;
			cont++;
		}
		cont -= 1;
		double med = soma / cont;
		System.out.println("Maior número: " + max);
		System.out.println("Menor número: " + min);
		System.out.println("Média: " + med);
	}

}
