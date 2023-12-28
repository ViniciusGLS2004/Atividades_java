package entities;

public class Pedido extends AbstractEntity {

	private String codigo;
	private double quantidade;
	private Produto produto;

	public Pedido(String codigo, double quantidade, Produto produto) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public void CalcularValorPedido() {

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		if (quantidade > 0 && quantidade < 1) {
			this.quantidade = quantidade;
		} else {
			throw new IllegalArgumentException("A quantidade  do pedido deve ser um número decimal entre 0 e 1");
		}
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + 
				"Quantidade: " + quantidade + 
				"Produto: " + produto.getNome() + 
				"Valor do Pedido: " + CalcularValorPedido();

	}

}
