package Aula12;

public class exercicio1 {

	public static void main(String[] args) {
		int matriz[][] = new int[1][10];
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		matriz[0][4] = 5;
		matriz[0][5] = 6;
		matriz[0][6] = 7;
		matriz[0][7] = 8;
		matriz[0][8] = 9;
		matriz[0][9] = 10;
		int contI = 0;
		int contP = 0;
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			if (matriz[0][coluna] % 2 == 0) {
				contP++;
			} else {
				contI++;
			}
		}
		double calc = (contI + contP) / 2;
		System.out.println(calc);
	}

}
