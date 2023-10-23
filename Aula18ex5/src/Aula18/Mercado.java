package Aula18;

public class Mercado {
	private int numMcAno;
	private double valMc;
	private int numLaAno;
	private double valLa;
	//this serve para enviar o valor recebido pelo parâmetro para a variavel
	public Mercado(int numMcAno, double valMc, int numLaAno, double valLa) {
		setNumMcAno(numMcAno);
		setValMc(valMc);
		setNumLaAno(numLaAno);
		setValLa(valLa);
	}
	public int getNumMcAno() {
		return numMcAno;
	}


	public void setNumMcAno(int numMcAno) {
		if (numMcAno < 0) {
			System.out.println("Erro, valor inapropriado");
		} else {
			this.numMcAno = numMcAno;
		}
	}


	public double getValMc() {
		return valMc;
	}


	public void setValMc(double valMc) {
		if (valMc < 0) {
			System.out.println("Erro, valor inapropriado");
		} else {
			this.valMc = valMc;
		}
	}

	public int getNumLaAno() {
		return numLaAno;
	}


	public void setNumLaAno(int numLaAno) {
		if (numLaAno < 0) {
			System.out.println("Erro, valor inapropriado");
		} else {
			this.numLaAno = numLaAno;
		}
	}


	public double getValLa() {
		return valLa;
	}


	public void setValLa(double valLa) {
		if (valLa < 0) {
			System.out.println("Erro, valor inapropriado");
		} else {
			this.valLa = valLa;
		}
	}
	
	
	public double lucroMacas() {
		return numMcAno * valMc;
	}
	public double lucroLaranjas() {
		return numLaAno * valLa;
	}
	public double lucroTotal() {
		return lucroMacas() + lucroLaranjas();
	}
}
