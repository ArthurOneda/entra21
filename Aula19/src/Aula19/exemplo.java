package Aula19;

public class exemplo {
	public static String imprimirNome() {
		//dentro do escopo tem um return
		//sempre criar uma variavel para ser retornada
		String nome = "Arthur";
		return nome;
	}
	public static double soma(double num1, double num2) {
		double soma = num1 + num2;
		return soma;
	}
	public static void main(String[] args) {
		System.out.println(imprimirNome());
		System.out.println(soma(10.5, 25.5));
	}

}
