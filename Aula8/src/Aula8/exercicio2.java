package Aula8;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		String user = "0";
		String senha = "0";
		while (user.equals(senha)) {
			System.out.println("Digite seu usuário:");
			user = info.next();
			System.out.println("Digite sua senha:");
			senha = info.next();
			if (user.equals(senha)) {
				System.err.println("O usuário e a senha não podem ser iguais");
			} else {
				System.out.println("Parabéns");
			}
		}
	}

}
