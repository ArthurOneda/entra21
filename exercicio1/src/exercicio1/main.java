package exercicio1;

public class main {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(1, 5);
		Retangulo r2 = new Retangulo(2, 10);
		Retangulo r3 = new Retangulo(3, 15);
		Retangulo r4 = new Retangulo(4, 20);
		Retangulo r5 = new Retangulo(5, 25);
		Retangulo r6 = new Retangulo(6, 30);
		Retangulo r7 = new Retangulo(7, 35);
		Retangulo r8 = new Retangulo(8, 40);
		Retangulo r9 = new Retangulo(9, 45);
		Retangulo r10 = new Retangulo(10, 50);
		double maiorArea = Integer.MIN_VALUE;
		double maiorPerm = Integer.MIN_VALUE;
		//Salvar os dados do retângulo
		Retangulo retMaiorArea = null;
		Retangulo retMaiorPerm = null;
		for (Retangulo r : Retangulo.lista) {
			if (r.calcArea() > maiorArea) {
				maiorArea = r.calcArea();
				retMaiorArea = r;
			}
			if (r.calcPerimetro() > maiorPerm) {
				maiorPerm = r.calcPerimetro();
				retMaiorPerm = r;
			}
		}
		System.out.println("Maior área: " + retMaiorArea.toString());
		System.out.println("Maior perímetro: " + retMaiorPerm.toString());
	}

}
