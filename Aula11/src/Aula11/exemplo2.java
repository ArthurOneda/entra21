package Aula11;

public class exemplo2 {

	public static void main(String[] args) {
		double[][] matriz = new double[3][2];
		matriz[0][0] = 1.76;
		matriz[0][1] = 9;
		matriz[1][0] = 1.87;
		matriz[1][1] = 12;
		matriz[2][0] = 1.93;
		matriz[2][1] = 18;
		double calc = (matriz[0][0] + matriz[1][0] + matriz[2][0]) / 3;
		System.out.println(calc);
	}

}
