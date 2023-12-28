package objeto;

import classe.ContaEmpresarial;
import classe.conta;
import classe.contasalario;

public class main {

	public static void main(String[] args) {
		conta conta1 = new conta("vinicius", "1001");
		System.out.println(conta1);
		conta1.depositarinheiro(300.0);
		System.out.println(conta1);
		conta1.sacardinheiro(100.0);
		System.out.println(conta1);
		 
		System.out.println("---------------------------------------------------------------");
		
		ContaEmpresarial conta2 = new ContaEmpresarial("sopinha", "1047");
		System.out.println(conta2);
		conta2.depositarinheiro(400.0);
		System.out.println(conta2);
		conta2.sacardinheiro(50.0);
		System.out.println(conta2);
		if(conta2.SolicitarEmprestimo(4000.0)) {
			System.out.println("Emprestimo aprovado!");
		}
		else {
			System.out.println("Emprestimo negado!");
		}
		System.out.println(conta2);
		System.out.println("---------------------------------------------------------------");

		
		contasalario conta3 = new contasalario("jessica", "1002", 150.0);
		System.out.println(conta3);
		conta3.depositarinheiro(500.0);
		System.out.println(conta3);
		conta3.sacardinheiro(600.0);
		System.out.println(conta3);
		if(conta3.sacardinheiro(100.00)) {
			System.out.println("Saque realizado!");
		}
		else {
			System.out.println("Saque não realizado!");
			System.out.println(conta3);
		}	
	}
}
