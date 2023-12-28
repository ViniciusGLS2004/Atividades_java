package objeto;

import java.util.Scanner;

import classe.funcionarioCL;

public class funcionarioOB {

	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);
		funcionarioCL fun = new funcionarioCL();
		
		double percent = 0;
		System.out.println("imforme o nome do funcionario:");
		fun.nome = sa.nextLine();
		
		System.out.println("imforme o Salario bruto do funcionario:");
		fun.salariobruto = sa.nextDouble();
		
		System.out.println("Imforme o imposto sobre o salario bruto:");
		fun.imposto = sa.nextDouble();
		
		System.out.printf("Nome: %s\n", fun.nome);
		System.out.printf("Salario Liquido: R$ %.2f\n", fun.calcularSL());
		
		
		System.out.println("Imforme a porcentagem sobre o salario:");
		fun.percent = sa.nextDouble();
		
		
		System.out.printf("Nome: %s\n", fun.nome);
		System.out.printf("Salario Liquido: R$ %.2f\n", fun.salarioliquido);
		fun.AumentarSalario(percent);
		System.out.printf("Aumento do Salario: %.2f\n", fun.salariobruto);
		
		sa.close();
	}

}
