package Trabalho;

import java.util.Scanner;

public class Spray extends Remedio{
	private double volume;
	private boolean precisaDeAgitacao;
	private double mlPorBorrifada;
	public Spray(int id, String marca, String principioAtivo, Fornecedor fornecedor, String classe, double valor, double volume, boolean precisaDeAgitacao, double mlPorBorrifada) {
		super(id, marca, principioAtivo, fornecedor, classe, valor);
		setVolume(volume);
		setPrecisaDeAgitacao(precisaDeAgitacao);
		setMlPorBorrifada(mlPorBorrifada);
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		if (volume <= 0) {
			throw new IllegalArgumentException("Volume Inválido");
		} else {
			this.volume = volume;
		}
	}
	public boolean isPrecisaDeAgitacao() {
		return precisaDeAgitacao;
	}
	public void setPrecisaDeAgitacao(boolean precisaDeAgitacao) {
		this.precisaDeAgitacao = precisaDeAgitacao;
	}
	public double getMlPorBorrifada() {
		return mlPorBorrifada;
	}
	public void setMlPorBorrifada(double mlPorBorrifada) {
		if (mlPorBorrifada <= 0) {
			throw new IllegalArgumentException("Quantidade Inválida");
		} else {
			this.mlPorBorrifada = mlPorBorrifada;
		}
	}
	@Override
	public int tomarEmQuantoTempo() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Deve aplicar o spray com intervalo de quantos minutos?");
		int temp = teclado.nextInt();
		return temp;
	}
	public String necessitaAgitar() {
		if (precisaDeAgitacao) {
			return "Agitando";
		} else {
			return "Não precisa agitar";
		}
	}
}
