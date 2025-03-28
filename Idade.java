package exemplos;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Digite sua idade");
		double idade = Scanner.nextDouble();
		
		if (idade >= 1 && idade <= 12) {
			System.out.println("Criança");
		}else if (idade >= 13 && idade <= 17) {
			System.out.println("Adolecente");
		}else if (idade >= 18 && idade <= 60) {
			System.out.println("Adulto");
		}else if (idade >= 61 && idade <= 100) {
			System.out.println("Idose");
		}
	}
}
