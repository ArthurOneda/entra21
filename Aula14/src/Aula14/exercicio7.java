package Aula14;

public class exercicio7 {

	public static void main(String[] args) {
		int matriz[][] = {
			{2104, 3, 399900},
			{1600, 3, 329900},
			{2400, 3, 369000},
			{1416, 2 ,232000},
			{3000, 4, 539900},
			{1985, 4, 299900},
			{1534, 3, 314900},
			{1427, 3, 199000},
			{1380, 3, 212000},
			{1494, 3, 242500},
			{1940, 4, 240000},
			{2000, 3, 347000},
			{1890, 3, 330000},
			{4478, 5, 699900},
			{1268, 3, 259900}
		};
		int soma = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max2 = Integer.MIN_VALUE;
		int minT = 0;
		int maxT = 0;
		int maxQ = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			soma += matriz[linha][2];
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (coluna == 1 && matriz[linha][1] < min) {
					min = matriz[linha][1];
					minT = matriz[linha][0];
				}
				if (coluna == 1 && matriz[linha][1] > max) {
					max = matriz[linha][1];
					maxT = matriz[linha][0];
				}
				if (coluna == 2 && matriz[linha][coluna] < min2) {
					min2 = matriz[linha][coluna];
				}
				if (coluna == 2 && matriz[linha][coluna] > max2) {
					maxQ = matriz[linha][1];
					max2 = matriz[linha][coluna]; 
				}
			}
		}
		double calc = soma / 15;
		int calc2 = maxT - minT;
		System.out.println("Média: " + calc);
		System.out.println("Casa mais barata: " + min2 + "\nQuartos casa mais cara: " + maxQ);
		System.out.println("Diferença do tamanho das casas: " + calc2);
	}

}
