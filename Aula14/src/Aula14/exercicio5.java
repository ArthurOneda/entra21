package Aula14;

public class exercicio5 {

	public static void main(String[] args) {
		int vet[] = new int[20];
		for (int i = 0; i <= vet.length; i++) {
			vet[i] = i * i;
			System.out.println("[" + i + "]" + " = " + vet[i]);
		}
	}

}
