package Model;

public class Produto {
	private String nome;
	private Categoria categoria;
	private Double custo;
	private int estoque;
	
	public Produto() {
		
	}
	
	
	public Produto(String nome, Categoria categoria, Double custo) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.custo = custo;
	}


	public Produto(String nome, Categoria categoria, Double custo, int estoque) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.custo = custo;
		this.estoque = estoque;
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


	public Double getCusto() {
		return custo;
	}


	public void setCusto(Double custo) {
		this.custo = custo;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public Double calcularPreco() {
		return this.custo * (1 + this.categoria.getLucro());
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() +
				"\nCategoria: " + this.getCategoria() + 
				"\nPreço de venda: " + String.format("%.2f", this.calcularPreco()) +
				"\nEstoque: " + this.getEstoque();
	}
}
