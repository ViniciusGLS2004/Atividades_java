package classe;

import java.util.List;
import java.util.Scanner;

public class Produto {

		private String nome;
		private Categoria categoria;
		private double preco;
		private double qtd_estoque;
		
		public Produto(String nome, double preco, Categoria categoria ) {
			this.nome = nome;
			this.preco = preco;
		}
		
		public double precoVenda() {
			preco *= categoria.getPorcentagem_lucro()/100; 
			double precoT = 0;
			precoT += preco;
			return precoT;
			
		}
		
		@Override
		public String toString() {
			return "Nome: " + nome + 
					", categorira: " + Categoria.getNome_Categor() + 
					", " + qtd_estoque + "em estoque"
							+ ", preco em R$ " + precoVenda();
}

		public static void CadastrarProduto(Scanner sc, List<Produto>  produt, List<Categoria> categos) {
			
			System.out.println("Imforme o nome da produto:");
			String nome = sc.next().toUpperCase();
			System.out.println("Imforme o custo do produto:");
			double preco = sc.nextDouble();
			System.out.println("Imforme a categoria:");
			String NomE_cat = sc.next();
			boolean Cate_exist = false;
			for(Categoria categ : categos) {
				if(categ.getNome_Categor().equals(NomE_cat)) {
					Cate_exist = true;
					
					Produto OBprod = new Produto(nome, preco, categ);
					produt.add(OBprod);
				}
				if(Cate_exist == false ) {
					System.out.println("A categoria não existe!");
				}
			}
		}
		
		public static void RemoverProduto(Scanner sc, List<Produto>  produt) {
			System.out.println("Digite o nome do produto que queira remover!");
			String nome = sc.next().toUpperCase();
			boolean prod_exist = false;
			for( Produto Exitprod : produt) {
				if(prod_exist = true && Exitprod.getNome().equals(nome)) {
					produt.remove(Exitprod);
					System.out.println("O Produto foi removido!");
					break;
				}
			}
		}
		
		public static void ExibirTDprodutos(List<Produto>  produt) {
			System.out.println("Produtos cadastrados!");
			for( Produto ExibirTD : produt) {
				System.out.println(ExibirTD);
			}
		}

		public static void AdcionarQuantidade(Scanner sc, List<Produto>  produt) {
			System.out.println("Imforme o nome do produto:");
			String ADQ = sc.next().toUpperCase();
			for(Produto adq : produt) {
				if(adq.getNome().equals(ADQ)) {
					System.out.println("Imforme a quantidade que deseja adcionar a eese produto:");
					int quantidade = sc.nextInt();
					
					adq.Adcionarestoque(quantidade);
					break;	
				}
			}
		}
		
		public static void RemoverQuantidade(Scanner sc, List<Produto>  produt) {
			System.out.println("Imforme o nome do produto:");
			String ADQ = sc.next().toUpperCase();
			for(Produto adq : produt) {
				if(adq.getNome().equals(ADQ)) {
					System.out.println("Imforme a quantidade que deseja Remover do produto:");
					int quantidade = sc.nextInt();
					
					if(quantidade > adq.getQtd_estoque()) {
						System.out.println("Limite ultrapassado!");
					}
					if(adq.getQtd_estoque() > quantidade) {
						adq.Removerestoque(quantidade);
						break;	
					}
				}
			}
		}
		
		public void  Adcionarestoque(int qtd_estoque) {
			this.qtd_estoque += qtd_estoque;	
		}
		
		public void  Removerestoque(int qtd_estoque) {
			this.qtd_estoque -= qtd_estoque;	
		}
		
		
		
		
		
		
		
		
		
		
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public double getQtd_estoque() {
			return qtd_estoque;
		}

		public void setQtd_estoque(double qtd_estoque) {
			this.qtd_estoque = qtd_estoque;
		}
		
		

}
