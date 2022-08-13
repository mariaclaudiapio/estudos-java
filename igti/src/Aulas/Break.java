package aulas;

import java.util.*;

public class Break {

	public static void main(String[] args) {
		/* O break � usado para sair de um la�o
		 * O continue � usado para for�ar uma itera��o antecipada do la�o
		 */
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0;
		
		System.out.println("Digite o n�mero desejado: ");
		numero = entrada.nextInt();
		
		while (numero > 0) {
			somatorio = somatorio + numero;
			
			System.out.println("Digite o n�mero desejado: ");
			numero = entrada.nextInt();
			
			if (numero == 13)
				break;
		}
		System.out.printf("O somat�rio foi: %d.", somatorio);
	}

}
