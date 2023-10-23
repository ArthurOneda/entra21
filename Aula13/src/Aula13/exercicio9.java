package Aula13;

import java.util.Random;

public class exercicio9 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int matriz[][] = new int[7][8];
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = gerador.nextInt(10);
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
	}

}
