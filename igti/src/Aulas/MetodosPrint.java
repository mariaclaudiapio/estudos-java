package aulas;

public class MetodosPrint {

	public static void main(String[] args) {
		
		int idade = 30;
		double altura = 1.81;
		String nome = "Joaquim José da Silva";
		boolean estudante = true;
		char sexo = 'M';
		
		//operadores curingas usados em conjunto com o printf:
		//%s String
		//%d Int
		//%.4f float ou double com quatro casas decimais (esse número pode variar conforme 
		// necessidade do programa
		//%b boolean
		//%c caractere (char);
		
		System.out.printf("A idade é %d e a altura é %.2f.\nO nome é %s e o sexo é %c. \nÉ estudante? %b.", idade, altura, nome, sexo, estudante);

	}

}

//lembrando que o printl pula uma linha.
// e o print não pula linha alguma.