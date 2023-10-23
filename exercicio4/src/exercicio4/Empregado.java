package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Empregado {

	private int id;
	private String pNome;
	private String sNome;
	private double salario;
	public static List<Empregado> lista = new ArrayList<>();
	public Empregado(int id, String pNome, String sNome, double salario) {
		setId(id);
		setpNome(pNome);
		setsNome(sNome);
		setSalario(salario);
		lista.add(this);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpNome() {
		return pNome;
	}
	public void setpNome(String pNome) {
		this.pNome = pNome;
	}
	public String getsNome() {
		return sNome;
	}
	public void setsNome(String sNome) {
		this.sNome = sNome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (salario <= 0) {
			System.out.println("Erro");
		} else {
			this.salario = salario;
		}
	}
	public void aumento(int percentual) {
		salario = salario + (salario/100) * percentual;
	}
	public double salarioAnual() {
		double calc = salario * 12;
		return calc;
	}
	public String nomeC() {
		String completo = pNome + " " + sNome;
		return completo;
	}
	@Override
	public String toString() {
		return nomeC() + " tem o salário de " + salarioAnual();
	}
}
