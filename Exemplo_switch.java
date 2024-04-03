package curso_03;

import java.util.Scanner;

public class Exemplo_switch {

	public static void main(String[] args) {

		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Escolha um número de 1 à 3:");
			int numero = ler.nextInt();

			switch (numero) {
			case 1:
				System.out.println("O número escolhido foi o 1");
				break;
			case 2:
				System.out.println("O número escolhido foi o 2");
				break;
			case 3:
				System.out.println("O número escolhido foi o 3");
				break;

			default:
				System.out.println("O número digitado é inválido! digite um número entre 1 a 3.");
			}
		}
	}

}
