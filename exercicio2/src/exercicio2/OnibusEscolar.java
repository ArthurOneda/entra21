package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class OnibusEscolar {
	int estudantes;
	int professores;
	public static List<OnibusEscolar> lista = new ArrayList<>();
	public OnibusEscolar(int estudantes, int professores) {
		setEstudantes(estudantes);
		setProfessores(professores);
		lista.add(this);
	}
	public int getEstudantes() {
		return estudantes;
	}
	public void setEstudantes(int estudantes) {
		if (estudantes > 40) {
			this.estudantes = 40;
		} else {
			this.estudantes = estudantes;
		}
	}
	public int getProfessores() {
		return professores;
	}
	public void setProfessores(int professores) {
		if (professores <= 0) {
			this.professores = 0;
			this.estudantes = 0;
		} else {
			this.professores = professores;
		}
	}
	public void remover(int numRem) {
		setEstudantes(estudantes - numRem);
	}
	@Override
	public String toString() {
		return "O ônibus tem " + getEstudantes() + " estudantes e " + getProfessores() + " professores";
	}
}
