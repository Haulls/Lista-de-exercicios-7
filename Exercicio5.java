package Lista7;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite o valor do lado A : ");
		int ladoA = sc.nextInt();
		
		System.out.println("Digite o valor do lado B : ");
		int ladoB = sc.nextInt();
		
		System.out.println("Digite o valor do lado C : ");
		int ladoC = sc.nextInt();
		
		 if (ladoA<ladoB+ladoC) {
			 System.out.println("O triângulo existe.");
		 } else {
					System.out.println("O triângulo não existe.");
				}
			 
			 if (ladoB<ladoA+ladoC) {
				 System.out.println("O triângulo existe.");
			 } else {
					System.out.println("O triângulo não existe.");
				}
            	 
            	 if (ladoC<ladoA+ladoB) {
                     System.out.println("O triângulo existe.");
                 } else {
     				System.out.println("O triângulo não existe.");
     			}
            
     			
		sc.close();

	}

		 
	}

