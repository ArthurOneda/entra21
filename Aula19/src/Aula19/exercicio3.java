package Aula19;

import java.util.Scanner;

public class exercicio3 {
	public static int area(int alt, int comp) {
		int area = alt * comp;
		return area;
	}
	public static int perm(int alt, int comp) {
		int per = alt + alt + comp + comp;
		return per;
	}
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um lado");
		int num1 = info.nextInt();
		System.out.println("Digite o comprimento");
		int num2 = info.nextInt();
		System.out.println("Área: " + area(num1, num2));
		System.out.println("Perímetro: " + perm(num1, num2));
	}

}
