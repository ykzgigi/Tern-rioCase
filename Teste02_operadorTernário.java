package curso_03;

import java.util.Scanner;

public class Teste02_operadorTernário {
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			String nome1 = "João";
			String nome2 = "Maria";
			System.out.println( nome1.equals(nome2) ? "Igual":"Diferente");
		}
	}
}