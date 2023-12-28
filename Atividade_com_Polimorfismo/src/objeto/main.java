package objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classe.Funcionario;
import classe.FuncionarioTerceirizado;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> func = new ArrayList<>();
		List<FuncionarioTerceirizado> functec = new ArrayList<>();

		System.out.println("Adcionar funcionarios!\n");

		Funcionario funcionario = new Funcionario();

		funcionario.CadastroFuncionario(sc, func);

		System.out.println("\nAdcionar funcionarios terceirizados!\n");

		FuncionarioTerceirizado FuncionarioTerceirizadO = new FuncionarioTerceirizado();

		FuncionarioTerceirizadO.CadastroFuncionariO(sc, functec);

		System.out.println("\nFuncionarios cadastrados!");

		Funcionario.Exibirfuncionario(func);

		System.out.println("\nFuncionarios terceirizados cadastrados!");

		FuncionarioTerceirizado.exibirfuncionario(functec);

	}

}
