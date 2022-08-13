package desafios;

import java.util.*;

public class Pergunta12 {

	public static void main(String[] args) {
		int n1 = 0;
		boolean resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro...:");
		n1 = entrada.nextInt();
		
		resultado = (n1 % 2 == 0);
		
		System.out.println("O resultado é: " + resultado);

	}
	
	

}
