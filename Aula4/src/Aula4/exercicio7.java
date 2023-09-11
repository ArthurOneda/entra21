package Aula4;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número da 1º carta");
		int carta1 = entrada.nextInt();
		System.out.println("Digite o número da 2º carta");
		int carta2 = entrada.nextInt();
		System.out.println("Digite o número da 3º carta");
		int carta3 = entrada.nextInt();
		if ((carta1 < 4) && (carta2 < 4) && (carta3 < 4)) {
			System.out.println("Nove");
		} else if (((carta1 < 4) && (carta2 < 4)) || ((carta2 < 4) && (carta3 < 4)) || ((carta1 < 4) && (carta3 < 4))) {
			System.out.println("Seis");
		} else if ((carta1 < 4) || (carta2 < 4) || (carta3 < 4)) {
			System.out.println("Truco");
		}
	}

}
