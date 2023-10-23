package Aula22;

import java.util.ArrayList;
import java.util.List;

public class exemplo1 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Sérgio");
		lista.add("Bruna");
		lista.add("Aline");
		lista.add(1, "Cláudio");
		lista.remove("Sérgio");
		lista.remove(1);
		
		System.out.println(lista);
	}

}
