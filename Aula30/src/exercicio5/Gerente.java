package exercicio5;

import java.time.LocalDate;
import java.util.List;

public class Gerente extends Funcionario{
	private String idG;

	public Gerente(String id, Endereco adress, LocalDate birthDay, String name, double salary, LocalDate startDay, List<String> hability, String idG) {
		super(id, adress, birthDay, name, salary, startDay, hability);
		setIdG(idG);
	}
	public String getIdG() {
		return idG;
	}
	public void setIdG(String idG) {
		this.idG = idG;
	}
	public void fire(Empregado idE) {
		if (this.idG.equals(idE.getManager().getIdG())) {
			idE.setId("Fired");
		}
	}
	@Override
	public String toString() {
		return super.toString() + ", idG=" + idG + "]";
	}
	
}
