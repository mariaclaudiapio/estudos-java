package aulas;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		// for (inicializa��o; condi��o; incremento)
		int i = 0, j = 0;
		
		System.out.println("In�cio. N�o vai repetir.");
		for (i = 0; i < 10; i++) {
			System.out.printf("Tabuada do %d: \n", i);
			for (j = 0; j < 10; j++) {
				System.out.printf("%d * %d = %d.\n", i, j, i * j);
			}
		}		

	}

}
