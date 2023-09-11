package Aula7;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número igual ou menor que 1");
		int num = info.nextInt();
		while (num > 1) {
			System.out.println("Digite novamente");
			num = info.nextInt();
		}
		System.out.println("Sucesso");
	}

}
