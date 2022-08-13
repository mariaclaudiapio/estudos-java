package aulas;

public class Acumuladores {

	public static void main(String[] args) {
		int notaAtividade = 0, notaTotal = 0;
		System.out.printf("Nota total....: %d.\n", notaTotal);
		notaAtividade = 10;
		notaTotal = notaTotal + notaAtividade;
		System.out.printf("Nota total....: %d.\n", notaTotal);
		notaAtividade = 30;
		notaTotal += notaAtividade;
		System.out.printf("Nota total....: %d.\n", notaTotal);
		notaAtividade = -3;
		notaTotal = notaTotal + notaAtividade;
		System.out.printf("Nota total....: %d.\n", notaTotal);

	}

}
