package classe;

public class cotacaoCL {

		public static double valorDolar;
		public static double gasto;
		
		public static double DolarConvert() {
			double cotacaoDolar = 5.17;
			double IOF;
			gasto = valorDolar *  cotacaoDolar;
			IOF = 0.06 * gasto; 
			gasto = IOF + gasto; 
			return gasto;
			
		}
}
