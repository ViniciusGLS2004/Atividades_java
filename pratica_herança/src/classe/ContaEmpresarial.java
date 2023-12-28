package classe;

public class ContaEmpresarial extends  conta{
	public double limiteEmprestimo;

	
	public ContaEmpresarial() {
		super();
		
	}

	public ContaEmpresarial(String nome, String numero) {
		super(nome, numero);
		limiteEmprestimo = 5000.0;
	}
	
	public double getlimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setlimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public boolean SolicitarEmprestimo(double valor ) {
		if(valor <= limiteEmprestimo) {
			limiteEmprestimo -= valor;
			saldo += valor;
			return true;
		} else {
			return false;
		}
	}
		
		public String toString() {
			return "nome: " + nome + "/ numero: " + numero + "/ saldo: " + saldo + "/ Limite de emprestimo: R$ " + limiteEmprestimo;
		}
	}







