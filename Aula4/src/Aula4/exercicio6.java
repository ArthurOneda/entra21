package Aula4;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o ano de nascimento do 1º filho");
		int id1 = entrada.nextInt();
		System.out.println("Digite o ano de nascimento do 2º filho");
		int id2 = entrada.nextInt();
		System.out.println("Digite o ano de nascimento do 3º filho");
		int id3 = entrada.nextInt();
		if (id1 == id2 && id1 == id3) {
			System.out.println("Os filhos são trigêmeos");
		} else if (id1 == id2 || id1 == id3 || id2 == id3) {
			System.out.println("Tem 2 filhos gêmeos");
		} else {
			System.out.println("Nenhum dos filhos são gêmeos");
		}
	}

}
