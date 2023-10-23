package exercicio3;

public class main {

	public static void main(String[] args) {
		Flor f1 = new Flor("Rosa", 1, "Miguel", true);
		Flor f2 = new Flor("Rosa", 2, "Miguel", true);
		Flor f3 = new Flor("Rosa", 3, "Miguel", true);
		Flor f4 = new Flor("Orquidea", 200000, "Luiz", true);
		Flor f5 = new Flor("Rosa", 4, "Miguel", true);
		double max = Integer.MIN_VALUE;
		Flor nomeC = null;
		Flor nomeF = null;
		for(Flor f : Flor.lista) {
			if (f.getPreco() > max) {
				max = f.getPreco();
				nomeC = f;
				nomeF = f;
			}
		}
		System.out.println(nomeC.toString());
		System.out.println(nomeF.toString());
	}

}
