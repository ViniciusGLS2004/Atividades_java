package classe;

import java.util.List;
import java.util.Scanner;

public class Funcionario {

	public String nome;
	public double horasTrabalhas;
	public double Valorhora;
	public double valorT;

	public Funcionario() {

	}

	public Funcionario(String nome, double Horastrabalhadas, double valorHora) {
		this.nome = nome;
		horasTrabalhas = Horastrabalhadas;
		Valorhora = valorHora;
	}

	public void CadastroFuncionario(Scanner sc, List<Funcionario> func) {
		System.out.println("Quantos Funcionarios deseja cadastrar?");
		int cad = sc.nextInt();
		for (int cas = 0; cas < cad; cas++) {
			
				System.out.println("Imforme o nome:");
				String nome = sc.next();
				
				System.out.println("imforme as horas trabalhadas:");
				double ht = sc.nextDouble();
				
				System.out.println("imforme o valor por hora:");
				double vh = sc.nextDouble();

				Funcionario funcionario = new Funcionario(nome, ht, vh);
				func.add(funcionario);
			}
		}
	

	public static void Exibirfuncionario(List<Funcionario> func) {
		for (Funcionario ExibirTD : func) {
			System.out.println(ExibirTD);
		}
	}

	public double Pagamento() {
		return valorT = Valorhora * horasTrabalhas;
	}

	public String toString() {
		return "nome: " + nome + 
				" \nhoras trabalhas: " + horasTrabalhas + 
				" \nvalor por hora: " + Valorhora + 
				" \nPagamento: " + Pagamento();
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHorasTrabalhas() {
		return horasTrabalhas;
	}

	public void setHorasTrabalhas(double horasTrabalhas) {
		this.horasTrabalhas = horasTrabalhas;
	}

	public double getValorhora() {
		return Valorhora;
	}

	public void setValorhora(double valorhora) {
		Valorhora = valorhora;
	}

}
