package aulas;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/* Conte�do desenvolvido na aula de 09 de agosto de 2022.
		 * Arquitetura destacando as tr�s etapas de um programa��o de computador.
		 * Entrada: dois n�meros e uma opera��o que pode ser adi��o, subtra��o, divis�o ou multiplica��o.
		 * Processamento: a aplica��o da opera��o sobre os dois n�meros.
		 * Sa�da: o resultado do c�lculo realizado.
		 */
		double n1, n2, total;
		char operacao;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = entrada.nextDouble();
		
		entrada.nextLine(); //esse comando limpa o buffer e evita o erro que o Java retorna quando usamos scanner para dois ou mais tipos diferentes. Esse comando deve ser usado antes de se declarar o pr�ximo scanner com vari�vel diferente.
		
		System.out.println("Digite a opera��o (+, -, / ou *): ");
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
