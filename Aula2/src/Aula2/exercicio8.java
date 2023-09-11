package Aula2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		System.out.println("Quantos dólares foram pagos?");
		double dol = entrada.nextDouble();
		double real = dol * 4.97;
		System.out.println("A pessoa recebeu " + formatar.format(real) + " reais");
	}

}
