package Aula4;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual é a idade do Marquinhos? ");
		int idM = entrada.nextInt();
		System.out.println("Qual é a idade do Zezinho? ");
		int idZ = entrada.nextInt();
		System.out.println("Qual é a idade da Luluzinha? ");
		int idL = entrada.nextInt();
		String velho;
		String meio;
		String novo;
		if (idM > idZ && idZ > idL) {
			velho = "Marquinhos";
			meio = "Zezinho";
			novo = "Luluzinha";
		} else if (idZ > idM && idM > idL) {
			velho = "Zezinho";
			meio = "Marquinhos";
			novo = "Luluzinha";
		} else if (idL > idM && idM > idZ) {
			velho = "Luluzinha";
			meio = "Marquinhos";
			novo = "Zezinho";
		} else if (idM > idL && idL > idZ) {
			velho = "Marquinhos";
			meio = "Luluzinha";
			novo = "Zezinho";
		} else if (idZ > idL && idL > idM) {
			velho = "Zezinho";
			meio = "Luluzinha";
			novo = "Marquinhos";
		} else {
			velho = "Luluzinha";
			meio = "Zezinho";
			novo = "Marquinhos";
		}
		System.out.println(velho + " é o irmão mais velho\n" + meio + " é o irmão do meio\n" + novo + " é o caçula");
	}

}
