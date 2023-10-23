package exercicio6;

public class main {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("Pizza 1", "Queijo", "Tomate", "Mangericão", true, 10, 5);
		Pizza p2 = new Pizza("Pizza 2", "Queijo", "Tomate", "Calabresa", true, 5, 20);
		Pizza p3 = new Pizza("Pizza 3", "Queijo", "Tomate", "Milho", true, 7, 12);
		Pizza p4 = new Pizza("Pizza 4", "Queijo", "Tomate", "Ovo", false, 15, 16);
		Pizza p5 = new Pizza("Pizza 5", "Queijo", "Tomate", "Azeitona", false, 12, 11);
		double min = Integer.MAX_VALUE;
		Pizza ind = null;
		for(Pizza p : Pizza.lista) {
			if (p.precoArea() < min) {
				min = p.precoArea();
				ind = p;
			}
		}
		System.out.println(ind.toString());
	}

}
