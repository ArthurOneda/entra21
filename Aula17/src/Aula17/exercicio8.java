package Aula17;

import java.util.Scanner;

public class exercicio8 {
	public static void generateStarWarsName(String pNome, String pSobrenome, String nomeSolt, String nomeCid) {
		String vet[] = new String[10];
		vet[0] = pSobrenome.charAt(0) + "";
		vet[1] = pSobrenome.charAt(1) + "";
		vet[2] = pSobrenome.charAt(2) + "";
		vet[3] = pNome.charAt(0) + "";
		vet[4] = pNome.charAt(1) + "";
		vet[5] = nomeSolt.charAt(0) + "";
		vet[6] = nomeSolt.charAt(1) + "";
		vet[7] = nomeCid.charAt(0) + "";
		vet[8] = nomeCid.charAt(1) + "";
		vet[9] = nomeCid.charAt(2) + "";
		System.out.println((vet[0] + vet[1] + vet[2] + vet[3] + vet[4]) + " " + (vet[5] + vet[6] + vet[7] + vet[8] + vet[9]));
	}
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite seu primeiro nome");
		String pNome = info.next();
		System.out.println("Digite seu sobrenome");
		String pSobrenome = info.next();
		System.out.println("Digite o sobrenome de solteira da sua mãe");
		String nomeSolt = info.next();
		System.out.println("Digite a cidade que você nasceu");
		String nomeCid = info.next();
		generateStarWarsName(pNome, pSobrenome, nomeSolt, nomeCid);
	}

}
