package entidades;

public class Pet extends AbstractEntity {
	private String nomePet;
	private String especie;
	private String idade;
	private String raca;
	private int id;
	Cliente cliente;
	
	public Pet(String nomePet, String especie, String idade, String raca, int id) {
		this.nomePet = nomePet;
		this.especie = especie;
		this.idade = idade;
		this.raca = raca;
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public String getNomePet() {
		return nomePet;
	}
	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	@Override
	public String toString() {
		return 
				"\n////////////////////////////////////" +
				"\nNome do Pet: " + nomePet + 
				"\nEspecie: " + especie + 
				"\nIdade: " + idade + 
				"\nRaça: " + raca+ 
				"\nId do Cliente: " + id +
				"\n////////////////////////////////////\n";
	}
}
