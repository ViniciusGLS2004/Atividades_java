package classe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class cadastro {

	public String nome = "";
	public Date dia;
	
	SimpleDateFormat  form = new SimpleDateFormat ("dd/MMMM/yyyy");
	SimpleDateFormat  forma = new SimpleDateFormat ("dd/MMM/yyyy");
	SimpleDateFormat  format = new SimpleDateFormat ("dd/MM/yyyy");
	
	public cadastro() {
		
	}
	
	public cadastro(String nome, Date dia) {
		this.nome = nome;
		this.dia = dia;
	}
	
	public void ExibirCadastro() {
		System.out.println("Imformação do cadastro!");
		System.out.println("Nome: " + nome);
		System.out.println("Data: " + form.format(dia));
		System.out.println("Data: " + forma.format(dia));
		System.out.println("Data: " + format.format(dia));
	}
	
	public String toString() {
		return "Nome: " + nome +
				"\nData: " + form.format(dia) +
				"\nData: " + forma.format(dia) +
				"\nData: " + format.format(dia);	
	}
}
