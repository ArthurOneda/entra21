package exercicio4;

public abstract class Computador {
	private String model;
	private double ram;
	private double storage;
	public Computador(String model, double ram, double storage) {
		setModel(model);
		setRam(ram);
		setStorage(storage);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public double getStorage() {
		return storage;
	}
	public void setStorage(double storage) {
		this.storage = storage;
	}
	public String onOff(boolean status) {
		if (status) {
			return "Turning ON";
		} else {
			return "Turning OFF";
		}
	}
	public abstract boolean playApp(String appName);
	@Override
	public String toString() {
		return "Model= " + model + ", ram= " + ram + ", storage= " + storage;
	}
}
