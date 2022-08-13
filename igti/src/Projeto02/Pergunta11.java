package desafios;

import java.util.*;

public class Pergunta11 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[] valores = new int[1000], repeticoes = new int[1000];
		int limiteSuperior = 100;
		Random random = new Random(); //classe para gerar números aleatórios
		
		for (int i = 0; i < 1000; i++) {
			repeticoes[ valores[100] ]++;
		}
		for (int i = 0; i < 100; i++)
			System.out.printf("O número %d repete %d vezes.\n", i, repeticoes[i]);

	}

}
