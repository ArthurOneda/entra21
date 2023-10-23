package Aula16;

import java.text.DecimalFormat;

public class exemplo1 {

	public static void nome() {
		String nome = "Arthur";
		int idd = 17;
		String cor = "Laranja";
		System.out.println("Nome: " + nome + "\nIdade: " + idd + "\nCor favorita: " + cor);
	}
	public static void soma() {
		int num1 = 10;
		int num2 = 100;
		System.out.println("Soma: " + (num1 + num2));
	}
	public static void mult() {
		int num1 = 10;
		int num2 = 100;
		System.out.println("Multiplicação: " + (num1 * num2));
	}
	public static void alt() {
		DecimalFormat formatar = new DecimalFormat("0.00");
		double alt1 = 1.76;
		double alt2 = 1.67;
		double media = (alt1 + alt2) / 2;
		System.out.println("Altura do Gui: " + alt1 + "\nAltura do Ademini: " + alt2 + "\nMédia: " + formatar.format(media));
	}
	//Metodo com parametro
	public static void metPara(String nome) {
		//Não posso criar uma variável com o mesmo nome da variável dentro do parametro
		System.out.println("Meu nome: " + nome);
	}
	//Um metodo pode ter múltiplos parametros exemplo(String nome, int num, double media)
	public static void metMultPara(int idd1, int idd2, String texto) {
		System.out.println("A soma das idades: " + (idd1 + idd2));
		System.out.println("E o texto: " + texto);
	}
	public static void soma2(int num1, int num2) {
		System.out.println("Soma: " + (num1 + num2));
	}
	public static void main(String[] args) {
		//nome();
		//soma();
		//mult();
		//alt();
		//Nome do metodo(valor da variável);
		//String nome = "Arthur";
		//metPara(nome);
		//metPara("Arthur");
		//Pode chamar várias vezes um metodo
		//Na hora de preecher os dados a ordem influencia
		//metMultPara(15, 20, "oi meus bacanos");
		soma2(10, 1);
	}

}
