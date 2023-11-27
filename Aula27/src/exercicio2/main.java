package exercicio2;

public class main {

	public static void main(String[] args) {
		AlunoEtevi ae1 = new AlunoEtevi("Junior", 16, 7);
		AlunoFURB af1 = new AlunoFURB("Miguel", 18, 'E', "Garçom", "Não");
		af1.stop();
		System.out.println(ae1.toString());
		System.out.println(af1.toString());
	}

}
