package Aula1;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual é o nome do vendedor?");
		String nome = entrada.next();
		System.out.println("Qual é o salário fixo do funcionário?");
		final double salF = entrada.nextDouble();
		System.out.println("Quantas vendas o funcionário fez?");
		double numV = entrada.nextDouble();
		double comissao = (numV / 100) * 15;
		double salario = salF + comissao;
		System.out.println("O funcionário " + nome + " receberá " + salario + " reais neste mês");
	}
}
