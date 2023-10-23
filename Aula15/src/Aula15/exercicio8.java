package Aula15;

import java.text.DecimalFormat;

public class exercicio8 {

	public static void main(String[] args) {
		DecimalFormat formatar = new DecimalFormat("0.00");
		double chico = 1.50;
		double ze = 1.10;
		int cont = 0;
		do {
			cont++;
			chico += 0.02;
			ze += 0.03;
		} while (ze <= chico);
		System.out.println("Em " + cont + " anos Zé terá " + formatar.format(ze) + "m e o Chico terá " + formatar.format(chico) + "m");
	}

}
