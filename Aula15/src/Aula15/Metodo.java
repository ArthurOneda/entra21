package Aula15;

import java.util.Random;

public class Metodo {

	public static void main(String[] args) {
		//Não pode ter metodos dentro de metodos
		String nome = "Mclovin";
		escrevaNome(nome);
		media();
		corFavorita();
	}
	public static void escrevaNome(String nome) {
		//programar dentro do metodo
		System.out.println("Olá, eu sou o " + nome);
	}
	public static void media() {
		//fazer calculo de media e printar na tela
		double media = (10 + 2) / 2;
		System.out.println(media);
	}
	//public static void nome() {
	//não é obrigatório ter algo entre os parenteses
	//}
	/* Os erros sempre são apresentados no console/terminal
	 * EX: at Java/Aula15.Metodo.main(Metodo.java:10)
	 * Considerando o que está dentro dos parenteses, a ordem é nome do arquivo(no caso Metodo), a extensão(no caso .java) e por fim :linha onde está o erro(no caso :10)
	 */
	public static void corFavorita() {
		System.out.println("Laranja");
	}
	// Não podem haver 2 metodos com o mesmo nome

}
