package projetoFarmaciaTrabalho1;

public class Spray extends Medicamento{
	private double volume;
	private boolean precisaDeAgitacao;
	private double mlPorBorrifada;
	public Spray(int id, String marca, String principioAtivo, Fornecedor fornecedor, String classe, double valor, double volume, boolean precisaDeAgitacao, double mlPorBorrifada) {
		super(id, marca, principioAtivo, fornecedor, classe, valor);
		setVolume(volume);
		setPrecisaDeAgitacao(precisaDeAgitacao);
		setMlPorBorrifada(mlPorBorrifada);
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		if (volume <= 0) {
			throw new IllegalArgumentException("Volume Inválido");
		} else {
			this.volume = volume;
		}
	}
	public boolean isPrecisaDeAgitacao() {
		return precisaDeAgitacao;
	}
	public void setPrecisaDeAgitacao(boolean precisaDeAgitacao) {
		this.precisaDeAgitacao = precisaDeAgitacao;
	}
	public double getMlPorBorrifada() {
		return mlPorBorrifada;
	}
	public void setMlPorBorrifada(double mlPorBorrifada) {
		if (mlPorBorrifada <= 0) {
			throw new IllegalArgumentException("Quantidade Inválida");
		} else {
			this.mlPorBorrifada = mlPorBorrifada;
		}
	}

	public String necessitaAgitar() {
		if (precisaDeAgitacao) {
			return "Agitando";
		} else {
			return "Não precisa agitar";
		}
	}
	
	
	public double limiteTotalDeBorrifadas() {
		double limite = volume / mlPorBorrifada;
		return limite;
	}
	
	
	@Override
	public boolean necessitaDeReceita() {
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nVolume: " + volume + "ml \nPrecisa de Agitação: " + precisaDeAgitacao + "\n Ml por Borrifada: " + mlPorBorrifada + "ml";
	}
}
