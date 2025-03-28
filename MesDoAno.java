package exemplos;

import java.util.Scanner;

public class MesDoAno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um mês do ano");
		int mês = sc.nextInt();
		if(mês ==1) {
			System.out.println("Janeiro");
		}else if(mês ==2) {
			System.out.println("Fevereiro");
        }else if(mês ==3) {
			System.out.println("Março");
        }else if(mês ==4) {
			System.out.println("Abril");
        }else if(mês ==5) {
			System.out.println("Maio");
        }else if(mês ==6) {
			System.out.println("Junho");
        }else if(mês ==7) {
			System.out.println("Julho");
        }else if(mês ==8) {
			System.out.println("Agosto");
        }else if(mês ==9) {
			System.out.println("Setembro");
        }else if(mês ==10) {
			System.out.println("Outubro");
        }else if(mês ==11) {
			System.out.println("Novembro");
        }else if(mês ==12) {
			System.out.println("Dezembro");
        }sc.close();
}
}
