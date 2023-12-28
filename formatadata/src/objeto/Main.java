package objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import classe.cadastro;

public class Main {

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		cadastro cad = new cadastro();
		
		SimpleDateFormat  form = new SimpleDateFormat ("dd/MMMM/yyyy");
		SimpleDateFormat  forma = new SimpleDateFormat ("dd/MMM/yyyy");
		SimpleDateFormat  format = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.println("Imforme o seu nome!");
		cad.nome = input.next();
		
		System.out.println("Imforma a sua data de nascimento(dd/MMMM/yyyy");
		
		try {
			cad.dia = form.parse(input.next());
		} catch (ParseException e) {
			System.out.println("Data escrita errada!" +e.getMessage());
		}
		
		System.out.println("Imforma a sua data de nascimento(dd/MMM/yyyy");
		try {
			cad.dia = forma.parse(input.next());
		} catch (ParseException e) {
			System.out.println("Data escrita errada!" +e.getMessage());
		}
		
		System.out.println("Imforma a sua data de nascimento(dd/MM/yyyy");
		try {
			cad.dia = format.parse(input.next());
		} catch (ParseException e) {
			System.out.println("Data escrita errada!"+e.getMessage());
		}
		
		cad.ExibirCadastro();

	}

}
