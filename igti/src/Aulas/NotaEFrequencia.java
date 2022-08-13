package aulas;

public class NotaEFrequencia {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;		
		char statusAluno;
		boolean aprovado;
		String nomeAluno;
		
		nomeAluno = "Ana Paula da Silva Couto";
		statusAluno = 'M';
		
		nota1 = 20;
		nota2 = 20;
		nota3 = 30;
		nota4 = 5;
		
		frequencia = 0.80; //80%
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
		
		aprovado = totalNotas >= 70 && frequencia >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequência %.2f%%. A situação do(a) aluno(a) é %c.\n"
				+ "Aluno aprovado? %b.", nomeAluno, totalNotas, frequencia * 100, statusAluno, aprovado);
	}

}
