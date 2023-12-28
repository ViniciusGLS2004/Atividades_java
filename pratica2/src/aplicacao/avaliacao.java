package aplicacao;

import java.util.Scanner;

import Util.CalcularNotas;

public class avaliacao {

	public static void main(String[] args) {
		Scanner av = new Scanner(System.in);
		double n1, n2;
		
		System.out.println("Digite a sua primeira nota:");
		n1 = av.nextDouble();
		System.out.println("Digite a sua segunda nota:");
		n2 = av.nextDouble();
		CalcularNotas.Calcular_AV3(n1, n2);
		av.close();
	}

}
