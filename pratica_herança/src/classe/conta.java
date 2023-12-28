package classe;                                                                               

public class conta {

		public String nome;
		public String numero;
		public Double saldo;
		
		public conta() {
			
		}
		
		public conta(String nome, String numero) {
			this.nome = nome;
			this.numero = numero;
			this.saldo = 0.0;
			
		}
		
		public boolean sacardinheiro(double valor) {
			
			if(valor <= saldo) {
				saldo -= valor;
				return true;
			}
			else {
				return false;
			}
			
		}
		
		public boolean depositarinheiro(double valor) {
			if(valor > 0) {
				saldo += valor;
				return true;
			}
			return false;
		}
		
		public String toString() {
			return "nome: " +nome + "/ numero: " + numero + "/ saldo: " + saldo;
		}
		

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getNumero() {
			return numero;
		}

		public Double getSaldo() {
			return saldo;
		}
}                                                                         



                                             