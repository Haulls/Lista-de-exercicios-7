package Lista7;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Float precomorango;
		Float precomaca;
		Float precototal;

		System.out.println("Digite a quantidade de morangos Kg : ");
		int morangos = sc.nextInt();
		if (morangos > 5) {
			precomorango = morangos * 2.5f;
		} else {
			precomorango = morangos * 2.20f;
		}

		System.out.println("Digite a quantidade de maçãs Kg : ");
		int maca = sc.nextInt();
		if (maca > 5) {
			precomaca = maca * 1.80f;

		} else {
			precomaca = maca * 1.50f;
		}

		if ((precomaca + precomorango) < 25) {
			precototal = precomaca + precomorango;
		} else {
			precototal = (float) (precomaca + precomorango - ((precomaca + precomorango) * 0.1));
		}

		System.out.println("O total a ser pago é : " + precototal);

		sc.close();

	}

}
