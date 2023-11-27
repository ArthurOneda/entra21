package Trabalho;

import java.time.LocalDate;
import java.time.Period;

public class Injecao extends Remedio{
	private double volume;
	private LocalDate dataDeAplicacao;
	public Injecao(int id, String marca, String principioAtivo, Fornecedor fornecedor, String classe, double valor, double volume, LocalDate dataDeAplicacao) {
		super(id, marca, principioAtivo, fornecedor, classe, valor);
		setVolume(volume);
		setDataDeAplicacao(dataDeAplicacao);
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		if (volume <= 0) {
			throw new IllegalArgumentException();
		} else {
			this.volume = volume;
		}
	}
	public LocalDate getDataDeAplicacao() {
		return dataDeAplicacao;
	}
	public void setDataDeAplicacao(LocalDate dataDeAplicacao) {
		if (dataDeAplicacao.equals(null)) {
			throw new IllegalArgumentException("Data Inválida");
		} else {
			this.dataDeAplicacao = dataDeAplicacao;
		}
	}
	@Override
	public int tomarEmQuantoTempo() {
		return 0;
	}
	public Period diasAteRenovacao(LocalDate vencimento) {
		Period calc = dataDeAplicacao.until(vencimento);
		return calc;
	}
}
