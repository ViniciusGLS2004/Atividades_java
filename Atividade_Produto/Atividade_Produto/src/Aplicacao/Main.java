package Aplicacao;

import java.util.Scanner;
import Elementos.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nomeP;
		double precoP;
		int quantidadeP;
		Produto produtoX;
		
		System.out.println("Informe o nome do produto a ser adicionado:");
		nomeP = sc.nextLine();
		System.out.println("Informe o preço do produto:");
		precoP = sc.nextDouble();
		System.out.println("Informe a quantidade do produto:");
		quantidadeP = sc.nextInt();
		produtoX = new Produto(nomeP, precoP, quantidadeP);
		sc.nextLine();
		System.out.println("imforme o novo nome do produto");
		produtoX.setNome(sc.nextLine());
		
		System.out.println("Nome: "+ produtoX.getNome());
		System.out.println("Preço: R$ "+ produtoX.getpreco());
		System.out.println("Quantidade: "+ produtoX.getquantidade());
		System.out.println("O valor TOTAL: R$ "+ produtoX.ValorTotalEstoque());
		/*
		System.out.println("Informe a quantidade para adicionar:");
		produtoX.AdicionarProduto(sc.nextInt());
		System.out.println("Nome: "+ produtoX.nome);
		System.out.println("Preço: R$ "+ produtoX.preco);
		System.out.println("Quantidade: "+ produtoX.quantidade);
		System.out.println("O valor TOTAL: R$ "+ produtoX.ValorTotalEstoque());
		
		System.out.println("Informe a quantidade para remover:");
		produtoX.RemoverProduto(sc.nextInt());
		System.out.println("Nome: "+ produtoX.nome);
		System.out.println("Preço: R$ "+ produtoX.preco);
		System.out.println("Quantidade: "+ produtoX.quantidade);
		System.out.println("O valor TOTAL: R$ "+ produtoX.ValorTotalEstoque());
		*/
		sc.close();
	}
}
