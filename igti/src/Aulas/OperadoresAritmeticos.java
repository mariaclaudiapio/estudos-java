package aulas;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, totalAdicao = 0;
		n1 = 10;
		n2 = 20;
		totalAdicao = n1 + n2;
		System.out.printf("O resultado de %d + %d = %d.", n1, n2, totalAdicao);
		
		int n3 = 0, n4 = 0, totalSubtracao = 0;
		n3 = 50;
		n4 = 80;
		totalSubtracao = n3 - n4;
		System.out.printf("\nO resultado de %d - %d = %d.", n3, n4, totalSubtracao);
		
		int n5 = 0, n6 = 0, totalMultiplicacao = 0;
		n5 = 2;
		n6 = 3;
		totalMultiplicacao = n5 * n6;
		System.out.printf("\nO resultado de %d * %d = %d.", n5, n6, totalMultiplicacao);
		
		double n7 = 0, n8 = 0, totalDivisao = 0;
		n7 = 45;
		n8 = 7;
		totalDivisao = n7 / n8;
		System.out.printf("\nO resultado de %.2f * %.2f = %.4f.", n7, n8, totalDivisao);

		double n9 = 0, n10 = 0, restoDivisao = 0;
		n9 = 83;
		n10 = 4;
		restoDivisao = n9 % n10;
		System.out.printf("\nO O total de %.2f dividido por %.2f possui resto %.4f.", n9, n10, restoDivisao);
	}		
}
