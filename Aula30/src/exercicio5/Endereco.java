package exercicio5;

public class Endereco {
	private String country;
	private String state;
	private String city;
	private String logradouro;
	private String num;
	public Endereco(String country, String state, String city, String logradouro, String num) {
		setCountry(country);
		setCity(city);
		setState(state);
		setLogradouro(logradouro);
		setNum(num);
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}
