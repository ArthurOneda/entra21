package Prova2;

import java.util.Scanner;

public class ArthurOneda_1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num[] = new int[6];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite um número");
			num[i] = info.nextInt();
		}
		String result = "";
		for (int i = 0; i < num.length; i++) {
			int maiorV = Integer.MIN_VALUE;
			int max = 0;
			for (int j = 0; j < num.length; j++) {
				if (num[j] > maiorV) {
					maiorV = num[j];
					max = j;
				}
			}
			result += maiorV + " ";
			num[max] = -1;
		}
		System.out.println(result);
	}

}
