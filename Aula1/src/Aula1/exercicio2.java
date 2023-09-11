package Aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		DecimalFormat formatar = new DecimalFormat("0.00");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual é o raio da circunferência?");
		final double pi = 3.14;
		double raio = entrada.nextDouble();
		double area = (raio * raio) * pi;
		System.out.println(formatar.format(area));
	}

}
