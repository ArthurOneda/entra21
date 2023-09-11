package Prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArthurOneda_5 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		String nome = "";
		int numVendas = 0;
		double preco;
		double vComissao = 0;
		char op = 's';
		while (op == 's') {
			System.out.println("Qual é o vendedor?");
			nome = info.next();
			System.out.println("Quantas vendas ele fez?");
			numVendas = info.nextInt();
			for (int i = 1; i <= numVendas; i++) {
				System.out.println("Qual é o preço do " + i + "º produto");
				preco = info.nextDouble();
				double calc = (preco / 100) * 30;
				vComissao = vComissao + calc;
			}
			System.out.println("Nome do vendedor: " + nome);
			System.out.println("Total de vendas em R$: " + formatar.format(vComissao));
			System.out.println("Numero de vendas: " + numVendas);
			System.out.println("Deseja cadastrar outro vendedor?");
			op = info.next().charAt(0);
			while (op != 's' || op != 'n') {
				System.out.println("Deseja cadastrar outro vendedor?");
				op = info.next().charAt(0);
			}
		}
	}

}
