package exemplo;
//Tudo que eu tenho na classe pai eu consigo usar no filho
public class Aviao extends Veiculo{
	int numMotores;
	int numAsas;
	public Aviao(String modelo, double peso, double comprimento, double velMax, int passageiros) {
		super(modelo, peso, comprimento, velMax, passageiros);
		this.numAsas = numAsas;
		this.numMotores = numMotores;
	}
}
