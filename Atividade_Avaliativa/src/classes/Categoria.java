package classes;

public class Categoria {

		public String Tecnologia;
		public String Acessorios;
		public String  Papelaria;
		
		public Categoria(String tecnologia, String acessorios, String papelaria) {
			this.Tecnologia = tecnologia;
			this.Acessorios = acessorios;
			this.Papelaria = papelaria;
		}
		public int ExibirMenu() {
		System.out.println("MENU: ");
		System.out.println("1 - Cadastrar Categoria");
		System.out.println("2 - Excluir Categoria");
		System.out.println("3 - Cadastrar Produto");
		System.out.println("4 - Excluir Produto");
		System.out.println("5 - Exibir Produtos Cadastrados");
		System.out.println("6 - Adicionar Estoque a Produto");
		System.out.println("7 - Remover Estoque de Produto");
		System.out.println("8 - Sair");
		return ExibirMenu();
		}
		
		public static String Cadastrarcategoria(int cont, String addcat) {
		for(cont = 0;cont <= 5; cont++) {
			if(cont <= 5) {
				System.out.println("Adicione uma categoria: ");
				addcat = sc.next().toUpperCase().charAt(0);
			}
			else {
				System.out.println("Limite excedido, volte ao menu princiapl!");
				return ExibirMenu();
			}
		}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		public String toString() {
			return "Categoria do produto: " ;
			
			}
		public String getTecnologia() {
			return Tecnologia;
		}

		public void setTecnologia(String tecnologia) {
			Tecnologia = tecnologia;
		}

		public String getAcessorios() {
			return Acessorios;
		}

		public void setAcessorios(String acessorios) {
			Acessorios = acessorios;
		}

		public String getPapelaria() {
			return Papelaria;
		}

		public void setPapelaria(String papelaria) {
			Papelaria = papelaria;
		}
}

