package exercicio5;

import java.time.LocalDate;
import java.util.List;

public class Empregado extends Funcionario{
	private String idE;
	private Gerente manager;
	public Empregado(String id, Endereco adress, LocalDate birthDay, String name, double salary, LocalDate startDay, List<String> hability, String idE, Gerente manager) {
		super(id, adress, birthDay, name, salary, startDay, hability);
		this.idE = idE;
		this.manager = manager;
	}
	public String getIdE() {
		return idE;
	}
	public void setIdE(String idE) {
		if (idE != null) {
			this.idE = idE;
		}
	}
	public Gerente getManager() {
		return manager;
	}
	public void setManager(Gerente manager) {
		this.manager = manager;
	}
	public void getOutSyndicate() {
		this.idE = null;
	}
	public void commision(double com) {
		setSalary(getSalary() + (com * 0.05));
	}
	@Override
	public String toString() {
		return super.toString() + ", idE=" + idE + ", manager=" + manager.getId() + "]";
	}
	
}
