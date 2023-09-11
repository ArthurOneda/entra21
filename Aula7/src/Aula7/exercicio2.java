package Aula7;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = info.nextInt();
		int soma = 0;
		while (num != 0) {
			soma += num;
			System.out.println("Digite novamente");
			num = info.nextInt();
		}
		System.out.println("Sucesso e a soma dos valores errados é " + soma);
	}

}
