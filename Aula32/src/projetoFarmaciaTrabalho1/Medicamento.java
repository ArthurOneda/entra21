package projetoFarmaciaTrabalho1;

public abstract class Medicamento {

	// variaveis
	private int id;
	private String marca;
	private String principioAtivo;
	private Fornecedor fornecedor;
	private String classeDoMedicamento;
	private double valor;

	// construtor
	public Medicamento(int id, String marca, String principioAtivo, Fornecedor fornecedor, String classeDoMedicamento,
			double valor) {
		setId(id);
		setMarca(marca);
		setPrincipioAtivo(principioAtivo);
		setFornecedor(fornecedor);
		setClasseDoMedicamento(classeDoMedicamento);
		setValor(valor);
	}

	// getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id <= 0) {
			throw new IllegalArgumentException("Id não deve ser nulo.");
		} else {
			this.id = id;
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isBlank() || marca.isEmpty()) {
			throw new IllegalArgumentException("Marca não deve ser nula.");
		} else {
			this.marca = marca;
		}
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		if (principioAtivo == null || principioAtivo.isBlank() || principioAtivo.isEmpty()) {
			throw new IllegalArgumentException("Princípio Ativo Inválido");
		} else {
			this.principioAtivo = principioAtivo;
		}
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		if (fornecedor == null) {
			throw new IllegalArgumentException("O fornecedor não pode ser nulo.");
		} else {
			this.fornecedor = fornecedor;
		}

	}

	public String getClasseDoMedicamento() {
		return classeDoMedicamento;
	}

	public void setClasseDoMedicamento(String classeDoMedicamento) {
		if (classeDoMedicamento == null || classeDoMedicamento.isBlank() || classeDoMedicamento.isEmpty()) {
			throw new IllegalArgumentException("Classe não pode ser nula.");
		} else {
			this.classeDoMedicamento = classeDoMedicamento;
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor deve ser maior do que 0.");
		} else {
			this.valor = valor;
		}
	}

	// metodo abstrato
	public abstract boolean necessitaDeReceita();

	// toString
	@Override
	public String toString() {
		return "Id: " + id + "\nMarca: " + marca + "\nPrincípio Ativo: " + principioAtivo + "\nClasse do medicamento: "
				+ classeDoMedicamento + "\nValor: " + valor + "\nNome do Fornecedor: " + fornecedor.getNome();
	}
}
