package aulas;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//tipo[] nome = new tipo[tamanho];
		int[] numeros = new int[6]; //em Java, esse tamanho de array não pode ser alterado posteriormente
		int total = 0, i = 0;
		Scanner ent = new Scanner(System.in);
		
		for (i = 0; i < 6; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			numeros[i] = ent.nextInt();
			total = total + numeros[i];
			System.out.printf("Total parcial: %d.\n", total);
		}
		
		System.out.printf("O valor total é: %d.", total);

	}

}
