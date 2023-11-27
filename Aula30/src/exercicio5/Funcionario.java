package exercicio5;

import java.time.LocalDate;
import java.util.List;

public abstract class Funcionario {
	private String id;
	private Endereco adress;
	private LocalDate birthDay;
	private String name;
	private double salary;
	private LocalDate startDay;
	private List<String> hability;
	public Funcionario(String id, Endereco adress, LocalDate birthDay, String name, double salary, LocalDate startDay, List<String> hability) {
		setId(id);
		setAdress(adress);
		setBirthDay(birthDay);
		setName(name);
		setSalary(salary);
		setStartDay(startDay);
		setHability(hability);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Endereco getAdress() {
		return adress;
	}
	public void setAdress(Endereco adress) {
		this.adress = adress;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getStartDay() {
		return startDay;
	}
	public void setStartDay(LocalDate startDay) {
		this.startDay = startDay;
	}
	public List<String> getHability() {
		return hability;
	}
	public void setHability(List<String> hability) {
		this.hability = hability;
	}
	public int getAge() {
		LocalDate aux = LocalDate.now();
		if (birthDay.getDayOfMonth() < aux.getDayOfMonth() && birthDay.getMonthValue() <= aux.getMonthValue()) {
			int age = aux.getYear() - birthDay.getYear() - 1;
			return age;
		} else {
			int age = aux.getYear() - birthDay.getYear();
			return age;
		}
	}
	public double annualSalary() {
		return salary * 12;
	}
	public void addHability(String newHability) {
		hability.add(newHability);
	}
	public int companyTime() {
		LocalDate aux = LocalDate.now();
		if (startDay.getDayOfMonth() < aux.getDayOfMonth() && startDay.getMonthValue() <= aux.getMonthValue()) {
			int time = aux.getYear() - startDay.getYear() - 1;
			return time;
		} else {
			int time = aux.getYear() - startDay.getYear();
			return time;
		}
	}
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", adress=" + adress + ", birthDay=" + birthDay + ", name=" + name + ", salary=" + salary + ", startDay=" + startDay + ", hability=" + hability;
	}
	
}
