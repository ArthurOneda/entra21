package Aula18;

public class exercicio5 {

	public static void main(String[] args) {
		Mercado unidadeDeBlumenau = new Mercado(12, 5.50, 10, 4.50);
		Mercado unidadeDeJoinville = new Mercado(5, 7.50, 2, 5.50);
		Mercado unidadeDeFlorianopolis = new Mercado(10, 4.50, 8, 6.50);
		double somaMc = 0;
		double lcMc[] = new double[3];
		lcMc[0] = unidadeDeBlumenau.lucroMacas();
		lcMc[1] = unidadeDeJoinville.lucroMacas();
		lcMc[2] = unidadeDeFlorianopolis.lucroMacas();
		double lcMcMax = Integer.MIN_VALUE;
		String resp1 = "";
		for (int i = 0; i < lcMc.length; i++) {
			if (lcMc[i] > lcMcMax) {
				lcMcMax = lcMc[i];
				switch (i) {
				case 0:
					resp1 = "Blumenau";
					break;
				case 1:
					resp1 = "Joinville";
					break;
				case 2:
					resp1 = "Florianópolis";
					break;
				default:
					break;
				}
			}
			somaMc += lcMc[i];
		}
		double somaLa = 0;
		double lcLa[] = new double[3];
		lcLa[0] = unidadeDeBlumenau.lucroLaranjas();
		lcLa[1] = unidadeDeJoinville.lucroLaranjas();
		lcLa[2] = unidadeDeFlorianopolis.lucroLaranjas();
		double lcLaMax = Integer.MIN_VALUE;
		String resp2 = "";
		for (int i = 0; i < lcLa.length; i++) {
			if (lcLa[i] > lcLaMax) {
				lcLaMax = lcLa[i];
				switch (i) {
				case 0:
					resp2 = "Blumenau";
					break;
				case 1:
					resp2 = "Joinville";
					break;
				case 2:
					resp2 = "Florianópolis";
					break;
				default:
					break;
				}
				somaLa += lcLa[i];
			}
		}
		double lucro[] = new double[3];
		lucro[0] = unidadeDeBlumenau.lucroTotal();
		lucro[1] = unidadeDeJoinville.lucroTotal();
		lucro[2] = unidadeDeFlorianopolis.lucroTotal();
		double lucroMax = Integer.MIN_VALUE;
		double lucroMin = Integer.MAX_VALUE;
		double meio = 0;
		String resp3 = "";
		String resp4 = "";
		String resp5 = "";
		for (int i = 0; i < lucro.length; i++) {
			if (lucro[i] > lucroMax) {
				lucroMax = lucro[i];
				switch (i) {
				case 0:
					resp3 = "Blumenau";
					break;
				case 1:
					resp3 = "Joinville";
					break;
				case 2:
					resp3 = "Florianópolis";
					break;
				default:
					break;
				}
			}
			if (lucro[i] < lucroMin) {
				lucroMin = lucro[i];
				switch (i) {
				case 0:
					resp4 = "Blumenau";
					break;
				case 1:
					resp4 = "Joinville";
					break;
				case 2:
					resp4 = "Florianópolis";
					break;
				default:
					break;
				}
			}
			if (lucro[i] > lucroMin && lucro[i] < lucroMax) {
				meio = lucro[i];
				switch (i) {
				case 0:
					resp5 = "Blumenau";
					break;
				case 1:
					resp5 = "Joinville";
					break;
				case 2:
					resp5 = "Florianópolis";
					break;
				default:
					break;
				}
			}
		}
		String resp6 = "";
		if (somaMc > somaLa) {
			resp6 = "As unidades tiveram maior lucro vendendo maçãs";
		} else {
			resp6 = "As unidades tiveram maior lucro vendendo laranjas";
		}
		System.out.println("A unidade com maior lucro vendendo maçãs foi a de " + resp1);
		System.out.println("A unidade com maior lucro vendendo laranjas foi a de " + resp2);
		System.out.println("A unidade com maior lucro nesse ano foi a de " + resp3);
		System.out.println("A unidade com menor lucro foi a de " + resp4);
		System.out.println("A unidade que ficou entre as outras foi a de " + resp5);
		System.out.println(resp6);
	}

}
