package Prova2;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class ArthurOneda_3 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		double matriz[][] = {
				{ 22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2, 23.0, 24.1, 24.5, 24.0, 24.3, 24.4, 24.0, 24.5, 24.1,
						24.4, 24.8, 24.5, 24.3, 24.7, 24.9, 23.8 },
				{ 21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9, 24.0, 24.6, 25.1, 26.2, 27.5, 28.1, 28.6, 29.2,
						29.5, 28.9, 27.6, 26.4, 25.8, 25.1, 24.0 },
				{ 20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9, 24.2, 24.6, 25.0, 25.3, 25.6, 25.9, 26.2,
						26.5, 26.8, 27.1, 27.4, 27.7, 27.9, 27.8 },
				{ 20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4,
						25.7, 26.0, 26.3, 26.6, 26.9, 27.1, 27.2 },
				{ 19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8,
						25.1, 25.4, 25.7, 26.0, 26.2, 26.3, 26.5 },
				{ 19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 25.5, 26.8, 27.1, 28.4, 28.7, 29.0, 28.3, 28.6, 28.9,
						29.2, 28.5, 28.8, 28.1, 27.3, 27.5, 26.7 },
				{ 19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1, 23.4, 23.7, 24.0, 24.3, 24.6, 24.9,
						25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7 } };
		System.out.println("Digite o dia da semana");
		String dia = info.next();
		double soma = 0;
		if (dia.equals("domingo")) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				soma += matriz[0][coluna];
			}
		} else if (dia.equals("segunda")) {
			for (int coluna = 1; coluna < matriz[1].length; coluna++) {
				soma += matriz[1][coluna];
			}
		} else if (dia.equals("terça")) {
			for (int coluna = 2; coluna < matriz[2].length; coluna++) {
				soma += matriz[2][coluna];
			}
		} else if (dia.equals("quarta")) {
			for (int coluna = 3; coluna < matriz[3].length; coluna++) {
				soma += matriz[3][coluna];
			}
		} else if (dia.equals("quinta")) {
			for (int coluna = 4; coluna < matriz[4].length; coluna++) {
				soma += matriz[4][coluna];
			}
		} else if (dia.equals("sexta")) {
			for (int coluna = 5; coluna < matriz[5].length; coluna++) {
				soma += matriz[5][coluna];
			}
		} else if (dia.equals("sábado")) {
			for (int coluna = 6; coluna < matriz[6].length; coluna++) {
				soma += matriz[6][coluna];
			}
		} else {
			System.out.println("Dia inválido");
		}
		System.out.println("Qual hora você quer comparar");
		int hora = info.nextInt();
		double soma2 = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			soma2 += matriz[linha][hora];
		}
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		double vetAmp[] = new double[7];
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (matriz[linha][coluna] > max) {
					max = matriz[linha][coluna];
				}
				if (matriz[linha][coluna] < min) {
					min = matriz[linha][coluna];
				}
			}
			vetAmp[linha] = max - min;
		}
		int max2 = Integer.MIN_VALUE;
		int cont2 = 0;
		for (; cont2 < vetAmp.length; cont2++) {
			if (vetAmp[cont2] > max2) {
				max2 = cont2;
			}
		}
		String dia2 = "";
		switch (max2) {
		case 0:
			dia2 = "Domingo";
			break;
		case 1:
			dia2 = "Segunda";
			break;
		case 2:
			dia2 = "Terça";
			break;
		case 3:
			dia2 = "Quarta";
			break;
		case 4:
			dia2 = "Quinta";
			break;
		case 5:
			dia2 = "Sexta";
			break;
		case 6:
			dia2 = "Sábado";
			break;
		default:
			break;
		}
		double media = soma / 24;
		double media2 = soma2 / 7;
		System.out.println("Média do dia escolhido: " + formatar.format(media));
		System.out.println("Média da hora escolhida: " + formatar.format(media2));
		System.out.println("Dia com maior amplitude: " + dia2);
	}

}
