package Aula21;

import java.util.Iterator;

public class exercicio8 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Arthur", "12345678", "SC", 40000);
		Pessoa p2 = new Pessoa("Miguel", "12345678", "SC", 500);
		Pessoa p3 = new Pessoa("Jr", "12345678", "SC", 2000);
		Pessoa p4 = new Pessoa("Pedro", "12345678", "SC", 9500);
		Pessoa p5 = new Pessoa("Luiz", "12345678", "SC", 6000);
		double imp[] = new double[5];
		imp[0] = p1.cont();
		imp[1] = p2.cont();
		imp[2] = p3.cont();
		imp[3] = p4.cont();
		imp[4] = p5.cont();
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		double soma = 0;
		String resp1 = "";
		String resp2 = "";
		for (int i = 0; i < imp.length; i++) {
			if (imp[i] > max) {
				max = imp[i];
				switch (i) {
				case 0:
					resp1 = "Arthur";
					break;
				case 1:
					resp1 = "Miguel";
					break;
				case 2:
					resp1 = "Jr";
					break;
				case 3:
					resp1 = "Pedro";
					break;
				case 4:
					resp1 = "Luiz";
					break;
				default:
					break;
				}
			}
			if (imp[i] < min) {
				min = imp[i];
				switch (i) {
				case 0:
					resp2 = "Arthur";
					break;
				case 1:
					resp2 = "Miguel";
					break;
				case 2:
					resp2 = "Jr";
					break;
				case 3:
					resp2 = "Pedro";
					break;
				case 4:
					resp2 = "Luiz";
					break;
				default:
					break;
				}
			}
		soma += imp[i];
		}
		System.out.println("Quem pagou mais imposto: " + resp1);
		System.out.println("Quem pagou menos imposto: " + resp2);
		System.out.println("O total pago em impostos foi de: " + soma);
	}

}
