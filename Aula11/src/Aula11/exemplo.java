package Aula11;

public class exemplo {

	public static void main(String[] args) {
		String[][] matriz = new String[3][2];
		matriz [0][0] = "Doritos";
		matriz [0][1] = "3";
		matriz [1][0] = "Chocolate";
		matriz [1][1] = "9";
		matriz [2][0] = "Sushi";
		matriz [2][1] = "7";
		System.out.println(matriz[1][0]);
		System.out.println(matriz[1][1]);
		System.out.println(matriz[2][0]);
		System.out.println(matriz[2][1]);
		
		int matriz2[][] = new int[4][3];
		matriz2[0][0] = 5;
		matriz2[0][1] = 1;
		matriz2[0][2] = 2;
		matriz2[1][0] = 10;
		matriz2[1][1] = 6;
		matriz2[1][2] = 7;
		matriz2[2][0] = 15;
		matriz2[2][1] = 11;
		matriz2[2][2] = 12;
		matriz2[3][0] = 20;
		matriz2[2][1] = 16;
		matriz2[3][2] = 17;
		System.out.println(matriz2[1][1]);
	}

}
