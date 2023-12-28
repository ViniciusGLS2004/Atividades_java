package Objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import classe.Cliente;
import classe.Funcionario;
import classe.Gerente;

public class Main {

	
	public static void main(String[] args) throws ParseException {
		Cliente cl = new Cliente();
		Funcionario fc = new Funcionario();
		Gerente ge = new Gerente();
		Scanner sc = new Scanner(System.in);
		
		String  cont = "";
		String opcao = "";
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		cl.nasc = null; // declaração da variável nasc fora do bloco try
		
		do {
		try {
			
			System.out.println("Deseja cadastrar um Cliente, Funcionario, ou Gerente?");
			 opcao = sc.next().toUpperCase();
			
			if( opcao.equals("CLIENTE")) {
				
			System.out.println("Insira as Imformações do Cliente");
			System.out.println("Imforme o seu nome:");
			cl.nome = sc.next();

			System.out.println("Imforme a sua data de nascimento:");
			cl.nasc = formato.parse(sc.next());

			System.out.println("Imforme o seu codigo:");
			cl.codigo = sc.nextInt();
			
			
			System.out.println("--------------------------------------------------");
			
			System.out.println("Imformação do cliente!");
			cl.ImprimeDados();

			System.out.println("--------------------------------------------------");

			}
			if( opcao.equals("FUNCIONARIO")) {
							
			System.out.println("Insira as Imformações do Funcionario!");
			System.out.println("Imforme o seu nome:");
			fc.nome = sc.next();

			System.out.println("Imforme a sua data de nascimento:");
			fc.nasc = formato.parse(sc.next());

			System.out.println("Imforme o seu salario:");
			fc.Salario = sc.nextDouble();

			System.out.println("--------------------------------------------------");
			
			System.out.println("Imformação do funcioario!");
			fc.ImprimeDados();

			System.out.println("--------------------------------------------------");
			}
			if( opcao.equals("GERENTE")) {
				
			System.out.println("Insira as imformações do Gerente");
			System.out.println("Imforme o seu nome:");
			ge.nome = sc.next();

			System.out.println("Imforme a sua data de nascimento:");
			ge.nasc = formato.parse(sc.next());

			System.out.println("Imforme a sua Area:");
			ge.Area = sc.next();

			System.out.println("Imforme o seu salario:");
			ge.Salario = sc.nextDouble();

			System.out.println("--------------------------------------------------");
			
			System.out.println("Imformação do Gerente!");
			ge.ImprimeDados();
			
			System.out.println("--------------------------------------------------");
			
			} else {
				System.out.println("cadastro invalido!");
			}
		System.out.println("Deseja inserir um novo cadastro?");
		cont = sc.next().toUpperCase();

		} catch (ParseException e) {
			System.out.println("Erro em fromato de data: " + e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println("Erro em dados: " +e.getMessage());
		}
		

		}
		while(cont.equals("SIM"));
		System.out.println("Cadastro encerrado!");
	}
}
