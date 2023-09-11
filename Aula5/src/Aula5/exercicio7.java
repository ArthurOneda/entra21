package Aula5;

import java.util.Iterator;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			int num = entrada.nextInt();
			if (num % 2 == 1) {
				System.out.println(num + " é impar"); 
			} else {
				System.out.println(num + " é par");
			}
		}
	}

}
