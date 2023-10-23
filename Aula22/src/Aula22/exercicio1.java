package Aula22;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class exercicio1 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(7);
		lista.add(8);
		lista.add(3);
		lista.add(2);
		lista.add(1);
		lista.sort(null);
		System.out.println(lista);
	}

}
