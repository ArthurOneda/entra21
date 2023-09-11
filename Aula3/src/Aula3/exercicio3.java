package Aula3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual turno você estuda: ");
		String turno = entrada.next();
		if (turno.equals("M") || turno.equals("m")) {
			System.out.println("Bom Dia");
		} else if (turno.equals("V") || turno.equals("v")) {
			System.out.println("Boa Tarde");
		} else if (turno.equals("N") || turno.equals("n")) {
			System.out.println("Boa Noite");
		} else {
			System.out.println("Valor Inválido");
		}
	}

}
