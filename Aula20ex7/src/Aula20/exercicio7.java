package Aula20;

public class exercicio7 {

	public static void main(String[] args) {
		Aviao av1 = new Aviao(150, 700, 550, 5);
		Aviao av2 = new Aviao(200, 700, 400, 4);
		Aviao av3 = new Aviao(120, 700, 300, 3);
		Aviao av4 = new Aviao(140, 2000, 200, 2);
		double tempAr[] = new double[4];
		tempAr[0] = av1.tempAr();
		tempAr[1] = av2.tempAr();
		tempAr[2] = av3.tempAr();
		tempAr[3] = av4.tempAr();
		String resp1 = "";
		double maxTemp = 0;
		for (int i = 0; i < tempAr.length; i++) {
			if (tempAr[i] > maxTemp) {
				maxTemp = tempAr[i];
				switch (i) {
				case 0:
					resp1 = "Avião 1";
					break;
				case 1:
					resp1 = "Avião 2";
					break;
				case 2:
					resp1 = "Avião 3";
					break;
				case 3:
					resp1 = "Avião 4";
					break;
				default:
					break;
				}
			}
		}
		int maxPass = 0;
		int numPass[] = new int[4];
		numPass[0] = av1.passageiros;
		numPass[1] = av2.passageiros;
		numPass[2] = av3.passageiros;
		numPass[3] = av4.passageiros;
		String resp2 = "";
		for (int i = 0; i < numPass.length; i++) {
			if (numPass[i] > maxPass) {
				maxPass = numPass[i];
				switch (i) {
				case 0:
					resp2 = "Avião 1";
					break;
				case 1:
					resp2 = "Avião 2";
					break;
				case 2:
					resp2 = "Avião 3";
					break;
				case 3:
					resp2 = "Avião 4";
					break;
				default:
					break;
				}
			}
		}
		double maxDist = 0;
		double dist[] = new double[4];
		dist[0] = av1.distancia();
		dist[1] = av2.distancia();
		dist[2] = av3.distancia();
		dist[3] = av4.distancia();
		String resp3 = "";
		for (int i = 0; i < dist.length; i++) {
			if (dist[i] > maxDist) {
				maxDist = dist[i];
				switch (i) {
				case 0:
					resp3 = "Avião 1";
					break;
				case 1:
					resp3 = "Avião 2";
					break;
				case 2:
					resp3 = "Avião 3";
					break;
				case 3:
					resp3 = "Avião 4";
					break;
				default:
					break;
				}
			}
		}
		System.out.println("O avião que permanece mais tempo no ar é o " + resp1);
		System.out.println("O avião que tem maior número de passageiros é o  " + resp2);
		System.out.println("O avião que percorre uma maior distância é o " + resp3);
	}

}
