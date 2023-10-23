package Aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		List<Double> lista = new ArrayList<>();
		Scanner info = new Scanner(System.in);
		double soma = 0;
		int i = 0;
		lista.add(1.0);
		while (lista.get(i) != 0) {
			i++;
			System.out.println("Digite um número");
			lista.add(info.nextDouble());
			soma += lista.get(i);
		}
		lista.remove(0);
		int maxInd = lista.size() - 2;
		double media = soma / (i - 1);
		lista.sort(null);
		lista.remove(0);
		System.out.println(lista.get(0));
		System.out.println(lista.get(maxInd));
		System.out.println(media);
	}

}
