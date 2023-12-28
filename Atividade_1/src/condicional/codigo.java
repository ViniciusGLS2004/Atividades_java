package condicional;

import java.util.Scanner;

public class codigo {


	public static void main(String[] args) {
		
		
		String r;
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		do {
				
		double mensal, dias, taxa, taxaT;
		String r1 = "sim";
		String r2 = "não";
		System.out.println("Imforme o valor mensal a ser pago:");
		
		mensal = sc.nextFloat();
		
		System.out.println("Imforme os dias passados:");
		
		dias = sc.nextFloat();
		
		
		
		System.out.println("O valor mensal é: " + mensal);
		
		System.out.println("Os dias passados são: " + dias);
		
		if(dias <= 5) {
			System.out.println("Nenhuma taxa será cobrada!");
		}
		else if(dias >= 6 && dias <= 10) {
			
			taxa = 5 * mensal;
			taxa = taxa/100;
			taxaT = taxa + mensal;
			System.out.println("A taxa pelo atraso é: " + taxa);
			System.out.println("total a ser pago é: " + taxaT);
		}
		else if(dias >= 11 && dias <= 19) {
			taxa = 10 * mensal;
			taxa = taxa/100;
			taxaT = taxa + mensal;
			System.out.println("A taxa pelo atraso é: " + taxa);
			System.out.println("total a ser pago é: " + taxaT);
		} else {
		taxa = ( dias == 20.0 ) ? 0.15 * mensal : (dias - 20) * 0.002;
		
		System.out.println("A taxa pelo atraso é: " + taxa);
		
		taxaT = taxa + mensal;
		
		System.out.println(" valor total a ser pago é: " + taxaT);
		}		
		System.out.println("----------------------------------------");
		System.out.println("Deseja recalcular o desconto? (sim//nao)");
		
		r = sc.next();
		
		
		
		if(r.equals(r1)){
			r = r1;
		} else {
			r = r2;
		}
		
		}while ( r == "sim");
		sc.close();
		if(r != "sim") {
		System.out.println("Fim do calculo.");
		}
		
		}
	
}
