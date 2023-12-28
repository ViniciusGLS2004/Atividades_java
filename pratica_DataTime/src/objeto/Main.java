package objeto;

import java.util.Scanner;

import classe.funcCL;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		funcCL user = new funcCL(null, 0, 0);
		
		System.out.println("Imforme o nome do Funcionario:");
		user.nome = sc.nextLine();
		
		System.out.println("Imforme o horario de Entrada:");
		user.HoraEntrada = sc.nextInt();
		
		System.out.println("Imforme o horario de Saída:");
		user.HoraSaida = sc.nextInt();
		
		System.out.println("O funcionario " + user.nome + " trabalhou " + user.HorasTrabalhadas + " Horas");
		
		
		
	}

}
