package Lista7;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o ano em que nasceu : ");
		int nascimento=sc.nextInt();
		
		System.out.println("Digite com quantos anos começou a trabalhar : ");
		int anos=sc.nextInt();
		
		System.out.println("Digite o ano atual :");
		int atual = sc.nextInt();
		
		anos = atual - anos;
		nascimento = atual - nascimento;
		
		if (nascimento >= 65 && anos >=30 || nascimento >=60 && anos>25) {
			System.out.println("Você possui : "+nascimento+ " anos");
			System.out.println("Seu tempo de serviço é : "+anos+ " anos trabalhados");
			System.out.println("Requer aposetadoria");
			} else {

				System.out.println("Sua idade é : "+nascimento+ " anos");
			System.out.println("Seu tempo de serviço é : "+anos+" anos trabalhados");
			System.out.println("Não requerer aposentadoria : ");
			
			}
		
		
	}

}
