package Prova;

import java.util.Scanner;

public class ArthurOneda_3 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		double soma = 0;
		double altura;
		int c = 0;
		for (int i = 1; i <= 10; i++) {
			c++;
			System.out.println("Digite a " + c + "º altura");
			altura = info.nextDouble();
			soma = soma + altura;
		}
		double media = soma / c;
		System.out.println("A média das altura é " + media);
	}

}
