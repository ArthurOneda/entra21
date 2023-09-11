package Aula3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua nota: ");
		double nota = entrada.nextDouble();
		System.out.println("Digite sua presença: ");
		int freq = entrada.nextInt();
		if (nota == 10 && freq == 100) {
			System.out.println("Você foi aprovado com distinção");
		} else if (nota >= 7 && nota < 10 && freq >= 75 && freq <= 75) {
			System.out.println("Você foi aprovado");
		} else if ((nota < 7 && nota >= 0) || freq < 75) {
			System.out.println("Você foi reprovado");
		} else {
			System.out.println("Impossivel");
		}
	}

}
