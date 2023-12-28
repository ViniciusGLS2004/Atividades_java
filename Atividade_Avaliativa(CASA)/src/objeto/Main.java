package objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classe.Categoria;
import classe.Produto;

public class Main {

	public static void main(String[] args) {
		Categoria ct = new Categoria(null, 0);
		Scanner sc = new Scanner(System.in);
		List<Categoria> categos = new ArrayList<>(); // criando uma lista
		List<Produto>  produt= new ArrayList<>(); // criando uma lista
	
		do {
			ct.MENU_PRINCIPAL();
			System.out.println("Digite o numero da opção desejada!");
			ct.opcao = sc.nextInt();
		
			switch (ct.opcao) {
            case 1:
            	Categoria.cadastrocategoria(sc,categos);
                break;
            case 2:
            	Categoria.ExcluirCategoria( sc,  categos, produt);
                break;
            case 3:
            	Produto.CadastrarProduto(sc, produt, categos);
                break;
            case 4:
            	Produto.RemoverProduto(sc, produt);
                break;
            case 5:
            	 Produto.ExibirTDprodutos(produt);
                break;
            case 6:
            	Produto.AdcionarQuantidade(sc, produt);
                break;
            case 7:
                Produto.RemoverQuantidade(sc, produt);
                break;
            case 8:
                System.out.println("programa Terminado!");
                break;
            default:
                System.out.println("Numero incorreto, Digite novamente!");
                break;
        }
		} while(ct.opcao != 8);
	}

}
