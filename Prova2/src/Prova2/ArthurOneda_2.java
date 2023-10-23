package Prova2;

import java.util.Scanner;

public class ArthurOneda_2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int vet[] = new int[11];
		for (int i = 0; i < 11; i++) {
			System.out.println("Digite um valor");
			vet[i] = info.nextInt();
		}
		int possivelInicio = 0;
		int inicioSequencia = 0;
		int tamanhoSequencia = 1;
		int tamanhoFinal = 1;
		for (int i = 1; i < vet.length; i++) {
			if (vet[i] - 1 == vet[i - 1]) {
				tamanhoSequencia++;
			} else {
				tamanhoSequencia = 1;
				possivelInicio = i;
			}
			if (tamanhoSequencia > tamanhoFinal) {
				tamanhoFinal = tamanhoSequencia;
				inicioSequencia = possivelInicio;
			}
		}
		for (int i = 0; i < tamanhoFinal; i++) {
			System.out.println(vet[inicioSequencia + i]);
		}
	}

}
