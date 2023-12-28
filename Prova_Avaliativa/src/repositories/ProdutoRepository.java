package repositories;

import java.util.List;
import java.util.ArrayList;
import entities.Produto;

public class ProdutoRepository implements IRepository<Produto> {
	public List<Produto> produtos;

	public ProdutoRepository() {
		this.produtos = new ArrayList<Produto>();
	}

	@Override
	public boolean cadastrar(Produto item) {
		produtos.add(item);
		return true;
	}

	@Override
	public boolean excluir(Produto item) {
		produtos.remove(item);
		return true;
	}

	@Override
	public Produto buscar(String nome) {
		for (Produto item : produtos) {
			if (item.getNome().equals(nome)) {
				return item;
			}
		}
		throw new IllegalArgumentException("Não foi possível localizar O produto");
	}

	@Override
	public List<Produto> listar() {
		return produtos;
	}

}
