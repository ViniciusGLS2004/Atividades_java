package entidades;

import interfaces.IFuncionario;
// o Operador herda do funcionario e implementa da interface funcionaeio
public class Operador extends Funcionario implements IFuncionario{
	
	protected Supervisor supervisor;
	
	public Operador(String nome, Double salarioBase, Supervisor supervisor) {
		super(nome, salarioBase);
		this.supervisor = supervisor;
	}
	// gets e sets para manipulação de dados
	public Supervisor getSupervisor() {
		return this.supervisor;
	}
	
	public void alterarSupervisor(Supervisor novoSuper) {
		this.supervisor = novoSuper;
	}

	
	// impirimir os dados
	public String toString() {
		return "\nNome: " + nome+
				"\nSalario: R$" + calcularSalario();
	}
	// aqui ele ta chamando o metodo da iterface Ifuniconario e a implementando ela na sua classe e 
	//manipulando como quiser
	public Double calcularSalario() {
		return this.salarioBase * 0.98;
	}
}
