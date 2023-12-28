package classe;

public class bancoCL {

	public String nome;
	public double deposito;
	public double saque;
	public double saldoconta;

	
	public double Deposito() {
		double deposito = this.deposito; 
		saldoconta += deposito;
		return saldoconta;
	}
	
	public double Saque() {
		double saque = this.saque;
		saldoconta -= saque;
		saldoconta -= 5;
		return saldoconta;
	}

	

	public void getNumero(double numero) {
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getSaldoconta() {
		return saldoconta;
	}

	public void setSaldoconta(double saldoconta) {
		this.saldoconta = saldoconta;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
