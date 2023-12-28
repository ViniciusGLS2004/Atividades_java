package entidades;

// classe pai chama funcionario que vai herdar os seus atributos
public abstract class Funcionario {
	protected String nome;
	protected Double salarioBase;
	
	public Funcionario(String nome, Double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;		
	}
// gets e sets para manipulação de dados
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
// impirimir os dados
	public String toString() {
		return "\nNome: " + nome+
				"\nSalario: R$" + salarioBase;
	}
	
	
}
