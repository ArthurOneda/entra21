package exercicio2;

public class Transatlantico extends Embarcacao{
	private int baptismYear;
	private int lifeboatsCapacity;
	public Transatlantico(String id, String model, int numPeople, double fuelCapacity, double fuelConsume, int numLifeboats, int baptismYear, int lifeboatsCapacity) {
		super(id, model, numPeople, fuelCapacity, fuelConsume, numLifeboats);
		setBaptismYear(baptismYear);
		setLifeboatsCapacity(lifeboatsCapacity);
	}
	public int getBaptismYear() {
		return baptismYear;
	}
	public void setBaptismYear(int baptismYear) {
		this.baptismYear = baptismYear;
	}
	public int getLifeboatsCapacity() {
		return lifeboatsCapacity;
	}
	public void setLifeboatsCapacity(int lifeboatsCapacity) {
		this.lifeboatsCapacity = lifeboatsCapacity;
	}
	@Override
	public String safeCheck() {
		double calc = getNumLifeboats() * lifeboatsCapacity;
		if (calc >= getNumPeople()) {
			return "Lifeboats Online";
		} else {
			return "WARNING: The boat needs more life boats";
		}
	}
	public void addLifeboats(int add) {
		setNumLifeboats(getNumLifeboats() + add);
	}
	@Override
	public String toString() {
		return super.toString() + "\nBaptism Year: " + baptismYear + "\nCapacity of Lifeboats: " + lifeboatsCapacity + "\nSafe Check: " + safeCheck();
	}
}
