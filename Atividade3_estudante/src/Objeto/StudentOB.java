package Objeto;

import java.util.Scanner;

import Classe.StudentCL;

public class StudentOB {

	public static void main(String[] args) {
		Scanner av = new Scanner(System.in);
		StudentCL st = new StudentCL();

		System.out.println("Imforme o nome do estudante:");
		st.nome = av.nextLine();
		
		System.out.println("Imforme a nota da primeira avaliação:");
		st.av1 = av.nextDouble();
		
		System.out.println("Imforme a nota da segunda avaliação:");
		st.av2 = av.nextDouble();
		
		System.out.println("Imforme a nota da terceira avaliação:");
		st.av3 = av.nextDouble();
		
		
		System.out.printf("Media: %.2f\n", st.Media());
		
		if(st.Situacao()) {
			System.out.println("Aluno aprovado!");
		}
		else {
			System.out.println("Aluno reprovado!");
			System.out.println("Faltava " + st.Resto() + " para passar");
		}
		av.close();
	
		
	}

}
