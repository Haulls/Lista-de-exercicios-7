package Lista7;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de X : ");
		int x = sc.nextInt();
		System.out.println("Digite o valor de Y : ");
		int y = sc.nextInt();
		
		int z = (x*y)+5;
		
		if (z<=0) {
			System.out.println("A resposta será 'A'");
		} else {

		}
		if(z <= 100) {
			System.out.println("A resposta será 'B'");
		}
		else {
			System.out.println("A resposta será 'C'");
		}
		
		
		
		
		
		
		sc.close();
	}
}
