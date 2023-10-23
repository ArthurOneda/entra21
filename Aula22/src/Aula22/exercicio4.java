package Aula22;

import java.util.ArrayList;
import java.util.List;

public class exercicio4 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			lista.add(i*i);
			System.out.println("[" + i + "]" + " = " + lista.get(i));
		}
	}

}
