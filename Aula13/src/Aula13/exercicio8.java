package Aula13;

import java.util.Iterator;
import java.util.Random;

public class exercicio8 {

	public static void main(String[] args) {
		int matriz[][] = new int[4][4];
		int cont = 1;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = cont;
				cont++;
			}
		}
		int soma1 = 0;
		int prod1 = 1;
		int soma2 = 0;
		int prod2 = 1;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (coluna == 0) {
					soma1 += matriz[linha][coluna];
				}
				if (linha == 0) {
					prod1 = prod1 *  matriz[linha][coluna];
				}
				soma2 += matriz[linha][coluna];
				if (coluna == linha) {
					prod2 = prod2 * matriz[linha][coluna];
				}
			}
		}
		System.out.println("Soma da primeira coluna: " + soma1);
		System.out.println("Produto da primeira coluna: " + prod1);
		System.out.println("Soma de todos os valores: " + soma2);
		System.out.println("Produto da diagonal pricipal: " + prod2);
	}

}
