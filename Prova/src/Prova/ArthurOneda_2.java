package Prova;

import java.util.Scanner;

public class ArthurOneda_2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o valor do 1º lado do triângulo");
		int lado1 = info.nextInt();
		System.out.println("Digite o valor do 2º lado do triângulo");
		int lado2 = info.nextInt();
		System.out.println("Digite o valor do 3º lado do triângulo");
		int lado3 = info.nextInt();
		if (lado1 == lado2 && lado2 ==  lado3) {
			System.out.println("Esse triângulo é equilátero");
		} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
			System.out.println("Esse triângulo é isóscele");
		} else {
			System.out.println("Esse triângulo é escaleno");
		}
	}
	
}
