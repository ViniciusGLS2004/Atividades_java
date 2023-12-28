package entities;

public class Produto extends AbstractEntity {

	private String nome;
	private double custo;
	private Categoria categoria;


	public Produto(String nome, double custo, Categoria categoria) {
		this.nome = nome;
		this.custo = custo;
		this.categoria = categoria;
	}

	public void CalcularValorVenda() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		if (custo > 0 && custo < 1) {
			this.custo = custo;
		} else {
			throw new IllegalArgumentException("O custo do produto deve ser um número decimal entre 0 e 1");
		}
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + 
				"Custo " + custo + 
				"Categoria: " + categoria.getNome() + 
				"Valor do produto: " + CalcularValorVenda();
	}

}
