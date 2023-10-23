package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Retangulo {
	private double altura;
	private double largura;
	public static List<Retangulo>lista = new ArrayList<>();
	public Retangulo(double altura, double largura) {
		setAltura(altura);
		setLargura(largura);
		lista.add(this);	
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura <= 0) {
			System.out.println("Erro");
		} else {
			this.altura = altura;
		}
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		if (largura <= 0) {
			System.out.println("Erro");
		} else {
			this.largura = largura;
		}
	}
	public double calcArea() {
		return this.getAltura() * this.getLargura();
	}
	public double calcPerimetro() {
		return this.getAltura() + this.getAltura() + this.getLargura() + this.getLargura() ;
	}
	@Override
	public String toString() {
		return "O retângulo de altura " + this.getAltura() + " e de largura " + this.getLargura(); 
	}
}
