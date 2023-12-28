package classe;

public class funcionarioCL {
	
		public String nome;
		public double salariobruto;
		public double salarioliquido;
		public double imposto;
		public double percent;
		
		
		
		
		public double calcularSL() {
			salarioliquido = salariobruto - imposto;
			return salarioliquido;
			
		}
		
		public void AumentarSalario(double aumentarsalario) {
			salariobruto += percent/100 * salariobruto;			

		}
}
