package exercicio2;

public class Lancha extends Embarcacao{
	private double maxSpe;
	public Lancha(String id, String model, int numPeople, double fuelCapacity, double fuelConsume, int numLifeboats, double maxSpe) {
		super(id, model, numPeople, fuelCapacity, fuelConsume, numLifeboats);
		setMaxSpe(maxSpe);
	}
	public double getMaxSpe() {
		return maxSpe;
	}
	public void setMaxSpe(double maxSpe) {
		this.maxSpe = maxSpe;
	}
	@Override
	public String safeCheck() {
		if (getNumLifeboats() > 0) {
			return "Lifeboats Online";
		} else {
			return "WARNING: The boat needs more life boats";
		}
	}
	public double travelTime(double dist) {
		double calc = dist / maxSpe;
		return calc;
	}
	@Override
	public String toString() {
		return super.toString() + "\nMax Speed: " + maxSpe + "\nSafe Check: " + safeCheck();
	}
}
