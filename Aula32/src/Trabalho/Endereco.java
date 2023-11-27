package Trabalho;

public class Endereco {
		//variaveis
		private String estado;
		private String cidade;
		private String logradouro;
		private int numero;

		//construtor
		public Endereco(String estado, String cidade, String logradouro, int numero) {

			setEstado(estado);
			setCidade(cidade);
			setLogradouro(logradouro);
			setNumero(numero);

		}

		// getters e setters
		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}
}
