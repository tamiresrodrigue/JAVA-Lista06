package exemplos;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Digite uma nota de 0 á 100:");
		double nota = Scanner.nextDouble();
		
		if (nota >= 80 && nota <= 100) {
			System.out.println("Classificação: A");
		}else if (nota >= 60 && nota <= 80) {
			System.out.println("Classificação: B");
		}else if (nota >= 40  && nota <= 60) {
			System.out.println("Classificação: C");
		}else if (nota >= 20 && nota <= 40) {
			System.out.println("Classificação: D");
		}else if (nota >= 0 && nota <= 20) {
			System.out.println("Classificação: F");
		}Scanner.close();
	}
}
