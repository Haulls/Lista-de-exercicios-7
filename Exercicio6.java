package Lista7;

import java.util.Scanner;

public class Exercicio6 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("Digite o número de gols que o Palmeiras fez : ");
		 int palmeiras=sc.nextInt();
		 
		 
		 System.out.println("Digite o número de gols que o São Paulo fez :   ");
		 int sãopaulo=sc.nextInt();
		 
		 if (palmeiras==sãopaulo) {
			System.out.println("Empate");
		}
		 if(palmeiras>sãopaulo) {
			 System.out.println("Palmeiras venceu!");
		 }
		 if(sãopaulo>palmeiras) {
			 System.out.println("São Paulo venceu!");
		 }
		 
		 
		 
		 sc.close();
	 }
}	
