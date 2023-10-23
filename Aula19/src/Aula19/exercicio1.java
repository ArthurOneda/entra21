package Aula19;

import java.util.Scanner;

public class exercicio1 {
	public static String cond(int limite, int minimo, int num) {
		String resp = "";
		if (num < limite && num > minimo) {
			resp = num + " está nos limites impostos";
		} else {
			resp = num + " está fora dos limites impostos";
		}
		return resp;
	}
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int lMax = info.nextInt();
		System.out.println("Digite um número");
		int lMin = info.nextInt();
		System.out.println("Digite outro número");
		int num = info.nextInt();
		System.out.println(cond(lMax, lMin, num));
	}

}
