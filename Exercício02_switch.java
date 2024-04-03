package curso_03;

import java.util.Scanner;

public class Exercício02_switch {

	public static void main(String[] args) {

		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Informe o dia da semana: ");
			String dia = ler.next();

			switch (dia) {
			case ("domingo"):
				System.out.println("Dia 1");
			break;
			case ("segunda"):
				System.out.println("Dia 2");
			break;
			case ("terça"):
				System.out.println("Dia 3");
			break;
			case ("quarta"):
				System.out.println("Dia 4");
			break;
			case ("quinta"):
				System.out.println("Dia 5");
			break;
			case ("sexta"):
				System.out.println("Dia 6");
			break;
			case ("sábado"):
				System.out.println("Dia 7");
			break;

			default:
				System.out.println("Dia da semana inválido! informe algum dia válido.");

			}
		}
	}
}
