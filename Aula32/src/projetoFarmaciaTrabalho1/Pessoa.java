package projetoFarmaciaTrabalho1;

public abstract class Pessoa {

	//variáveis
	private String nome;
	private Endereco endereco;
	
	//construtor
	public Pessoa(String nome, Endereco endereco) {
		setNome(nome);
		setEndereco(endereco);
	}

	
	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isBlank() || nome.isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser nulo.");
		}
		else {
			this.nome = nome;
		}
		
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
