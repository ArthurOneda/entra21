package Prova3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		Carro c1 = new Carro("Gol", "VW", "MMM001", "Preto", 2009, 25000, 1);
		Carro c2 = new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 30000, 2);
		Carro c3 = new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 32000, 3);
		Carro c4 = new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 29000, 1);
		Carro c5 = new Carro("Palio", "Fiat", "KKK345", "Amarelo", 2011, 26000, 1);
		System.out.println("Deseja calcular a depreciação dos carros?\nS - Sim  Qualquer outra resposta - Não");
		char op = info.next().charAt(0);
		if (op == 'S' || op == 's') {
			System.out.println("Digite o ano que deseja saber o valor");
			int anoD = info.nextInt();
			for (Carro c : Carro.lista) {
				System.out.println(c.depreciacao(anoD));
			}
		} else {
			System.out.println("Ok");
		}
		Carro resp1 = null;
		double maxA = Integer.MIN_VALUE;
		System.out.println("Qual ano você deseja consultar?");
		int anoCons = info.nextInt();
		for (Carro c : Carro.lista) {
			if (c.getAno() == anoCons) {
				if (c.getPreco() > maxA) {
					maxA = c.getPreco();
					resp1 = c;
				}
			}
		}
		System.out.println(resp1.toString() + "\n\n");
		System.out.println("Qual marca você deseja consultar?");
		String marca = info.next();
		System.out.println("Qual o valor mínimo");
		double min = info.nextDouble();
		System.out.println("Qual o valor máximo");
		double max = info.nextDouble();
		for (Carro c : Carro.lista) {
			if (c.getMarca().equals(marca) && c.getPreco() >= min && c.getPreco() <= max) {
				System.out.println(c.toString() + "\n");
			}
		}
		System.out.println("Qual local deseja consultar?");
		int localCons = info.nextInt();
		double maxL = Integer.MIN_VALUE;
		double minL = Integer.MAX_VALUE;
		Carro resp2 = null;
		Carro resp3 = null;
		for (Carro c : Carro.lista) {
			if (c.getLocal() == localCons) {
				if (c.getPreco() > maxL) {
					maxL = c.getPreco();
					resp2 = c;
				}
				if (c.getPreco() < minL) {
					minL = c.getPreco();
					resp3 = c;
				}
			}
		}
		System.out.println("Mais caro: \n" + resp2.toString() + "\n\n");
		System.out.println("Mais barato: \n" + resp3.toString());
	}

}
