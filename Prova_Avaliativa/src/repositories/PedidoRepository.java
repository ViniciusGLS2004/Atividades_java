package repositories;

import java.util.List;
import java.util.ArrayList;
import entities.Pedido;

public class PedidoRepository implements IRepository<Pedido> {
	public List<Pedido> pedidos;

	public PedidoRepository() {
		this.pedidos = new ArrayList<Pedido>();
	}

	@Override
	public boolean cadastrar(Pedido item) {
		pedidos.add(item);
		return false;
	}

	@Override
	public boolean excluir(Pedido item) {
		pedidos.remove(item);
		return false;
	}

	@Override
	public Pedido buscar(String nome) {
		for (Pedido item : pedidos) {
			if (item.getCodigo().equals(nome)) {
				return item;
			}
		}
		throw new IllegalArgumentException("Não foi possível localizar o Pedido");
	}

	@Override
	public List<Pedido> listar() {
		return pedidos;
	}

}
