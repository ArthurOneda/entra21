package Aula13;

public class desafio {

	public static void main(String[] args) {
		char matriz[][] = new char [4][4];
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = '*';
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println();
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if ((linha == 1 || linha == 2) && (coluna == 1 || coluna == 2)) {
					matriz[linha][coluna] = ' ';
				} else {
					matriz[linha][coluna] = '*';
				}
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println();
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (coluna > linha) {
					matriz[linha][coluna] = ' ';
				} else {
					matriz[linha][coluna] = '*';
				}
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println("");
		}
	}

}
