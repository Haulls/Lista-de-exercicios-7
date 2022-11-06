package Lista7;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String combustivel;
		
		
		
		
		Float Alcool;
		Float gasolina=3.30f;
			
		
		
		System.out.println("Tipo de combustivel : ");
		System.out.println(" 1 - Alcool");
		System.out.println(" 2 - Gasolina");
		combustivel=sc.next();
		
		
		
		System.out.println("Digite quantos litros você quer reabastecer : ");
		int litros=sc.nextInt();
		
		
		Float custo = null;

		
		if (combustivel == "1") {
		 
			Alcool = 3.5f;
			 custo = litros*gasolina;
		
		}
		if (litros <= 20) {
			
			Float desconto1 = (custo*3)/100;
			System.out.println("O desconto do alcool será de : "+desconto1);
			}
		if (litros >20) {
			Float desconto2 = (custo*5)/100;
			System.out.println("O desconto do alcool será de : "+desconto2);
		}
		
		if (combustivel == "G") {
			gasolina = 4.6f;
			 custo = litros*gasolina;
			if (litros <= 20) {
				Float desconto3 = (custo*4)/100;
				System.out.println("O desconto do combustivel é de "+desconto3);
			}
			if (litros>20) {
				Float desconto4=(custo*6)/100;
				System.out.println("O desconto do combustivel vai ser de : "+desconto4 );
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
