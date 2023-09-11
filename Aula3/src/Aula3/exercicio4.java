package Aula3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a letra do seu sexo");
		String letra = entrada.next();
		if (letra.equals("M")) {
			System.out.println("Sexo Masculino");
		} else if (letra.equals("F")) {
			System.out.println("Sexo Feminino");
		} else {
			System.out.println("Esse sexo NÃO EXISTE e NÃO INSISTA");
		}
	}

}
