package Prova3;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	private String modelo;
	private String marca;
	private String placa;
	private String cor;
	private int ano;
	private double preco;
	private int local;
	public static List<Carro> lista = new ArrayList<>();
	public Carro(String modelo, String marca, String placa, String cor, int ano, double preco, int local) {
		setAno(ano);
		setCor(cor);
		setLocal(local);
		setMarca(marca);
		setModelo(modelo);
		setPlaca(placa);
		setPreco(preco);
		lista.add(this);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço inválido");
		} else {
			this.preco = preco;
		}
	}
	public int getLocal() {
		return local;
	}
	public void setLocal(int local) {
		if (local < 1) {
			throw new IllegalArgumentException("Local inválido");
		} else {
			this.local = local;
		}
	}
	public String depreciacao(int anoDp) {
		double precoAux = preco;
		int porc = 0;
		if (ano < 2010) {
			porc = 7;
		} else {
			porc = 5;
		}
		for (int i = 2023; i < anoDp;) {
			i++;
			double desc = (precoAux / 100) * porc;
			precoAux = precoAux - desc;
		}
		return modelo + " = " + precoAux;
	}
	@Override
	public String toString() {
		return "Modelo: " + modelo + "\nMarca: " + marca + "\nPlaca: " + placa + "\nCor: " + cor + "\nAno: " + ano + "\nPreço: " + preco + "\nLocalização: " + local;
	}
}
