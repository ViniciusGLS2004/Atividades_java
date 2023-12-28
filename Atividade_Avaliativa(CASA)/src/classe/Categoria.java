package classe;

import java.util.List;
import java.util.Scanner;

public class Categoria {
	private static String nome_Categor;
	public int opcao;
	private double porcentagem_lucro; 
	
	public Categoria(String nome_Categor, double porcentagem_lucro ) {
		this.nome_Categor = nome_Categor;
		this.porcentagem_lucro = porcentagem_lucro;
	}
		
		@Override
		public String toString() {
			return "nome da categoria: " + nome_Categor ;
}
		public int MENU_PRINCIPAL() {
			int opcao;
			opcao = this.opcao;
			System.out.println("MENU: ");
			System.out.println("1 - Cadastrar Categoria");
			System.out.println("2 - Excluir Categoria");
			System.out.println("3 - Cadastrar Produto");
			System.out.println("4 - Excluir Produto");
			System.out.println("5 - Exibir Produtos Cadastrados");
			System.out.println("6 - Adicionar Estoque a Produto");
			System.out.println("7 - Remover Estoque de Produto");
			System.out.println("8 - Sair");
			return opcao;
			}
	
	public static void cadastrocategoria(Scanner sc, List<Categoria> categos) {
		if(categos.size() > 4) {
			System.out.println("Limite de cateorias excedido!");
		}	
		if(categos.size() < 5) {
		System.out.println("Imforme o nome da categoria:");
		String nome_Categor = sc.next().toUpperCase();
		System.out.println("Imforme a porcentagem da categoria:");
		double porcentagem_lucro = sc.nextDouble();
		
		Categoria OBcate = new Categoria(nome_Categor, porcentagem_lucro);
		categos.add(OBcate);
		}
		
	}
	public static void ExcluirCategoria(Scanner sc, List<Categoria> categos, List<Produto>  produt) {
		System.out.println("Qual o nome da categoria voce deseja excluir!");
		String nome_Categor = sc.next().toUpperCase();
		boolean Cate_exist = false;
		boolean Prod_exist = false;
		for(Produto prod : produt) {
			if(prod.getCategoria().getNome_Categor().equals(nome_Categor)) {
				Prod_exist = true;
				break;
		}
		}	
			for(Categoria cat : categos) {
				if(cat.getNome_Categor().equals(nome_Categor)) ;
					Cate_exist = true;
					break;
			}
			
			for(Categoria Categ : categos) {
				if(Prod_exist == false && Cate_exist == true && Categ.getNome_Categor().equals(nome_Categor)) {
				categos.remove(Categ);
				
				System.out.println("A Categoria foi removida!");
				break;
				}	
			}
			if(Prod_exist == true) {
				System.out.println("Não é possivel remover essa categoria, ela já tem um produto!");
			}
			if(Cate_exist == false) {
				System.out.println("Essa categoria não existe!");
			}
			}
		
		
	
	
	
	
	public static String getNome_Categor() {
		return nome_Categor;
	}

	public static void setNome_Categor(String nome_Categor) {
		Categoria.nome_Categor = nome_Categor;
	}

	public double getPorcentagem_lucro() {
		return porcentagem_lucro;
	}

	public void setPorcentagem_lucro(double porcentagem_lucro) {
		this.porcentagem_lucro = porcentagem_lucro;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	
	
	
}
