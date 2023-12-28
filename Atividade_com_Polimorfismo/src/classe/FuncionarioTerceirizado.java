package classe;

import java.util.List;
import java.util.Scanner;

public class FuncionarioTerceirizado extends Funcionario {

	public FuncionarioTerceirizado() {
		super();

	}

	public FuncionarioTerceirizado(String nome, double Horastrabalhadas, double valorHora) {
		super(nome, Horastrabalhadas, valorHora);
	}

	public void CadastroFuncionariO(Scanner sc, List<FuncionarioTerceirizado> functec) {
		System.out.println("Quantos Funcionario deseja cadastrar?");
		int cad = sc.nextInt();
		for (int cas = 0; cas < cad; cas++) {
			
				System.out.println("Imforme o nome:");
				String nome = sc.next();

				System.out.println("imforme as horas trabalhadas:");
				double ht = sc.nextDouble();

				System.out.println("imforme o valor por hora:");
				double vh = sc.nextDouble();

				FuncionarioTerceirizado funcionarioterceirizado = new FuncionarioTerceirizado(nome, ht, vh);
				functec.add(funcionarioterceirizado);
			}
		}
	

	public double Pagamento() {
		return valorT += (Valorhora * horasTrabalhas) * 1.1;
	}

	public static void exibirfuncionario(List<FuncionarioTerceirizado> functec) {
		for (Funcionario ExibirTTD : functec) {
			System.out.println(ExibirTTD);
		}
	}

	public String toString() {
		return "nome: " + nome + 
				" \nhoras trabalhas: " + horasTrabalhas + 
				" \nvalor por hora: " + Valorhora +
			    " \nPagamento: " + Pagamento();
	}
}
