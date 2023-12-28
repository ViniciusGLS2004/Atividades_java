package repository;

import java.util.ArrayList;
import java.util.List;

import entidades.Pet;

public class PetRepository implements IRepository<Pet> {
	public List <Pet> pets;
	
	public PetRepository() {
		this.pets = new ArrayList<>();
	}

	@Override
	public void cadastrar(Pet item) {
		pets.add(item);
		
	}

	@Override
	public void excluir(int id) {
		for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);
            if (pet.getId() == id) {
                pets.remove(i);
                return;
            }
		}
		
	}

	@Override
	public Pet buscar(String nome) {
		for (Pet item: pets) {
			if (item.getNomePet().equals(nome.toUpperCase())) {
				return item;
			}
		}
		throw new IllegalArgumentException("Não foi possível localizar  o Pet!");
	}

	@Override
	public List<Pet> listar() {	
		return pets;
	}
	
}
