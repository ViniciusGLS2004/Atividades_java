package Classe;

public class StudentCL {

		public String nome;
		public double av1;
		public double av2;
		public double av3;
		
		
			
		public double Media() {
			double notafinal = (av1 * 3.0 + av2 * 3.5 + av3 * 3.5)/10;
			return notafinal;
		}
		public boolean Situacao() {
			if(Media() >= 6) {
				return true;
			}
			else {
				return false;
				
			}
		}
		public double Resto() {
			double resto = 6 - Media();
			return resto;
		}
}
		

