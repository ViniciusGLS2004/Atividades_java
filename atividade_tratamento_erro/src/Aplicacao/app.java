package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.Reserva;

public class app {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		try {
		System.out.println("Informe o número do quarto: ");
		int numero = input.nextInt();
		System.out.println("Data de Check-In (dd/MM/yyyy): ");
		Date checkIn = formatador.parse(input.next());
		System.out.println("Data de Check-Out (dd/MM/yyyy): ");
		Date checkOut = formatador.parse(input.next());

			Reserva novaReserva = new Reserva(numero, checkIn, checkOut);
			System.out.println("Reserva criada: " + novaReserva);

			System.out.println("--- Atualização de reserva " + novaReserva.getNumeroQuarto() + "---");
			System.out.println("Informe a nova data de Check-In (dd/MM/yyy): ");
			Date novoCheckIn = formatador.parse(input.next());
			System.out.println("Informe a nova Data de Check-Out (dd/MM/yyy): ");
			Date novoCheckOut = formatador.parse(input.next());
			novaReserva.atualizarDatas(novoCheckIn, novoCheckOut);
			
		
			System.out.println("Não é possível realizar reserva: Data de Check-In posterior à de Check-Ou");
		
			
		}
		catch(ParseException e) {
			System.out.println("Erro em fromato de data: " + e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println("Erro em dados: " +e.getMessage());
		}
		
		input.close();
	}
	}

	
	
