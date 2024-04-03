package curso_03;

import java.util.Scanner;

public class Atividade03_If_Else {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double salario,tempo,bonus1,bonus2;
			System.out.println("Informe seu salário: ");
			salario = ler.nextDouble();

			System.out.println("Informe o tempo de trabalho na empresa: ");
			tempo = ler.nextDouble();

			bonus1 = (salario * 0.05);
			bonus2 = (salario * 0.07);

			if (tempo <= 3) {
				System.out.println("Seu bônus é: " + bonus1);
			}

			else {
				System.out.println("Seu bônus é: " + bonus2);

			}
		}
	}
}