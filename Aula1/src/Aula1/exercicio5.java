package Aula1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual é o valor de A?");
		int vA = entrada.nextInt();
		System.out.println("Qual é o valor de B?");
		int vB = entrada.nextInt();
		System.out.println("Qual é o valor de C?");
		int vC = entrada.nextInt();
		System.out.println("Qual é o valor de D?");
		int vD = entrada.nextInt();
		int AxB = vA * vB;
		int CxD = vC * vD;
		int subP = AxB - CxD;
		System.out.println(vA + " x " + vB + " = " + AxB);
		System.out.println(vC + " x " + vD + " = " + CxD);
		if (subP < 0) {
			subP = subP * -1;
			System.out.println("A diferença dos produtos é " + subP);
		} else if (subP == 0) {
			System.out.println("Não existe diferença entre o valor dos produtos");
		} else {
			subP = subP;
			System.out.println("A diferença dos produtos é " + subP);
		}
	}
}
