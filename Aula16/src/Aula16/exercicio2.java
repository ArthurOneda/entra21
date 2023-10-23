package Aula16;

import java.util.Scanner;

public class exercicio2 {

	public static void dados(String nome, int idd) {
		System.out.println("O nome dele é " + nome);
		System.out.println("Ele tem " + idd + " anos");
		System.out.println("Ele é estudante do Entra 21\n");
	}
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantas pessoas você quer informar?");
		int cont = info.nextInt();
		for (int i = 0; i < cont; i++) {
			System.out.println("Digite um nome");
			String nome = info.next();
			System.out.println("Digite a idade");
			int idd = info.nextInt();
			dados(nome, idd);
		}
	}

}
