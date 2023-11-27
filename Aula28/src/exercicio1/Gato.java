package exercicio1;

public class Gato extends Animal{
	private boolean neutered;
	public Gato(String species, boolean pet, double weight, boolean neutered) {
		super(species, pet, weight);
		setNeutered(neutered);
	}
	public boolean isNeutered() {
		return neutered;
	}
	public void setNeutered(boolean neutered) {
		this.neutered = neutered;
	}
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Mew";
	}
	
}
