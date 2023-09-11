package Aula9;

import java.util.Scanner;

public class exrcicio_Vet1 {

	public static void main(String[] args) {
		int num[] = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = i;
			int quad = num[i] * num[i];
			System.out.println("[" + i + "]" + " = " + quad);
		}
	}

}
