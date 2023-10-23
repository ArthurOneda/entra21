package exercicio7;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		Conta c1 = new Conta("Arthur", 1234);
		Conta c2 = new Conta("Miguel", 9876);
		for(Conta c : Conta.lista) {
			System.out.println("Deseja sacar algum dinheiro?");
			if (info.next().charAt(0) == 's') {
				System.out.println("Quanto você deseja sacar");
				c.sacar(info.nextDouble());
			}
			System.out.println("Deseja depositar algum dinheiro?");
			if (info.next().charAt(0) == 's') {
				System.out.println("Quanto você deseja depositar");
				c.depositar(info.nextDouble());
			}
			System.out.println("Deseja transferir algum dinheiro?");
			if (info.next().charAt(0) == 's') {
				System.out.println("Quanto você deseja transferir");
				double valT = info.nextDouble();
				System.out.println("Paraquem você deseja transferir");
				String nomeT
				c.transferencia(valT, info.next());
			}
		}
	}

}
