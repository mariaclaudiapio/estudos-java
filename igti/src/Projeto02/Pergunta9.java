package desafios;

import java.util.*;

public class Pergunta9 {

	public static void main(String[] args) {
		int n = 0, somador = 0;
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		while (i < 10) {
			System.out.println("Digite n�meros: ");
			n = entrada.nextInt();
			somador = somador + n;
			i++;
		}
		System.out.printf("O valor somado �: %d.", somador);
	}

}
