package exercicio2;

public abstract class Embarcacao {
	private String id;
	private String model;
	private int numPeople;
	private double fuelCapacity;
	private double fuelConsume;
	private int numLifeboats;
	public abstract String safeCheck();
	public Embarcacao(String id, String model, int numPeople, double fuelCapacity, double fuelConsume, int numLifeboats) {
		setId(id);
		setModel(model);
		setNumPeople(numPeople);
		setFuelCapacity(fuelCapacity);
		setFuelConsume(fuelConsume);
		setNumLifeboats(numLifeboats);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumPeople() {
		return numPeople;
	}
	public void setNumPeople(int numPeople) {
		this.numPeople = numPeople;
	}
	public double getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public double getFuelConsume() {
		return fuelConsume;
	}
	public void setFuelConsume(double fuelConsume) {
		this.fuelConsume = fuelConsume;
	}
	public int getNumLifeboats() {
		return numLifeboats;
	}
	public void setNumLifeboats(int numLifeboats) {
		this.numLifeboats = numLifeboats;
	}
	public boolean planTravel(double dist) {
		double calc = fuelCapacity / fuelConsume;
		if (calc >= dist) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Id: " + id + "\nModel: " + model + "\nNumber Passengers: " + numPeople + "\nFuel Capacity: " + fuelCapacity + "\nFuel Consume: " + fuelConsume + "\nNumber of Lifeboats: " + numLifeboats;
	}
}
