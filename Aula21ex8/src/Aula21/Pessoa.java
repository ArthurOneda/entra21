package Aula21;

public class Pessoa {
	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;
	public Pessoa(String nome, String cpf, String uf, double rendaAnual) {
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRendaAnual(rendaAnual);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual < 0) {
			System.out.println("Erro, valor inválido");
		} else {
			this.rendaAnual = rendaAnual;
		}
	}
	public double cont() {
		double impo = 0;
		if (rendaAnual <= 4000) {
			impo = 0;
		} else if (rendaAnual > 4000 && rendaAnual <= 9000) {
			impo = (rendaAnual / 100) * 5.8;
		} else if (rendaAnual > 9000 && rendaAnual <= 25000) {
			impo = (rendaAnual / 100) * 15;
		} else if (rendaAnual > 25000 && rendaAnual <= 35000) {
			impo = (rendaAnual / 100) * 27.5;
		} else {
			impo = (rendaAnual / 100) * 30;
		}
		return impo;
	}
}
