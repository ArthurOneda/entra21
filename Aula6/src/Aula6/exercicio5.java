package Aula6;

import java.util.Iterator;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor inteiro de 1 a 10");
		int num = scan.nextInt();
		if (num >= 1 && num <= 10) {
			for (int i = 1; i <= 10; i++) {
				int calc = num * i;
				System.out.println(calc);
			}
		} else {
			System.out.println("Valor inválido");
		}
	}

}
