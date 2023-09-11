package Aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("0.00");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o número do funcionário?");
		int numF = entrada.nextInt();
		System.out.println("Quantas horas o funcionário " + numF + " trabalhou?");
		double numH = entrada.nextDouble();
		System.out.println("Qual valor o funcionário " + numF + " recebe por hora trabalhada?");
		double salH = entrada.nextDouble();
		double salario = numH * salH;
		System.out.println("Número do funcionário: " + numF);
		System.out.println("Salário: R$" + format.format(salario));
	}
}
