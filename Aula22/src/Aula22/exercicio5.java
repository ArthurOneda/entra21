package Aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Scanner info = new Scanner(System.in);
		for (int i = 1; i <= 20; i++) {
			lista.add(i);
		}
		System.out.println("Digite o indice desejado");
		lista.set(info.nextInt(), 0);
		System.out.println(lista);
	}

}
