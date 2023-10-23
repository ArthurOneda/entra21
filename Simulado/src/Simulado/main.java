package Simulado;

import java.lang.ProcessHandle.Info;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		Conta c1 = new Conta("Jorge", "Private", 2022, 2500000, "Ana");
		Conta c2 = new Conta("Luís", "Stilo", 2015, 500000, "Ana");
		Conta c3 = new Conta("Cláudio", "Exclusive", 2017, 250000, "Marina");
		Conta c4 = new Conta("Bruna", "Prime", 2005, 5500000, "Paulo");
		Conta c5 = new Conta("Ana", "Exclusive", 2023, 240000, "Paulo");
		double maxSaldo = Integer.MIN_VALUE;
		Conta resp1 = null;
		for(Conta c : Conta.lista) {
			if (c.getSaldo() > maxSaldo) {
				maxSaldo = c.getSaldo();
				resp1 = c;
			}
		}
		System.out.println("a) " + resp1.toString() + "\n\n");
		System.out.println("Digite o nome de um gerente");
		String nome = info.next();
		int minAno = Integer.MAX_VALUE;
		int cont = 0;
		Conta resp2 = null;
		for(Conta c : Conta.lista) {
			if (c.getGerente().equals(nome)) {
				if (c.getAnoCadastro() < minAno) {
					minAno = c.getAnoCadastro();
					resp2 = c;
				}
				cont++;
			}
		}
		System.out.println("b) " + resp2.toString() + "\n\n");
		for(Conta c : Conta.lista) {
			if (c.getGerente().equals(nome)) {
				System.out.println("c) " + c.toString() + "\n\n");
			}
		}
		System.out.println("O(a) gerente " + nome + " tem " + cont + " clientes");
	}

}
