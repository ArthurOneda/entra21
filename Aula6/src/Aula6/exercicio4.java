package Aula6;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		double nota = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite uma nota");
			double temp = info.nextDouble();
			nota = nota + temp;
		}
		double media = nota / 3;
		System.out.println(media);
	}

}
