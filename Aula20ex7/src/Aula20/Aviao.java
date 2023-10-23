package Aula20;

public class Aviao {
	int passageiros;
	double veloMax;
	double capaComb;
	double rendimento;
	public Aviao(int passageiros, double veloMax, double capaComb, double rendimento) {
		this.passageiros = passageiros;
		this.veloMax = veloMax;
		this.capaComb = capaComb;
		this.rendimento = rendimento;
	}
	public double tempAr() {
		return capaComb / rendimento;
	}
	public double distancia() {
		double calc = (tempAr() / 60) * veloMax;
		return calc;
	}
	
}
