package curso_03;

import java.util.Scanner;

public class Atividade01_OperadorTernário {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double n1,n2,n3,n4,media;
			
			System.out.println("Informe a primeira nota: ");
			n1 = ler.nextDouble();
			
			System.out.println("Informe a segunda nota: ");
			n2 = ler.nextDouble();
			
			System.out.println("Informe a terceira nota: ");
			n3 = ler.nextDouble();
			
			System.out.println("Informe a quarta nota: ");
			n4 = ler.nextDouble();
			
			media = (n1+n2+n3+n4)/4;
		
		String mensagem = media >= 6 ? "Aprovado" :"Reprovado";
				System.out.println(mensagem);
		

		}
	}
}
