package Aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		List<Double> lista = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número");
			lista.add(info.nextDouble());
		}
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 2 == 0) {
				double calcPar = lista.get(i) * 1.02;
				lista.set(i, calcPar);
			} else {
				double calcImpar = lista.get(i) * 1.05;
				lista.set(i, calcImpar);
			}
		}
		System.out.println(lista);
	}

}
