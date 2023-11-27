package exercicio2;

public class AlunoEtevi extends Aluno{
	private int year;
	public AlunoEtevi(String name, int age, int year) {
		super(name, age);
		setYear(year);
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return super.toString() + ", Year = " + year;
	}
}
