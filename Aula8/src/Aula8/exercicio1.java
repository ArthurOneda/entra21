package Aula8;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		char sn = 's';
		while (sn != 'n') {
			System.out.println("Digite um número");
			double num1 = info.nextDouble();
			System.out.println("Digite outro número");
			double num2 = info.nextDouble();
			System.out.println("Digite a operação desejada\n1 - Adição\n2 -Subtração\n3 - Multiplicação\n4 - Divisão");
			int op = info.nextInt();
			double calc = 0;
			switch (op) {
			case 1:
				calc = num1 + num2;
				System.out.println("Resultado: " + calc);
				break;
			case 2:
				calc = num1 - num2;
				System.out.println("Resultado: " + calc);
				break;
			case 3:
				calc = num1 * num2;
				System.out.println("Resultado: " + calc);
				break;
			case 4:
				calc = num1 / num2;
				System.out.println("Resultado: " + calc);
			default:
				break;
			}
			System.out.println("Deseja fazer novamente?");
			sn = info.next().charAt(0);
		}
	}

}
