package Aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Scanner info = new Scanner(System.in);
		for (int i = 1; i <= 20; i++) {
			lista.add(i);
		}
		System.out.println("Digite o indice desejado");
		int ind = info.nextInt();
		System.out.println("Digite o número desejado");
		int num = info.nextInt();
		lista.add(ind, num);
		System.out.println(lista);
	}

}
