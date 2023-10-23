package exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Vereador {
	private String nome;
	private String partido;
	private double qtdProjApres;
	private double qtdProjAprov;
	public static List<Vereador> lista = new ArrayList<>();
	public Vereador(String nome, String partido, int qtdProjApres, int qtdProjAprov) {
		setNome(nome);
		setQtdProjApres(qtdProjApres);
		setQtdProjAprov(qtdProjAprov);
		lista.add(this);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getQtdProjApres() {
		return qtdProjApres;
	}
	public void setQtdProjApres(double qtdProjApres) {
		this.qtdProjApres = qtdProjApres;
	}
	public double getQtdProjAprov() {
		return qtdProjAprov;
	}
	public void setQtdProjAprov(double qtdProjAprov) {
		this.qtdProjAprov = qtdProjAprov;
	}
	public double desempenho() {
		double indTrab = this.indiceTrabalho();
		if (this.getQtdProjApres() == 0) {
			return 0;
		} else {
			return (this.qtdProjAprov / this.qtdProjApres) * indTrab;
		}
	}
	private double indiceTrabalho() {
		double indice = 0;
		if (qtdProjApres >= 17) {
			indice = 1.22;
		} else if (qtdProjApres >= 11 && qtdProjApres < 17) {
			indice = 1.08;
		} else if (qtdProjApres > 6 && qtdProjApres < 11) {
			indice = 1;
		} else {
			indice = 0.8;
		}
		return indice;
	}
}
