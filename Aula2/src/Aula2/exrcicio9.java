package Aula2;

import java.util.Scanner;

public class exrcicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valo de A");
		final double a = entrada.nextDouble();
		System.out.println("Digite o valo de B");
		final double b = entrada.nextDouble();
		System.out.println("Digite o valo de C");
		final double c = entrada.nextDouble();
		final double pi = 3.14;
		double areaTri = (a * c) / 2;
		double areaCir = (c * c) / pi;
		double areaTra = ((a + b) * c) / 2;
		double areaQua = b * b;
		double areaRet = a * b;
		System.out.println("A área do triângulo é " + areaTri);
		System.out.println("A área da circunferência é " + areaCir);
		System.out.println("A área do trapézio é " + areaTra);
		System.out.println("A área do quadrado é " + areaQua);
		System.out.println("A área do retângulo é " + areaRet);
	}

}
