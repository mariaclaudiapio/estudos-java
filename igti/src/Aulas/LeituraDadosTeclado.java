package aulas;

import java.math.*;

import java.util.*;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, frequencia,totalNotas;
		char statusAluno;
		boolean aprovado;
		
		Scanner entradaNotas = new Scanner(System.in);
		Scanner entradaCaractere = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: "); //instru��o impressa no console, para  o usu�rio		
		
		String nomeAluno = entradaCaractere.nextLine(); //aqui � lido o nome do aluno do teclado
		
		System.out.println("Digite um caractere para a situa��o do aluno(O --> OK; P --> Pend�ncia: )");
		statusAluno = entradaCaractere.nextLine().charAt(0);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entradaNotas.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entradaNotas.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = entradaNotas.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = entradaNotas.nextDouble();
		
		System.out.println("Digite a frequ�ncia do aluno: ");
		frequencia = entradaNotas.nextDouble();
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
		aprovado = totalNotas >= 70 && frequencia >= 0.75;
		
		System.out.printf("A aluna %s obteve nota final %.2f e frequencia %.2f%%. A situa��o dela � %c; \n"
				+ " Aluna aprovada? %b.", nomeAluno, totalNotas, frequencia * 100, statusAluno, aprovado);
		
		
		
		

	}

}
