package Aula12;

import java.util.Random;

public class matriz {

	public static void main(String[] args) {
		char matriz[][] = new char [3][3];
		matriz[0][0] = 'A';
		matriz[0][1] = 'B';
		matriz[0][2] = 'C';
		matriz[1][0] = 'D';
		matriz[1][1] = 'E';
		matriz[1][2] = 'F';
		matriz[2][0] = 'G';
		matriz[2][1] = 'H';
		matriz[2][2] = 'I';
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
		
	}

}
