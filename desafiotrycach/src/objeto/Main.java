package objeto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int var1;
		int var2;
		int varT;
		String opcao;
		do {
		try {
			System.out.println("Divisão com try cach");
			System.out.println("Digite o primeiro valor");
			var1 = sc.nextInt();
			
			System.out.println("Digite o segundo valor");
			var2 = sc.nextInt();
			
			varT = var1 / var2;
			System.out.println("Resultado: "+ varT);
		}
		catch(ArithmeticException e) {
			System.out.println("Não é recomendado dividir um numero por zero!");
		}
		 finally {
		      System.out.println("Bloco Finally.");
		 } 
		
		
	System.out.println("Deseja refazer a divisão?(Sim/nao)");
	opcao = sc.next().toUpperCase();
	sc.close();


		 }while(opcao.equals("SIM"));
		System.out.println("Divisão encerrada!");
	
}
}

