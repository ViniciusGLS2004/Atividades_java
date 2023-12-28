package classes;

public class Produto {

	public String Nome;
	public double custocomp;
	public double quantestoque;

	public Produto(String nome, double Custocomp, double Quantestoque) {
		this.Nome = nome;
		this.custocomp =  Custocomp;
		this.quantestoque = Quantestoque;
	}
	
	public double precoVenda() {
		
		return custocomp;
	}
	
	public String toString() {
		return "Produto :" + Nome +  "Categoria: "  + quantestoque + "em estoque , preço de venda R$ " + precoVenda();
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getCustocomp() {
		return custocomp;
	}
	public void setCustocomp(double custocomp) {
		this.custocomp = custocomp;
	}
	public double getQuantestoque() {
		return quantestoque;
	}
	public void setQuantestoque(double quantestoque) {
		this.quantestoque = quantestoque;
	}
}
