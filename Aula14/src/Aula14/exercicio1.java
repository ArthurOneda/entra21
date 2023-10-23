package Aula14;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite sua altura em cm");
		double alt = info.nextDouble();
		System.out.println("Digite seu peso");
		double peso = info.nextDouble();
		double imc =  peso / (alt * alt);
		if (imc < 18.5) {
			System.out.println("Magreza");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Saudável");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepezo");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade Grau II(severa)");
		} else {
			System.out.println("Obesidade Grau III(severa)");
		}
	}

}
