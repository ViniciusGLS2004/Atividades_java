package objeto;

import java.util.Scanner;

import classe.CalculadoraImpl;

public class Main {

	public static void main(String[] args) {
		CalculadoraImpl conta = new CalculadoraImpl();
		Scanner input = new Scanner(System.in);

		char opcao;

		System.out.println("CALCULADORA!");
		System.out.println("Insira o primeiro valor!");
		conta.var1 = input.nextDouble();
		System.out.println("Insira a operação desejada (+,-,*,/,%)");
		opcao = input.next().charAt(0);
		System.out.println("Insira o segundo valor!");
		conta.var2 = input.nextDouble();

		switch (opcao) {
		case '+':
			conta.soma();
			System.out.println("Reasulrado: " + conta.varT);
			break;
		case '-':
			conta.subtrai();
			System.out.println("Reasulrado: " + conta.varT);
			break;
		case '*':
			conta.multiplica();
			System.out.println("Reasulrado: " + conta.varT);
			break;
		case '/':
			conta.divide();
			System.out.println("Reasulrado: " + conta.varT);
			break;
		case '%':
			conta.resto();
			System.out.println("Reasulrado: " + conta.varT);
			break;
		default:
			System.out.println("Operador invalido");
		}
		input.close();
	}

}
