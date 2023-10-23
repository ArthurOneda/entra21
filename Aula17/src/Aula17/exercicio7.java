package Aula17;

import java.util.Scanner;

public class exercicio7 {
	public static void palavra(String palavra) {
		if (palavra.length() % 2 == 0) {
			char l1 = palavra.charAt(0);
			System.out.println(l1);
		} else {
			char l2 = palavra.charAt(1);
			System.out.println(l2);
		}
	}
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = info.next();
		palavra(palavra);
	}

}
