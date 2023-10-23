package Aula13;

import java.util.Random;

public class exercicio10 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int matriz[][] = new int[3][5];
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = gerador.nextInt(10);
			}
		}
		int cont0 = 0;
		int contI = 0;
		int contP = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (matriz[linha][coluna] == 0) {
					cont0++;
				}
				if (matriz[linha][coluna] % 2 == 0) {
					contP++;
				} else {
					contI++;
				}
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
		System.out.println("A matriz tem o número 0 presente " + cont0 + " vezes");
		System.out.println("A matriz tem " + contI + " números impares");
		System.out.println("A matriz tem " + contP + " números pares");
	}

}
