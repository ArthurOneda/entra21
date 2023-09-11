package Aula5;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		double num = entrada.nextDouble();
		System.out.println("Selecione a opção desejada:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
		int op = entrada.nextInt();
		switch (op) {
		case 1:
			num = num + 10;
			break;
		case 2:
			num = num - 10;
			break;
		case 3:
			num = num * 10;
			break;
		case 4:
			num = num / 10;
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		System.out.println("O resultado é " + num);
	}

}
