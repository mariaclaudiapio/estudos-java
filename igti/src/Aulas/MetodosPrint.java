package aulas;

public class MetodosPrint {

	public static void main(String[] args) {
		
		int idade = 30;
		double altura = 1.81;
		String nome = "Joaquim Jos� da Silva";
		boolean estudante = true;
		char sexo = 'M';
		
		//operadores curingas usados em conjunto com o printf:
		//%s String
		//%d Int
		//%.4f float ou double com quatro casas decimais (esse n�mero pode variar conforme 
		// necessidade do programa
		//%b boolean
		//%c caractere (char);
		
		System.out.printf("A idade � %d e a altura � %.2f.\nO nome � %s e o sexo � %c. \n� estudante? %b.", idade, altura, nome, sexo, estudante);

	}

}

//lembrando que o printl pula uma linha.
// e o print n�o pula linha alguma.