package Trabalho;

public abstract class Remedio {
	private int id;
	private String marca;
	private String principioAtivo;
	private Fornecedor fornecedor;
	private String classe;
	private double valor;
	public Remedio(int id, String marca, String principioAtivo, Fornecedor fornecedor, String classe, double valor) {
		setClasse(classe);
		setFornecedor(fornecedor);
		setId(id);
		setMarca(marca);
		setPrincipioAtivo(principioAtivo);
		setValor(valor);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id <= 0) {
			throw new IllegalArgumentException("Id Remédio Inválido");
		} else {
			this.id = id;
		}
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca == null || marca.isBlank()) {
			throw new IllegalArgumentException("Marca Inválida");
		} else {
			this.marca = marca;
		}
	}
	public String getPrincipioAtivo() {
		return principioAtivo;
	}
	public void setPrincipioAtivo(String principioAtivo) {
		if (principioAtivo == null || principioAtivo.isBlank()) {
			throw new IllegalArgumentException("Princípio Ativo Inválido");
		} else {
			this.principioAtivo = principioAtivo;
		}
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		if (classe == null || classe.isBlank()) {
			throw new IllegalArgumentException("Classe Inválida");
		} else {
			this.classe = classe;
		}
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor Inválido");
		} else {
			this.valor = valor;
		}
	}
	public abstract int tomarEmQuantoTempo();
}
