package Aula10;

import java.util.Iterator;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		float num[] = new float[12];
		float soma = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite um valor");
			num[i] = info.nextFloat();
			soma += num[i];
		}
		float calc = soma / 12;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > calc) {
				System.out.println(num[i]);
			}
		}
	}

}
