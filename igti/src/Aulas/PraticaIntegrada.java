package aulas;

import java.util.Scanner;

public class PraticaIntegrada {

	public static void main(String[] args) {
		Scanner entCaracteres = new Scanner(System.in);
		Scanner entNumeros = new Scanner(System.in);
		char operacao = ' ';
		int[] numeros = new int[1000];
		int i = 0, somatorio = 0, contaPares = 0;
		double media = 0;
		
		do {
			System.out.printf("Menu de op��es: \n"
					+ "D - para digitar novos n�meros.\n"
					+ "Z - para apresentar o somat�rio dos n�meros.\n"
					+ "V - para visualizar todos os n�meros digitados.\n"
					+ "P - para a quantidade de n�meros digitados.\n"
					+ "M - para a m�dia simples dos n�meros digitados.\n"
					+ "Q - para a quantidade de pares.\n"
					+ "S - para sair do programa.\n");
			operacao = entCaracteres.nextLine().charAt(0);
			
			switch (operacao) {
				case 'D': 
					System.out.println("Digite o n�mero desejado: ");
					numeros[i] = entNumeros.nextInt();
					i++;
					break;
				case 'Z':
					for (int j = 0; j < i; j++) {
						somatorio = somatorio + numeros[j];
					}
					System.out.printf("O somat�rio dos n�meros �: %d\n", somatorio);
					break;
				case 'V':
					for (int j = 0; j < i; j++) {
						System.out.printf("%d\n", numeros[j]);						
					}
					break;
				case 'P':
					System.out.printf("Foram digitados %d n�meros.", i);
					break;
				case 'M':
				 	for (int j = 0; j < i; j++) {
				 		somatorio = somatorio + numeros[j];
				 	}
				 	media = somatorio / i;
				 	System.out.printf("A m�dia dos n�meros �: %2f.\n", media);
				 	break;
				case 'Q':
					for (int j = 0; j < i; j++) {
						if (numeros[j] % 2 == 0)
							contaPares = contaPares + 1;
					}
					System.out.printf("Quantidade de n�meros pares: %d.\n", contaPares);
					break;
				case 'S':
					break;
				default: 
					System.out.println("Op��o inv�lida!");
					
			}
		} while (operacao != 'S');
		
		System.out.println("Fim da execu��o");

	}

}
