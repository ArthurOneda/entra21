package Aula4;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a idade do 1º homem: ");
		int iddH1 = entrada.nextInt();
		System.out.println("Digite a idade do 2º homem: ");
		int iddH2 = entrada.nextInt();
		System.out.println("Digite a idade da 1ª mulher: ");
		int iddM1 = entrada.nextInt();
		System.out.println("Digite a idade da 2ª mulher: ");
		int iddM2 = entrada.nextInt();
		if (iddH1 > iddH2 && iddM1 > iddM2) {
			int calc1 = iddH1 + iddM1;
			int calc2 = iddH2 * iddM2;
			System.out.println(iddH1 + " + " + iddM1 + " = " + calc1);
			System.out.println(iddH2 + " * " + iddM2 + " = " + calc2);
		} else if (iddH2 > iddH1 && iddM2 > iddM1) {
			int calc1 = iddH2 + iddM2;
			int calc2 = iddH1 * iddM1;
			System.out.println(iddH2 + " + " + iddM2 + " = " + calc1);
			System.out.println(iddH1 + " * " + iddM1 + " = " + calc2);
		} else if (iddH2 > iddH1 && iddM1 > iddM2) {
			int calc1 = iddH2 + iddM1;
			int calc2 = iddH1 * iddM2;
			System.out.println(iddH2 + " + " + iddM1 + " = " + calc1);
			System.out.println(iddH1 + " * " + iddM2 + " = " + calc2);
		} else if (iddH1 > iddH2 && iddM2 > iddM1) {
			int calc1 = iddH1 + iddM2;
			int calc2 = iddH2 * iddM1;
			System.out.println(iddH1 + " + " + iddM2 + " = " + calc1);
			System.out.println(iddH2 + " * " + iddM1 + " = " + calc2);
		}
	}

}
