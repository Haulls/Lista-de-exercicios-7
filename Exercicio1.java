package Lista7;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args)	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número : ");
		int valor = sc.nextInt();
		
		if (valor > 0) {
			System.out.println("Número Positivo!");
		} if (valor < 0){
		System.out.println("Número Negativo!");
			}
		if (valor == 0) {
			System.out.println("Zero");
		}
		sc.close();
	}
}
