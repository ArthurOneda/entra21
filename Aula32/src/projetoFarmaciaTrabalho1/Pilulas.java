package projetoFarmaciaTrabalho1;

public class Pilulas extends Medicamento {

	// variaveis
	private int qtdPorCaixa;
	private double qtdDePilulasIngeridasPorDia;
	private String tarja;

	// construtor
	public Pilulas(int id, String marca, String principioAtivo, Fornecedor fornecedor, String classeDoMedicamento,
			double valor, int qtdPorCaixa, double qtdDePilulasIngeridasPorDia, String tarja) {
		super(id, marca, principioAtivo, fornecedor, classeDoMedicamento, valor);
		setQtdPorCaixa(qtdPorCaixa);
		setQtdDePilulasIngeridasPorDia(qtdDePilulasIngeridasPorDia);
		setTarja(tarja);
	}

	// getters e setters

	public int getQtdPorCaixa() {
		return qtdPorCaixa;
	}

	public void setQtdPorCaixa(int qtdPorCaixa) {
		if (qtdPorCaixa <= 0) {
			throw new IllegalArgumentException("A quantidade de pílulas por caixa deve ser maior que 0");
		} else {
			this.qtdPorCaixa = qtdPorCaixa;
		}

	}

	public double getQtdDePilulasIngeridasPorDia() {
		return qtdDePilulasIngeridasPorDia;
	}

	public void setQtdDePilulasIngeridasPorDia(double qtdDePilulasIngeridasPorDia) {

		if (qtdDePilulasIngeridasPorDia <= 0) {
			throw new IllegalArgumentException("A quantidade de pílulas ingeridas por dia deve ser maior que 0");
		} else {
			this.qtdDePilulasIngeridasPorDia = qtdDePilulasIngeridasPorDia;
		}

	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		if (!tarja.equalsIgnoreCase("preta") || !tarja.equalsIgnoreCase("vermelha")
				|| !tarja.equalsIgnoreCase("branca")) {
			throw new IllegalArgumentException("Tarja inválida.");
		} else {
			this.tarja = tarja;
		}

	}

// métodos--------------------------------------------------------------------------------

	@Override
	public boolean necessitaDeReceita() {
		if (!tarja.equalsIgnoreCase("Branca")) {
			return true;
		} else {
			return false;
		}
	}

	public double diasParaTerminarACaixa() {
		double diasParaTerminarACaixa = qtdPorCaixa / qtdDePilulasIngeridasPorDia;
		return diasParaTerminarACaixa;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Quantidade por Caixa: " + qtdPorCaixa + "\nQuantidade Ingerida por Dia: " + qtdDePilulasIngeridasPorDia + "\nTarja: " + tarja;
	}

}
