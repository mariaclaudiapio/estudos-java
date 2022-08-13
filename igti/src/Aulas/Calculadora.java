package aulas;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/* Conteúdo desenvolvido na aula de 09 de agosto de 2022.
		 * Arquitetura destacando as três etapas de um programação de computador.
		 * Entrada: dois números e uma operação que pode ser adição, subtração, divisão ou multiplicação.
		 * Processamento: a aplicação da operação sobre os dois números.
		 * Saída: o resultado do cálculo realizado.
		 */
		double n1, n2, total;
		char operacao;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		n2 = entrada.nextDouble();
		
		entrada.nextLine(); //esse comando limpa o buffer e evita o erro que o Java retorna quando usamos scanner para dois ou mais tipos diferentes. Esse comando deve ser usado antes de se declarar o próximo scanner com variável diferente.
		
		System.out.println("Digite a operação (+, -, / ou *): ");
		operacao = entrada.nextLine().charAt(0);
		
		if (operacao == '+')
			total = n1 + n2;
		else if (operacao == '-')
			total = n1 - n2;
		else if (operacao == '*')
			total = n1 * n2;
		else 
			total = n1 / n2;
		
		System.out.printf("%.2f %c %.2f = %.2f.", n1, operacao, n2, total);
	}

}
