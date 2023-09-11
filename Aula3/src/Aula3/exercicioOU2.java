package Aula3;

import java.util.Scanner;

public class exercicioOU2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		if ((idade > 0 && idade < 18) || (idade > 67 && idade <= 110)) {
			System.out.println("Você não pode doar sangue");
		} else if (idade >= 18 && idade <= 67) {
			System.out.println("Você pode doar sangue");
		} else {
			System.out.println("Idade inválida");
		}
	}

}
