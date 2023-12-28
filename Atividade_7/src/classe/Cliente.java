package classe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa {

	public int codigo;

	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public Cliente() {
		super();

	}

	public Cliente( String Nome, Date Data) {
		super( Nome, Data);

	}

	@Override
	public void ImprimeDados() {
	System.out.println("Nome: "+ nome);
	System.out.println("Nascimento: "+ formato.format(nasc));
	System.out.println("Codigo: "+ codigo);
		
	}

	
	public Date getNasc() {
		return (Date) nasc;
	}

	public void setNasc(Date nasc) {
		this.nasc = nasc;
	}
}
