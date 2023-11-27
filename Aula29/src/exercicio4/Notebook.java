package exercicio4;

public class Notebook extends Computador{
	private double weigth;
	public Notebook(String model, double ram, double storage, double weigth) {
		super(model, ram, storage);
		setWeigth(weigth);
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	@Override
	public boolean playApp(String appName) {
		if (appName.endsWith(".exe")) {
			return true;
		} else {
			return false;
		}
	}
	public void addRam(double addRam) {
		setRam(getRam() + addRam);
	}
	@Override
	public String toString() {
		return super.toString() + ", weigth= " + weigth;
	}
	
}
