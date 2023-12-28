package classe;

public class contasalario extends conta{
 
	
	public double Limitechequeespecial;

	public contasalario() {
		super();
		
	}

	public contasalario(String nome, String numero) {
		super(nome, numero);
		Limitechequeespecial = 200.0;

	}
	
	public contasalario(String nome, String numero, Double Limitechequeespecial) {
		super(nome, numero);
		this.Limitechequeespecial = Limitechequeespecial;
	}
	
	public boolean sacardinheiro(double valor) {
		
		if(valor <= saldo + Limitechequeespecial) {
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String toString() {
		return "nome: " + nome + "/ numero: " + numero + "/ saldo: " + saldo + "/ Limite de cheque especial: R$ " + Limitechequeespecial;
	}

}
