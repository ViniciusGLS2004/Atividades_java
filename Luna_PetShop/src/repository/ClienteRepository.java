package repository;

import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;

public class ClienteRepository implements IRepository<Cliente> {
	public List<Cliente> clientes;
	
	public ClienteRepository() {
        this.clientes = new ArrayList<>();
    }

	@Override
	public void cadastrar(Cliente item) {
		clientes.add(item);
		
	}

	@Override
	public void excluir(int id) {
		for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getId() == id) {
                clientes.remove(i);
                return;
            }
		}
	}
	@Override
	public Cliente buscar(String nome) {
		for (Cliente item: clientes) {
			if (item.getNome().equals(nome.toUpperCase())) {
				return item;
			}
		}
		throw new IllegalArgumentException("Não foi possível localizar  o cliente!");
		
	}

	@Override
	public List<Cliente> listar() {
		return clientes;
	}
}
