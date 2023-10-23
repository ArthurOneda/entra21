package Aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Scanner info = new Scanner(System.in);
		for (int i = 1; i <= 20; i++) {
			lista.add(i);
		}
		System.out.println("Digite um número");
		int num = info.nextInt();
		if (lista.contains(num)) {
			int ind = lista.indexOf(num);
			System.out.println(num + " está na lista no índice " + ind);
		} else {
			System.out.println(num + " não está na lista");
		}
	}

}
