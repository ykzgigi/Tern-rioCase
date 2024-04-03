package curso_03;

import java.util.Scanner;

public class Teste_operador_ternário {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Informe sua idade:");
			int idade = ler.nextInt();

			String mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";
			System.out.println(mensagem); // imprime "Maior de idade"
		}

	}

}


