package aulas;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		char operacao = ' ';
		Scanner ent = new Scanner(System.in);
		
		double n1 = 0, n2 = 0, total = 0;
		System.out.println("Digite o valor do primeiro n�mero: ");
		n1 = ent.nextInt();
		
		System.out.println("Digite o valor do segundo n�mero: ");
		n2 = ent.nextInt();
		
		ent.nextLine();
		System.out.println("Digite a opera��o desejada (+,-,/,*,%): ");
		operacao = ent.nextLine().charAt(0);
		
		switch (operacao) {
			case '+':
				total = n1 + n2;
				break;
			case '-':
				total = n1 - n2;
				break;
			case '/':
				total = n1 / n2;
				break;
			case '*':
				total = n1 * n2;
				break;
			case '%':
				total = n1 % n2;
				break;
			default:
				System.out.println("Opera��o desconhecida.");
		}
		if (operacao == '+' || operacao == '-' || operacao == '/' || operacao == '*' || operacao == '%')		
		System.out.printf("%.2f %c %.2f = %.2f", n1, operacao, n2, total);
		
		
	}

}
