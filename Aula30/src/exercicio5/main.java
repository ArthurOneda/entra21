package exercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<String> hability = new ArrayList<>();
		hability.add("Adm");
		hability.add("Speak");
		Endereco endereco = new Endereco("Brasil", "SC", "Blumenau", "Rua ", "12");
		Empregado empregado = new Empregado("1", endereco, LocalDate.of(2006, 3, 7), "Arthur", 10000, LocalDate.of(2022, 1, 26), hability, "2", null);
		Gerente gerente = new Gerente("1", endereco, LocalDate.of(1999, 10, 20), "Mari", 5000, LocalDate.of(2018, 5, 15), hability, "2");
		System.out.println(empregado.toString());
		System.out.println(empregado.annualSalary());
		System.out.println(empregado.getAge());
		System.out.println(empregado.companyTime());
		empregado.setManager(gerente);
		System.out.println(empregado.toString());
		System.out.println(gerente.toString());
	}

}
