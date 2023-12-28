package objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classe.lista;

public class Main {

	public static void main(String[] args) {
		lista list = new lista();
		List<lista> credec = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for( int c = 0; c < 5; c++) {
		System.out.println("Adcione um numero inteiro a lista!");
		list.val = sc.nextInt();
		
		lista listA = new lista(list.val);
		credec.add(listA);
		System.out.println("Numero adcionado!");
	
}		
		
		if(list.listacres(credec)) {
			System.out.println("A lista esta em ordem crescente");
		} else if(list.listadec(credec)) {
			System.out.println("A lista esta em ordem decrescente");
		
		} else {
            System.out.println("A lista não está em ordem crescente!");
        }
		
	}
}
