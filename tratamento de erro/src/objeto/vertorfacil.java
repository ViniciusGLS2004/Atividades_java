package objeto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class vertorfacil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] Alunos = new String[3];
		Alunos[0] = "Yasmim";
		Alunos[1] = "Lucas";
		Alunos[2] = "Cristiano";
		while (true) {
			try {
				System.out.println("Imforme o indice do aluno que deseja buscar no vetor: ");
				int index = input.nextInt();
				System.out.println("----------------------------------------------------------");
				// if(index <= 2 && index >= 0 ) {
				System.out.println("O aluno selecionado foi: " + Alunos[index]);
				break;
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("O index informado não existe!" + ex.getMessage());
			} catch (InputMismatchException ex) {
				System.out.println("O index deve ser um numero inteiro!");
			}
			input.nextLine();
		}
		input.close();
	}

}
