package desafios;

import java.util.*;

public class Pergunta1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		boolean continuar = true;
		String senha = "uj990", senhaDigitada;
		int nTentativas = 0;
		
		while (continuar) {
			System.out.println("Digite a senha de acesso: ");
			senhaDigitada = ent.nextLine();
			nTentativas++;
			
			if (senha.equals(senhaDigitada)) {
				System.out.println("Acesso concedido");
				break;
			} else if (nTentativas > 5) {
				System.out.println("N?meros de tentativas excedido.");
				break;
			}
		}

	}

}
