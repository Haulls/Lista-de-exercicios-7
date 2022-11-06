package Lista7;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Float desconto;
		String nomeString;
		System.out.println("Digite o nome do produto : ");
		nomeString=sc.next();
		
		System.out.println("Digite a quantidade adquirida : ");
		int quantidade=sc.nextInt();
		
		System.out.println("Digite o preço unitário : ");
		Float preço=sc.nextFloat();
		
	Float total = quantidade*preço;
		
	if(quantidade<=5) {
		 desconto = 2f;
	}
	
		if(quantidade<=10) {
			 desconto = 3f;
		}
		else {
			desconto=5f;
		}
		
		total = total-(total*(desconto/100));
		
		System.out.println("O valor total a pagar é : "+total);
		
		
		sc.close();
		
		
		
	}

}
