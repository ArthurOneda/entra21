package Aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Scanner info = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o comprimento da lista");
			int num = info.nextInt();
			lista.add(num);
		}
	}

}
