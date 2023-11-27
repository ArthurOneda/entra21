package exemplo1;

public class Circulo {
	private double radius;
	private String color;
	public Circulo(double radius, String color) {
		setColor(color);
		setRadius(radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius < 0) {
			throw new IllegalArgumentException("Invalid radius");
		} else {
			this.radius = radius;
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if (color.isBlank()) {
			throw new IllegalArgumentException("Invalid color");
		} else {
			this.color = color;
		}
	}
	public double area() {
		double area = (radius * radius) * Math.PI;
		return area;
	}
	@Override
	public String toString() {
		return "Circle area: " + area();
	}
}
