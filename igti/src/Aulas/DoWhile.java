package aulas;

import java.util.*;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char continuar = ' ';
		System.out.println("Deseja continuar (S - Sim; N - N�o)?");
		continuar = entrada.nextLine().charAt(0);
		
		/* while (continuar == 'S') {
			 System.out.println("Mensagem");
			 System.out.println("Deseja continuar (S - Sim; N - N�o)?");
			 continuar = entrada.nextLine().charAt(0);
		 } */
		 
		 
		 
		 do {
			 System.out.println("Mensagem");
			 System.out.println("Deseja continuar (S - Sim; N - N�o)?");
			 continuar = entrada.nextLine().charAt(0);
		 } while (continuar == 'S');
		 
		

	}
	

}
