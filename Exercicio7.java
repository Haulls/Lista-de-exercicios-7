package Lista7;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor :");
		int valor=sc.nextInt();
		System.out.println("Digite outro valor : ");
		int valor2=sc.nextInt();
		
		if (valor==valor2) {
			System.out.println("Números Iguais");
		}  if (valor>valor2){
			System.out.println("Primeiro é maior");
		}
		if (valor<valor2) {
			System.out.println("Segundo é maior");
		}
	
	
	
	
	sc.close();
	}

}
