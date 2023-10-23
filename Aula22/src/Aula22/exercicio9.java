package Aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o comprimento da lista");
		int tam = info.nextInt();
		for (int i = 0; i < tam; i++) {
			lista.add(i);
		}
		System.out.println(lista);
		if (lista.size() % 2 == 0) {
			lista.remove(lista.size() / 2 + 1);
			System.out.println(lista);
		} else {
			lista.remove(lista.size() / 2);
			System.out.println(lista);
		}
		
	}

}
