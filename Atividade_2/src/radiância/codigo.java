package radiância;

import java.util.Scanner;

public class codigo {
	
	
	public static void main(String[] args) {
		String resp;
		Scanner ks = new Scanner(System.in);
		do {
		
		String fun;
		String r1 = "sim";
		String r2 = "não";
		Double mes1, mes2, mes3, trimes, bonus, media, valorT ;
		
		System.out.println("Digite o nome primeiro do funcionario!");
		fun = ks.next();
		
		System.out.println("Digite as vendas do mes1: ");
		mes1 = ks.nextDouble();
		System.out.println("Digite as vendas do mes2: ");
		mes2 = ks.nextDouble();
		System.out.println("Digite as vendas do mes3: ");
		mes3 = ks.nextDouble();
		trimes = mes1 + mes2 + mes3;
		media = trimes/3;
		System.out.println("A soma das vendas mensais é: " + trimes);
		
		
		 if( trimes >= 2500 && trimes < 4000 ) {
		bonus = trimes * 0.12;
		valorT = bonus + trimes;
		System.out.println("O bonus pelo trimestre é: " + valorT);						
		} 
		else if( trimes > 12000 && trimes < 15000) {
			bonus = media * 0.1;
			valorT = bonus + media;
			System.out.println("O bonus pelo trimestre é: " + valorT);
		
		
		}else if(trimes > 15000){
			bonus = media * 0.05;
			valorT = bonus + media;
			System.out.println(" pelo trimestre é: " + valorT);
		}
		else {
			System.out.println(" A bonificação não sera adcionada, ou seja, as  metas não foram alcançadas.");
		}
		System.out.println("----------------------------------------");
		System.out.println("Deseja recalcular o desconto? (sim//nao)");
		resp = ks.next();
				
		
		if(resp.equals(r1)){
			resp = r1;
		} else {
			resp = r2;
		}
		
		
		} while ( resp == "sim");
		ks.close();
		
		
		if(resp != "sim") {
		System.out.println("Fim do calculo.");
		}
		
	}
}