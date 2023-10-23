package exercicio2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		OnibusEscolar b1 = new OnibusEscolar(45, 2);
		OnibusEscolar b2 = new OnibusEscolar(30, 1);
		for (OnibusEscolar b : OnibusEscolar.lista) {
			System.out.println("Deseja remover alunos?");
			char op = info.next().charAt(0);
			if (op == 's') {
				System.out.println("Quantos alunos você quer remover?");
				int numRem = info.nextInt();
				b.remover(numRem);
			}
			System.out.println(b.toString());
		}
	}

}
