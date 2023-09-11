package Aula7;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		double alt = 1;
		double soma = 0;
		int i = -1;
		while (alt != 0) {
			System.out.println("Digite sua altura");
			alt = info.nextDouble();
			soma += alt;
			i++;
		}
		double calc = soma / i;
		System.out.println("A média das alturas é " + calc);
	}

}
