package Aula12;

public class exercicio1_2 {

	public static void main(String[] args) {
		int matriz[][] = new int[2][10];
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
		matriz[1][0] = 11;
		matriz[1][1] = 12;
		matriz[1][2] = 13;
		matriz[1][3] = 14;
		matriz[1][4] = 15;
		matriz[1][5] = 16;
		matriz[1][6] = 17;
		matriz[1][7] = 18;
		matriz[1][8] = 19;
		matriz[1][9] = 20;
		int contI = 0;
		int contP = 0;
		int soma1 = 0;
		int soma2 = 0;
		for (int lon = 0; lon < matriz[0].length; lon++) {
			if (matriz[0][lon] % 2 == 0) {
				contP++;
			} else {
				contI++;
			}
			soma1 += matriz[0][lon];
		}
		for (int lon = 0; lon < matriz[1].length; lon++) {
			soma2 += matriz[1][lon];
			if (matriz[1][lon] % 2 == 0) {
				contP++;
			} else {
				contI++;
			}
		}
		double calc = (contI + contP) / 2;
		int calc2 = soma1 + soma2;
		System.out.println("Soma da primeira coluna: " + soma1);
		System.out.println("Soma da segunda coluna: " + soma2);
		System.out.println("Soma das colunas: " + calc2);
		System.out.println(calc);
	}

}
