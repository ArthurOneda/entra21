package Aula16;

import java.util.Scanner;

public class exercicio1 {

	public static void op(int op) {
		switch (op) {
		case 1:
			System.out.println("É verão\nEstá quente");
			break;
		case 2:
			System.out.println("É outono\nEstá esfriando");
			break;
		case 3:
			System.out.println("É inverno\nEstá frio");
			break;
		case 4:
			System.out.println("É primavera\nEstá esquentando");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite a opção");
		int op = info.nextInt();
		op(op);
	}

}
