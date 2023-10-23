package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Flor {

	private String nomeFlor;
	private double preco;
	private String nomeComprador;
	private boolean presente;
	public static List<Flor> lista = new ArrayList<>();
	public Flor(String nomeFlor, double preco, String nomeComprador, boolean presente) {
		setNomeFlor(nomeFlor);
		setNomeComprador(nomeComprador);
		setPreco(preco);
		setPresente(presente);
		lista.add(this);
	}

	public String getNomeFlor() {
		return nomeFlor;
	}

	public void setNomeFlor(String nomeFlor) {
		this.nomeFlor = nomeFlor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			System.out.println("Erro");
		} else {
			this.preco = preco;
		}
	}

	public String getNomeComprador() {
		return nomeComprador;
	}

	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}
	@Override
	public String toString() {
		return nomeComprador + " comprou a flor " + nomeFlor + " por " + preco + " reais";
	}

}
