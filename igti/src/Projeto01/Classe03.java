package Pacote01;
import java.util.Scanner;

// programinha que verifica a nota e frequ�ncia de um aluno e retorna se ele foi aprovado. 
public class Classe03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, nota3 = 0, notaTotal = 0, frequencia = 0;
		double notaCorte = 50, freqCorte = 60;
		
		System.out.println("Digite a primeira nota..: ");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota..: ");
		nota2 = entrada.nextDouble();
		System.out.println("Digite a terceira nota..: ");
		nota3 = entrada.nextDouble();
		System.out.println("Digite a frequ�ncia..: ");
		frequencia = entrada.nextDouble();
		
		notaTotal = nota1 + nota2 + nota3;
		if (notaTotal >= notaCorte && frequencia >= freqCorte )
			System.out.println("Aprovado.");
		else if (notaTotal >= (notaCorte - notaCorte * 0.20 * 0.20) && frequencia >= freqCorte)
			System.out.println("Prova especial.");
		else if (notaTotal >= 80)
			System.out.println("Aprovado direto.");
		else
			System.out.println("Reprovado.");

	}

}
