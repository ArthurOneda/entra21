package exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private String nome;
	private String ingrediente1;
	private String ingrediente2;
	private String ingrediente3;
	private boolean borda;
	private double diametro;
	private double preco;
	public static List<Pizza> lista = new ArrayList<>();
	public Pizza(String nome, String ingrediente1, String ingrediente2, String ingrediente3, boolean borda, double diametro, double preco) {
		setBorda(borda);
		setDiametro(diametro);
		setIngrediente1(ingrediente1);
		setIngrediente2(ingrediente2);
		setIngrediente3(ingrediente3);
		setNome(nome);
		setPreco(preco);
		lista.add(this);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngrediente1() {
		return ingrediente1;
	}
	public void setIngrediente1(String ingrediente1) {
		this.ingrediente1 = ingrediente1;
	}
	public String getIngrediente2() {
		return ingrediente2;
	}
	public void setIngrediente2(String ingrediente2) {
		this.ingrediente2 = ingrediente2;
	}
	public String getIngrediente3() {
		return ingrediente3;
	}
	public void setIngrediente3(String ingrediente3) {
		this.ingrediente3 = ingrediente3;
	}
	public boolean isBorda() {
		return borda;
	}
	public void setBorda(boolean borda) {
		this.borda = borda;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		if (diametro < 0) {
			System.out.println("Erro");
		} else {
			this.diametro = diametro;
		}
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
	public void alterar(String aux) {
		if (ingrediente1 == null) {
			ingrediente1 = aux;
		} else if (ingrediente2 == null) {
			ingrediente2 = aux;
		} else {
			ingrediente3 = aux;
		}
	}
	public double precoArea() {
		double raio = diametro / 2;
		double area = raio * Math.PI;
		double calc = area / preco;
		return calc;
	}
	@Override
	public String toString() {
		return nome + " tem um preço por área de " + precoArea() + " reais";
	}
}
