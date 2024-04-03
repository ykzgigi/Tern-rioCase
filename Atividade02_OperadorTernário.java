package curso_03;

import java.util.Scanner;

public class Atividade02_OperadorTernário {

	public static void main(String[] args) {
		double valor;
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Informe o valor: ");
			valor = ler.nextDouble();
		}
		String mensagem = valor % 5 == 0 ? "O número inserido é múltiplo de 5" : "O número inserido não é múltiplo de 5";
		System.out.println(mensagem);
		
		
	}

}
