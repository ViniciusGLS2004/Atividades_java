package entidades;

public class Cliente extends AbstractEntity{
	private String nome;
	private String endere;
	private String email;
	private String telefone;
	private int id;
	
	
	public Cliente(String nome, String endere, String email, String telefone, int id) {
		this.nome = nome;
		this.endere = endere;
		this.email = email;
		this.telefone = telefone;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere() {
		return endere;
	}
	public void setEndere(String endere) {
		this.endere = endere;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		
		return "\n////////////////////////////////////" +
				"\nNome do Cliente: " + nome + 
				"\n Endereço: " + endere + 
				"\n Email: " + email + 
				"\n Telefone: " + telefone + 
				"\n Id: " + id+
			"\n////////////////////////////////////\n";
	}

}
