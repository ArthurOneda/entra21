package exemplo;

public class Bicicleta extends Veiculo{
	boolean freio;
	public Bicicleta(String modelo, double peso, double comprimento, double velMax, int passageiros, boolean freio) {
		super(modelo, peso, comprimento, velMax, passageiros);
		this.freio = freio;
	}
}
