package classe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa {

	public double Salario;
	
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public Funcionario() {
		super();
		
	}


	public Funcionario( String Nome, Date Data) {
		super( Nome, Data);
		
	}
	public  double CalculaImposto() {
		double imposto = (3 * Salario)/100;
		return Salario -= imposto;
		
	}

	@Override
	public void ImprimeDados() {
		System.out.println("Nome: "+ nome);
		System.out.println("Nascimento: "+ formato.format(nasc));
		System.out.println("Salario: "+ CalculaImposto());
		
	}

		
}
