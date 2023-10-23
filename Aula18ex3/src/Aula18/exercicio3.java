package Aula18;

public class exercicio3 {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		
		p1.nome = "Caderno";
		p1.descricao = "Caderno em espiral tamanho médio";
		p1.precoU = 4.50;
		p1.desc = 0.15;
		
		p2.nome = "Caneta ESF";
		p2.descricao = "Caneta esferográfica 5mm";
		p2.precoU = 1.20;
		p2.desc = 0.02;
		
		p3.nome = "Esquadro";
		p3.descricao = "Esquadro de acrílico 20cm";
		p3.precoU = 2.35;
		p3.desc = 0.10;
	}

}
