package Aula5;

public class exercicio8 {

	public static void main(String[] args) {
		int imp = 0;
		int par = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 1) {
				imp = imp + i;
			} else {
				par = par + i;
			}
		}
		System.out.println(imp);
		System.out.println(par);
	}

}
