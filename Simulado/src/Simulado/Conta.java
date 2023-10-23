package Simulado;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	private String nome;
	private String categoria;
	private int anoCadastro;
	private double saldo;
	private String gerente;
	public static List<Conta> lista = new ArrayList<>();
	public Conta(String nome, String categoria, int anoCadastro, double saldo, String gerente) {
		setAnoCadastro(anoCadastro);
		setCategoria(categoria);
		setGerente(gerente);
		setNome(nome);
		setSaldo(saldo);
		lista.add(this);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getAnoCadastro() {
		return anoCadastro;
	}
	public void setAnoCadastro(int anoCadastro) {
		this.anoCadastro = anoCadastro;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if (saldo < 0) {
			throw new IllegalArgumentException("Saldo inválido");
		}
		this.saldo = saldo;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + "\nCategoria: " + categoria + "\nAno do Cadastro: " + anoCadastro + "\nSaldo: " + saldo + "\nGerente: " + gerente;
	}
}
