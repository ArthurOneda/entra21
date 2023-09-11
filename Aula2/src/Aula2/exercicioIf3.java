package Aula2;

import java.util.Scanner;

public class exercicioIf3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o nome correto do usuário");
		String nome = entrada.next();
		if (nome.equals("Arthur")) {
			System.out.println("Nome correto");
		} else {
			System.out.println("Nome incorreto");
		}
	}
}
