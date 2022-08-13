package aulas;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		int var1 = 10, var2 = 20;
		boolean resultadoIgual;
		
		resultadoIgual = (var1 == var2);
		
		System.out.printf("As variáveis são iguais? \nResposta: %b.", resultadoIgual);
		
		int var3 = 10, var4 = 20;
		boolean resultadoDiferente;
		
		resultadoDiferente = (var3 != var4);
		
		System.out.printf("\nAs variáveis são diferentes? \nResposta: %b.", resultadoDiferente);
		
		int var5 = 10, var6 = 20;
		boolean resultadoMaior, resultadoMenor;
		
		
		resultadoMaior = (var5 > var6);
		resultadoMenor = (var5 < var6);
		
		System.out.printf("\nA variável %d é maior que a variável %d? \nResposta: %b.", var5, var6, resultadoMaior);
		System.out.printf("\nA variável %d é menor que a variável %d? \nResposta: %b.", var5, var6, resultadoMenor);
		
		
		


	}

}
