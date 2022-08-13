package aulas;

import java.util.*;

public class Break {

	public static void main(String[] args) {
		/* O break é usado para sair de um laço
		 * O continue é usado para forçar uma iteração antecipada do laço
		 */
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0;
		
		System.out.println("Digite o número desejado: ");
		numero = entrada.nextInt();
		
		while (numero > 0) {
			somatorio = somatorio + numero;
			
			System.out.println("Digite o número desejado: ");
			numero = entrada.nextInt();
			
			if (numero == 13)
				break;
		}
		System.out.printf("O somatório foi: %d.", somatorio);
	}

}
