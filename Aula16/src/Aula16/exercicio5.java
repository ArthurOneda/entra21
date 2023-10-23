package Aula16;

import java.util.Scanner;

public class exercicio5 {
	public static void ret(int alt, int larg) {
		int per = alt + alt + larg + larg;
		int area = alt * larg;
		System.out.println("Perímetro: " + per + "\nÁrea: " + area);
	}
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite a altura");
		int alt = info.nextInt();
		System.out.println("Digite a largura");
		int larg = info.nextInt();
		ret(alt, larg);
	}

}
