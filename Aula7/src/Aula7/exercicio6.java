package Aula7;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o nome de uma fruta");
		String fruta = info.next();
		int aux = 0;
		while (aux != 1) {
			switch (fruta) {
			case "banana":
				System.out.println("Eu gosto de banana");
				System.out.println("Digite o nome de uma fruta");
				fruta = info.next();
				break;
			case "pera":
				System.out.println("Eu gosto de pera");
				System.out.println("Digite o nome de uma fruta");
				fruta = info.next();
				break;
			case "maçã":
				System.out.println("Eu gosto de maçã");
				System.out.println("Digite o nome de uma fruta");
				fruta = info.next();
				break;
			case "melancia":
				System.out.println("Eu gosto de melancia");
				System.out.println("Digite o nome de uma fruta");
				fruta = info.next();
				break;
			default:
				System.out.println("Não conheço essa fruta");
				aux = 1;
				break;
			}
		}
	}

}
