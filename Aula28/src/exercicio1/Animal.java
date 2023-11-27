package exercicio1;

public abstract class Animal {
	private String species;
	private boolean pet;
	private double weight;
	public abstract String sound();
	public Animal(String species, boolean pet, double weight) {
		setSpecies(species);
		setPet(pet);
		setWeight(weight);
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		if (species != null || species.isBlank()) {
			this.species = species;
		} else {
			throw new IllegalArgumentException("Invalid Species");
		}
	}
	public boolean isPet() {
		return pet;
	}
	public void setPet(boolean pet) {
		this.pet = pet;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			throw new IllegalArgumentException("Invalid Weight");
		}
	}
	
}
