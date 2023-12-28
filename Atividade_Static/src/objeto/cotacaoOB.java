package objeto;

import java.util.Scanner;

import classe.cotacaoCL;

public class cotacaoOB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Imforme quantos dolares deseja comprar!");
		cotacaoCL.valorDolar = input.nextDouble();
		
		
		System.out.println("O valor gasto em reais pra a compra do dolar é: R$  " + cotacaoCL.DolarConvert() );
		input.close();
	}

}
