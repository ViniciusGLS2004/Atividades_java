package classe;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
		
	
		public String nome;
		public Date nasc;
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		
		public Pessoa(){
			
		}
		public Pessoa( String Nome, Date Data) {
			nome = Nome;
			nasc = Data;
		}
		public abstract  void ImprimeDados();
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Date getNasc() {
			return nasc;
		}
		public void setNasc(Date nasc) {
			this.nasc = nasc;
		}
		
		
		
}
