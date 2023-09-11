package Prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArthurOneda_1 {

	public static void main(String[] args) {
		DecimalFormat formatar = new DecimalFormat("0.00");
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o valor a ser convertido");
		double val = info.nextDouble();
		System.out.println("O que você deseja fazer:\n1 - Dolar para real\n2 - Real para dolar");
		int op = info.nextInt();
		double dol = 4.97;
		double calc;
		switch (op) {
		case 1:
			calc = val * dol;
			System.out.println(val + " dolares equivalem a " + formatar.format(calc) + " reais");
			break;
		case 2:
			calc = val / dol;
			System.out.println(val + " reais equivalem a " + formatar.format(calc) + " dolares");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}

}
