package exercicio5;

import java.util.Iterator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		Material m1 = new Material("cimento", "cimento", 10, 5, 10);
		Material m2 = new Material("areia", "areia", 20, 15, 100);
		Material m3 = new Material("massa", "massa", 15, 50, 2);
		for(Material m : Material.lista) {
			System.out.println("O produto " + m.getNome() + " foi adicionado no estoque?");
			if (info.next().charAt(0) == 's') {
				System.out.println("Digite a quantidade adicionada");
				m.addEstoque(info.nextInt());
			}
			System.out.println("O produto " + m.getNome() + " foi vendido?");
			if (info.next().charAt(0) == 's') {
				System.out.println("Digite a quantidade vendida");
				m.vendEstoque(info.nextInt());
			}
			System.out.println("O produto " + m.getNome() + " foi teve desconto?");
			if (info.next().charAt(0) == 's') {
				System.out.println("Digite a porcentagem de desconto");
				m.desc(info.nextInt());
			}
		}
		double maxPreco = Integer.MIN_VALUE;
		double minPeso = Integer.MAX_VALUE;
		Material aux1 = null;
		Material aux2 = null;
		Double aux3 = null;
		for(Material m : Material.lista) {
			if (m.getPreco() > maxPreco) {
				maxPreco = m.getPreco();
				aux1 = m;
				aux3 = m.getPeso() * m.getEstoque();
			}
			if (m.getPeso() < minPeso) {
				minPeso = m.getPeso();
				aux2 = m;
			}
		}
		System.out.println("Nome do produto mais caro: " + aux1.getNome());
		System.out.println("Nome do produto mais leve: " + aux2.getNome());
		System.out.println("Peso da quantidade total do produto mais caro: " + aux3);
	}

}
