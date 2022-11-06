package Lista7;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a primeira nota : ");
		Float nota1=sc.nextFloat(); 
		
		
		System.out.println("Digite a segunda nota : ");
		Float nota2=sc.nextFloat();
		
		System.out.println("Digite a terceira nota : ");
		Float nota3=sc.nextFloat();
		
		System.out.println("Digite a média de exercicios : ");
		Float me=sc.nextFloat();
		Float ma= (nota1+(nota2*2)+(nota3*3)+me)/7;
		
		
		if(ma >=9.0) {
			System.out.println("Conceito A "+ma);
		}
		if(ma >= 7.5 &&  ma<9.0) {
			System.out.println("Conceito B "+ma);
		}
		if(ma >=6.0 && ma < 7.5) {
			System.out.println("Conceito C "+ma);
		}
		if(ma < 6.0) {
			System.out.println("Conceito D "+ma);
		}
		sc.close();

	}

}
