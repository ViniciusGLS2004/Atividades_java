package aplicacao;
import java.util.ArrayList;
import java.util.List;
import entidades.Funcionario;
import entidades.Operador;
import entidades.Supervisor;

public class Main {
	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		// adcionando a lista
		Supervisor sp1 = new Supervisor("Luiz", 2000.0, "TI");
		funcionarios.add(sp1);
		Supervisor sp2 = new Supervisor("Debora", 3000.0, "RH");
		funcionarios.add(sp2);
		funcionarios.add(new Operador("Lucas", 1500.0, sp1));
		funcionarios.add(new Operador("Riquelme", 1500.0, sp1));
		funcionarios.add(new Operador("Aberlan", 1500.0, sp1));
		funcionarios.add(new Operador("Marcos", 1800.0, sp2));
		funcionarios.add(new Operador("Kleyton", 1800.0, sp2));
		for (Funcionario item : funcionarios) {
			if(item instanceof Supervisor) {
				System.out.println("\n\n" + item);
				System.out.println("---OPERADORES---");
				List<Operador> operadores = ((Supervisor)item).buscarOperadores(funcionarios);
				for(Operador op : operadores) {
					System.out.println(op);
				}
			}
			
		}
		
	}

}
