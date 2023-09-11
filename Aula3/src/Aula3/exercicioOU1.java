package Aula3;

import java.util.Scanner;

public class exercicioOU1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = entrada.next();
		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
			System.out.println("Essa letra é uma vogal");
		} else {
			System.out.println("Essa letra é uma consoante");
		}
	}

}
