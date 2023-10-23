package Aula17;

import java.util.Scanner;

public class exercicioRevisao {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int somaH = 0;
		int mNova = Integer.MAX_VALUE;
		int mNovaNota;
		int contH = 0;
		int mVelha = 50;
		int mVelhaNota;
		int matriz[][] = new int[30][3];
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (coluna == 0) {
					System.out.println("Digite seu sexo:\n1-Feminino\n2-Masculino");
					int sexo = info.nextInt();
				} else if (coluna == 1) {
					System.out.println("Digite a nota de 0 a 10");
					int nota = info.nextInt();
					if (matriz[linha][0] == 2) {
						contH++;
						somaH += matriz[linha][1];
					}
				} else {
					System.out.println("Digite sua idade");
					int idd = info.nextInt();
					if (idd < mNova) {
						mNova = idd;
						mNovaNota = matriz[linha][1];
					}
				}
			}
		}
	}

}
