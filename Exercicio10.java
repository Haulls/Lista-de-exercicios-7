package Lista7;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade da primeira mulher : ");
		int mulher=sc.nextInt();
		
		System.out.println("Digite a idade da segunda mulher : ");
		int mulher2=sc.nextInt();
		
		System.out.println("Digite a idade do primeiro homem : ");
		int homem=sc.nextInt();
		
		System.out.println("Digite a idade do segundo homem : ");
		int homem2=sc.nextInt();
		
		int soma;
		int mult;
		
		if (homem>homem2 && mulher>mulher2) {
			soma=homem+mulher2;
			 mult=homem2*mulher;
		}
		
		if (homem>homem2 && mulher2>mulher) {
		soma = homem+mulher;
		mult=homem2*mulher2;
		}
		
		if (homem2>homem && mulher>mulher2) {
			
			soma=homem2+mulher2;

			mult=homem*mulher;
		}
		else {
			soma=homem2+mulher;

			mult=homem*mulher2;
		}
		
		
		System.out.println(" As idades do homem mais velho com a mulher mais nova é de : "+soma);
		System.out.println("O produto das idades do homem mais novo com a mulher mais velha é de : "+mult);
		
		
		
		
		
		
		sc.close();
		
		

	}

}
