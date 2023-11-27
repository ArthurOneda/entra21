package projetoFarmaciaTrabalho1;

import java.util.ArrayList;

public class Fornecedor extends Pessoa {

	// variaveis
	String cnpj;
	ArrayList<String> principiosAtivosTrabalhados = new ArrayList<String>();

	// construtor
	public Fornecedor(String nome, Endereco endereco) {
		super(nome, endereco);
		setCnpj(cnpj);
		setPrincipiosAtivosTrabalhados(principiosAtivosTrabalhados);

	}

	public ArrayList<String> getPrincipiosAtivosTrabalhados() {
		return principiosAtivosTrabalhados;
	}

	public void setPrincipiosAtivosTrabalhados(ArrayList<String> principiosAtivosTrabalhados) {
		this.principiosAtivosTrabalhados = principiosAtivosTrabalhados;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (cnpj == null || cnpj.isBlank() || cnpj.isEmpty() || cnpj.length() != 11) {
			throw new IllegalArgumentException("Digite um valor válido");
		} else {
			this.cnpj = cnpj;
		}

	}

	public void addPrincipioAtivo(String principioAtivoAdicionado) {
		principiosAtivosTrabalhados.add(principioAtivoAdicionado);
	}

	public void excluirPrincipioAtivo(String excluirPrincipioAtivo) {
		principiosAtivosTrabalhados.remove(excluirPrincipioAtivo);
	}

}
