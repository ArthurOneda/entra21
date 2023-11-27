package exemplo1;

public class Cilindro extends Circulo{
	private double heigth;

	public Cilindro(double radius, String color, double heigth) {
		super(radius, color);
		setHeigth(heigth);
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		if (heigth < 0) {
			throw new IllegalArgumentException("Invalid heigth");
		} else {
			this.heigth = heigth;
		}
	}
	public double volume() {
		double vol = area() * heigth;
		return vol;
	}
	@Override
	public String toString() {
		return  super.toString() + "\nCilinder volume: " + volume();
	}
}
