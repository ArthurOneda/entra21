package exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Material {
	
	private String nome;
	private String decricao;
	private double preco;
	private double peso;
	private int estoque;
	public static List<Material> lista = new ArrayList<>();
	public Material(String nome, String decricao, double preco, double peso, int estoque) {
		setNome(nome);
		setDecricao(decricao);
		setPreco(preco);
		setPeso(peso);
		setEstoque(estoque);
		lista.add(this);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDecricao() {
		return decricao;
	}
	public void setDecricao(String decricao) {
		this.decricao = decricao;
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso <= 0) {
			System.out.println("Erro");
		} else {
			this.peso = peso;
		}
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		if (estoque < 0) {
			System.out.println("Erro");
		} else {
			this.estoque = estoque;
		}
	}
	public void addEstoque(int add) {
		setEstoque(estoque + add);
	}
	public void vendEstoque(int vend) {
		setEstoque(estoque - vend);
	}
	public void desc(int desc) {
		setPreco(preco - (preco / 100) * desc);
	}
}
