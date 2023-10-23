package Aula13;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite quantas colunas");
		int numC = info.nextInt();
		System.out.println("Digite quantas linhas");
		int numL = info.nextInt();
		int calc = numC * numL;
		System.out.println("Uma matriz " + numL + " x " + numC + " tem " + calc + " elementos");
	}

}
