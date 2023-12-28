package classe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Gerente extends Funcionario{

	public String Area;
	public double Salario;

	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public Gerente() {
		super();
		
	}

	public Gerente( String Nome, Date Data) {
		super( Nome, Data);
		
	}
	
	public  double CalculaImposto() {
		double imposto = (5 * Salario)/100;
		return Salario -= imposto;		
	}
	
	@Override
	public void ImprimeDados() {
		System.out.println("Nome: "+ nome);
		System.out.println("Nascimento: "+ formato.format(nasc));
		System.out.println("Area: " + Area);
		System.out.println("Salario: "+ CalculaImposto());
		
	}
	
}
