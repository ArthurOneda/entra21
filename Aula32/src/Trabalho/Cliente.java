package Trabalho;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Pessoa{
	// variaveis
		private int id;
		private String cpf;
		private LocalDate dataDeCadastro;
		private LocalDate dataDeNascimento;
		private ArrayList<String> receita;

		// construtor
		public Cliente(String nome, Endereco endereco, int id, String cpf, LocalDate dataDeCadastro, LocalDate dataDeNascimento, ArrayList<String> receita) {
			super(nome, endereco);
			setId(id);
			setCpf(cpf);
			setDataDeCadastro(dataDeCadastro);
			setDataDeNascimento(dataDeNascimento);
			setReceita(receita);

		}

	// getters e setters
		
		public ArrayList<String> getReceita() {
			return receita;
		}

		public void setReceita(ArrayList<String> receita) {
			this.receita = receita;
		}

		public int getId() {
			return id;
		}



		public void setId(int id) {
			if (id <= 0) {
				throw new IllegalArgumentException("ID não pode ser nulo.");
			} else {
				this.id = id;
			}

		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			if (cpf == null || cpf.isBlank() || cpf.isEmpty()) {
				throw new IllegalArgumentException("CPF não pode ser nulo.");
			} else {
				this.cpf = cpf;
			}

		}

		public LocalDate getDataDeCadastro() {
			return dataDeCadastro;
		}

		public void setDataDeCadastro(LocalDate dataDeCadastro) {

			if (dataDeCadastro == null) {
				throw new IllegalArgumentException("Data de cadastro não pode ser nula.");
			} else {
				this.dataDeCadastro = dataDeCadastro;
			}

		}

		public LocalDate getDataDeNascimento() {
			return dataDeNascimento;
		}

		public void setDataDeNascimento(LocalDate dataDeNascimento) {
			if (dataDeNascimento == null) {
				throw new IllegalArgumentException("Data de nascimento não pode ser nula.");
			} else {
				this.dataDeNascimento = dataDeNascimento;
			}

		}
}
