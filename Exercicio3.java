package Lista7;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String [] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor : ");
		int valor=sc.nextInt();
		System.out.println("Digite o segundo valor : ");
		int valor2=sc.nextInt();
		System.out.println("Digite o terceiro valor : ");
		int valor3=sc.nextInt();
		
	
		
		
		
		if (valor>valor2 && valor >valor3) {
			System.out.println("A dos dois maiores é de : "+valor+valor2);
		} 
		
		if (valor2>valor && valor2>valor3) {
			System.out.println("A dos dois maiores é de : "+valor2+valor);
		}
		
		if (valor3>valor2 && valor3>valor) {
			System.out.println("A dos dois maiores é de : "+valor3+valor);
		}
		if (valor3==valor2 && valor3==valor) {
			System.out.println("A dos dois maiores é de : "+valor3+valor2);
		}
		if (valor==valor2 && valor==valor3) {
			System.out.println("Números invalidos!");
		}
			if (valor2==valor3 && valor2==valor) {
				System.out.println("Números invalidos!");
	}
			if (valor3==valor && valor3==valor2) {
				System.out.println("Números invalidos!");
			}
	
	sc.close();
	}
}
