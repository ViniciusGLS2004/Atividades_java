package app;

import java.util.Scanner;

import entities.Categoria;
import entities.Pedido;
import entities.Produto;
import repositories.CategoriaRepository;
import repositories.IRepository;
import repositories.PedidoRepository;
import repositories.ProdutoRepository;

public class main {

	public static void main(String[] args) throws Exception  {
		
		Scanner input = new Scanner(System.in);
		IRepository<Categoria> categoria_repository = new CategoriaRepository();
		// Você deve instanciar os objetos ProdutoRepository e PedidosRepository
		IRepository<Produto> produtos_repository = new ProdutoRepository();
		IRepository<Pedido> pedidos_repository = new PedidoRepository();
		int operacao = 10;
		// Você deve realizar o tratamento das exceções
		// geradas por entradas inconsistentes de dados fornecidos pelo usuário
		do {
			operacao = menuPrincipal(input);
			switch (operacao) {
			case 1:
				System.out.println("Imforme o nome da categoria:");
				String Nometro = input.next().toUpperCase();
				System.out.println("Imforme o adcional da categoria:");
				double addtro = input.nextDouble();
				categoria_repository.cadastrar(new Categoria(Nometro, addtro));
				System.out.println("Cadastro concluido");
				
				
				
				break;
			case 2:
				for( Categoria item: categoria_repository.listar()) {
					System.out.println(item);
				}
				
				break;
			case 3:
				System.out.println("Imforme a Categoria que deseja excluir: ");
				String exclui = input.next();
				//if  (exclui == categoria_repository.buscar(Nometro)) {
				//categoria_repository.excluir();
				//}				
				
				break;
			case 4:
				System.out.println("Imforme o nome do produto:");
				String Nomepro = input.next().toUpperCase();
				System.out.println("Imforme o custo do produto:");
				double custo = input.nextDouble();
				System.out.println("Imforme o nome da categria do produto: ");
				//Categoria categoria = input.equals(Nometro);
				//produtos_repository.cadastrar(new Produto(Nomepro, custo, categoria));
				System.out.println("Cadastro concluido");
				
				
				
				break;
			case 5:
				for( Produto item: produtos_repository.listar()) {
					System.out.println(item);
				}
				break;
			case 6:
				System.out.println("Imforme o produto que deseja excluir: ");
				String proclui = input.next();
				//if  (proclui == produtos_repository.buscar(Nometro)) {
					//produtos_repository.excluir(proclui);
				//}
				
				break;
			case 7:
				System.out.println("Imforme o codigo do pedido:");
				String codigo = input.next().toUpperCase();
				System.out.println("Imforme a quantidade do produto:");
				double quantidade = input.nextDouble();
				System.out.println("Imforme o nome do produto: ");
				//Produto produto = input.equals(Nometro);
				//pedidos_repository.cadastrar(new Pedido(codigo, quantidade, produto));
				System.out.println("Cadastro concluido");
				
				
				
				break;
			case 8:
				for( Pedido item: pedidos_repository.listar()) {
					System.out.println(item);
				}
				break;
			case 9:
				System.out.println("Imforme o produto que deseja excluir: ");
				String pedlui = input.next();
				//if  (proclui == pedidos_repository.buscar(Nometro)) {
					//pedidos_repository.excluir(pedlui);
				//}
				
				break;
			}
			

		} while (operacao != 10);

		input.close();
		throw new NumberFormatException("Entre somente com numeros!");
	}
	

	public static int menuPrincipal(Scanner input) {
		int acao;
		System.out.println("-----MENU PRINCIPAL-----");
		System.out.println("1 - CADASTRAR CATEGORIA");
		System.out.println("2 - LISTAR CATEGORIAS");
		System.out.println("3 - EXCLUIR CATEGORIAS");
		System.out.println("4 - CADASTRAR PRODUTO");
		System.out.println("5 - LISTAR PRODUTO");
		System.out.println("6 - EXCLUIR PRODUTO");
		System.out.println("7 - CADASTRAR PEDIDO");
		System.out.println("8 - LISTAR PEDIDO");
		System.out.println("9 - EXCLUIR PEDIDO");
		System.out.println("10 - SAIR");
		System.out.println("Escolha uma operação: ");
		acao = input.nextInt();
		if (acao > 0 && acao <= 10)
			return acao;
		else {
			throw new IllegalArgumentException("Operação inválida");
		}
	}

}
