package exercicio1;

public class Cachorro extends Animal{
	private String race;
	public Cachorro(String species, boolean pet, double weight, String race) {
		super(species, pet, weight);
		setRace(race);
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "*Bark*";
	}
	
}
