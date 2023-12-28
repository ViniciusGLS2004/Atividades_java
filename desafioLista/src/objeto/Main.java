package objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classe.lista;

public class Main {

	public static void main(String[] args) {
		List<lista> somalista = new ArrayList<>();
		lista list = new lista();
		Scanner input = new Scanner(System.in);
		
		String opcao;

		
		do {
			System.out.println("Adicione um numero inteiro a lista");
			list.var = input.nextInt();

			lista listA = new lista(list.var);
			somalista.add(listA);

			System.out.println("O elemento adcionado a lista é: " + list.var);
			System.out.println("A soma dos elementos da lista é: " + list.somalist(somalista));
			
			System.out.println("Deseja adcionar mais um valor na lista?(Sim/nao)");
			opcao = input.next().toUpperCase();
			
		}
		while (opcao.equals("SIM"));
		System.out.println("Soma encerrada!");
			
		}
	}


