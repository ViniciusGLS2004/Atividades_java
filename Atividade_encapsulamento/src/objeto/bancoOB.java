package objeto;

import java.util.Scanner;

import classe.bancoCL;

public class bancoOB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		bancoCL user = new bancoCL();
		char resposta;
		
		System.out.println("Imforme o seu nome de titular!");
		user.nome = input.nextLine();
		
		System.out.println("Imforme o seu numero de titular!");
		user.getNumero(input.nextDouble());
			
		System.out.println("Deseja fazer um deposito inicial? (s/n)");
		resposta = input.next().toUpperCase().charAt(0);
		
		
		if(resposta == 'S') {
			System.out.println("Quanto deseja depositar?");
			user.deposito = input.nextDouble();
			System.out.println("Voce tem " + user.Deposito() + " reais na sua conta");
		}
		else {
			System.out.println("Nenhum deposito foi adcionado na sua conta.");
			System.out.println("A sua conta tem " + user.saldoconta + " Reais");
			
		}
	
		System.out.println("faça um deposito!");
		user.deposito = input.nextDouble();
		
		System.out.println("A sua conta tem " + user.Deposito() + " Reais");
		
		System.out.println("Faça um saque!");
		user.saque = input.nextDouble();
		
		System.out.println("A sua conta tem " + user.Saque() + " Reais");
		
		if ( user.saldoconta < 0) {
			System.out.println("A sua conta esta negativa!");
		}
		else {
			System.out.println("A sua conta esta positiva!");
		}
		input.close();	
	}	
	
}
	