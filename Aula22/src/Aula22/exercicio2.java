package Aula22;

import java.util.ArrayList;
import java.util.List;

public class exercicio2 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(7);
		lista.add(8);
		lista.add(3);
		lista.add(2);
		lista.add(1);
		for (int i = 4; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
	}

}
