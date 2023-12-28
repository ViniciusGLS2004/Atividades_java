package objeto;

import java.util.Scanner;

import classe.retanguloCL;

public class retanguloOB {

	public static void main(String[] args) {
		Scanner ge = new Scanner (System.in);
		retanguloCL produto = new retanguloCL();		
	
		System.out.println("Digite a largura do retangulo:");
		produto.largura = ge.nextDouble();
		System.out.println("digite a altura do retangulo:");
		produto.altura = ge.nextDouble();
		System.out.println("imforme a base do retangulo");
		produto.base = ge.nextDouble();

		
		
		System.out.printf("larura do retangulo: %.1fcm²\n", produto.largura);
		System.out.printf("altura do retangulo: %.1fcm²\n ", produto.altura);
		System.out.printf(" Area do retangulo: %.1fcm²\n", produto.Area());
		System.out.printf("Perimetro do retangulo: %.2fcm²\n", produto.Perimetro());
		System.out.printf("Diametro do retangulo: %.2fcm²\n", produto.Diametro());
		ge.close();
		
		
		
		
		
		
		
		
		
	}

}
