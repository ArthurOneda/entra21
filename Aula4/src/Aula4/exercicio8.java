package Aula4;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o 1º número: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o 2º número: ");
		int num2 = entrada.nextInt();
		System.out.println("Digite o número da operação desejada: \n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
		int numOp = entrada.nextInt();
		double calc = 0;
		switch (numOp) {
		case 1:
			calc = num1 + num2;
			break;
		case 2:
			calc = num1 - num2;
			break;
		case 3:
			calc = num1 * num2;
			break;
		case 4:
			calc = num1 / num2;
			break;
		default:
			System.out.println("Valor inválido");
			break;
		}
		System.out.println("O resultado é " + calc);
	}
}
