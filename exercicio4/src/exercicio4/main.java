package exercicio4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		Empregado e1 = new Empregado(5, "Miguel", "O'Hara", 100);
		Empregado e2 = new Empregado(5, "Arthur", "Oneda", 200);
		Empregado e3 = new Empregado(5, "Daniel", "Prada", 300);
		for (Empregado e : Empregado.lista) {
			System.out.println(e.toString());
			System.out.println("O funcionário recebeu aumento?");
			char op = info.next().charAt(0);
			if (op == 's') {
				System.out.println("Qual foi a porcentagem de aumento");
				e.aumento(info.nextInt());
			}
		}
		double max = Integer.MIN_VALUE;
		Empregado aux = null;
		for (Empregado e : Empregado.lista) {
			if (e.salarioAnual() > max) {
				max = e.salarioAnual();
				aux = e;
			}
		}
		System.out.println(aux.toString());
	}

}
