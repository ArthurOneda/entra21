package exercicio4;

public class Smartphone extends Computador{
	private int provider;
	private boolean faceCam;
	public Smartphone(String model, double ram, double storage, int provider, boolean faceCam) {
		super(model, ram, storage);
		setFaceCam(faceCam);
		setProvider(provider);
	}
	public int getProvider() {
		return provider;
	}
	public void setProvider(int provider) {
		this.provider = provider;
	}
	public boolean isFaceCam() {
		return faceCam;
	}
	public void setFaceCam(boolean faceCam) {
		this.faceCam = faceCam;
	}
	@Override
	public boolean playApp(String appName) {
		if (appName.endsWith(".apk")) {
			return true;
		} else {
			return false;
		}
	}
	public boolean takeSelfie() {
		if (faceCam) {
			return true;
		} else {
			return false;
		}
	}
	public boolean call(int aux) {
		if (aux == provider) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return super.toString() + ", provider= " + provider + ", faceCam= " + faceCam;
	}
}
