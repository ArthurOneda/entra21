package exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	private String proprietario;
	private double saldo;
	private int idDaConta;
	public static List<Conta> lista = new ArrayList<>();
	//ele vai executar quando o objeto é criado, passar os dados para atribuir como parâmetros
	public Conta(String proprietario, int idDaConta) {
		setIdDaConta(idDaConta);
		setProprietario(proprietario);
		lista.add(this);
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		if (proprietario != null && !proprietario.isBlank()) {
			this.proprietario = proprietario;
		} else {
			throw new IllegalArgumentException("Proprietário Inválido");
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if (saldo < 0) {
			throw new IllegalArgumentException("Saldo Inválido");
		} else {
			this.saldo = saldo;
		}
	}
	public int getIdDaConta() {
		return idDaConta;
	}
	public void setIdDaConta(int idDaConta) {
		this.idDaConta = idDaConta;
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	public void sacar(double valor) {
		saldo -= valor;
	}
	public void transferencia(double transferir, Conta nomeT) {
		saldo -= transferir;
		nomeT.saldo += transferir;
	}
}
