package Lista7;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do usuario : ");
		int codigo=sc.nextInt();
		
		if(codigo==1234) {
			System.out.println("Usuário invalido ");
		}
		
		System.out.println("Digite a senha :");	
		int senha=sc.nextInt();
		if (senha==9999) {
			System.out.println("Acesso Permitido!");
		}
		else {
			System.out.println("Acesso Negado!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}