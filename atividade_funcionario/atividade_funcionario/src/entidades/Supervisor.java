
package entidades;
import java.util.ArrayList;
import java.util.List;

import interfaces.IFuncionario;
import interfaces.ISupervisor;

//o Operador herda do funcionario e implementa da interface funcionaeio
public class Supervisor extends Funcionario implements IFuncionario, ISupervisor{
	
	protected String setor;
	
	public Supervisor(String nome, Double salarioBase, String setor) {
		super(nome, salarioBase);
		this.setor = setor;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void alterarSetor(String novoSetor) {
		setor = novoSetor;
	}
	// impirimir os dados
	@Override
	public String toString() {
		return "\nNome: " + nome+
				"\nSalario: R$" + calcularSalario() +
				"\nSetor: " + setor;
	}
	// aqui ele ta chamando o metodo da iterface Ifuniconario e a implementando ela na sua classe e 
		//manipulando como quiser
	public Double calcularSalario() {
		return salarioBase * 0.95;
	}

	// aqui ele ta chamando o metodo da iterface ISupervisor e a implementando ela na sua classe e 
		//manipulando como quiser
	// aqui é uma funcao com os parametros de uma lista do main
	public List<Operador> buscarOperadores(List<Funcionario> lista) {
		List<Operador> operadores = new ArrayList<Operador>();
		for(Funcionario item : lista) {
			//O instanceof verifica  se o objeto é uma instância da classe ou interface especificada
			if(item instanceof Operador) {
				if(((Operador) item).supervisor.equals(this)){
					operadores.add((Operador) item);
				}
			}
		}
		/*
		 * for(Funcionario item : lista) { if(item instanceof Operador) { if(((Operador)
		 * item).supervisor.getNome() == this.getNome()){ operadores.add((Operador)
		 * item); } } }
		 */
		return operadores;
	}
}
