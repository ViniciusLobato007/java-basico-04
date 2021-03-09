package exercicio04.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();

		app.start();
	}

	private void start() {

		System.out.print("Insira um valor desejado: ");
		Scanner scan = new Scanner(System.in);

		int count = 1;
		int valor = scan.nextInt();

//		---------------------------------------------------

		while (count <= 20) {
			System.out.println("Valor i = " + valor);
			count++;
		}

//		---------------------------------------------------
		count = 1;
		do {
			System.out.println("Valor k = " + valor);
			count++;
		} while (count <= 20);

//		---------------------------------------------------

		for (int i = 0; i <= 20; i++) {
			System.out.println("Valor j = " + valor);
		}

//		---------------------------------------------------

	}

}
