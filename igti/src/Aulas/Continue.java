package aulas;

import java.util.*;

public class Continue {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0, contador = 0;
		
		do {
			System.out.println("Digite números positivos ou zero para sair.");
			numero = entrada.nextInt();
			
			if (numero == 18)
				continue;
			
			somatorio = somatorio + numero;
		} while (numero > 0);
		System.out.printf("O somatório é: %d.", somatorio);
	}

}
