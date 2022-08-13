package aulas;

public class ConjuntoOperadores {

	public static void main(String[] args) {
		// x² + 12x -13 = 0
		// 2x² - 16 - 18 = 0
		
		/* 1ª operação:
		double a, b, c;
		a = 1;
		b = 12; 
		c = -13;
		
		double delta = 0;
		delta = (b * b) - (4 * a * c);		
		System.out.printf("O valor do delta é: %.0f.\n", delta);
		
		double xLinha = 0;
		xLinha = (-b + Math.sqrt(delta))/ (2 * a);
		System.out.printf("O valor de x' é: %.0f.\n", xLinha);
		
		double xDuasLinhas = 0;
		xDuasLinhas = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("O valor de x'' é: %.0f.\n", xDuasLinhas);
		*/
		
		//2ª operação:
		double a, b, c;
		a = 2;
		b = -16; 
		c = -18;
		
		double delta = 0;
		delta = (b * b) - (4 * a * c);		
		System.out.printf("O valor do delta é: %.0f.\n", delta);
		
		double xLinha = 0;
		xLinha = (-b + Math.sqrt(delta))/ (2 * a);
		System.out.printf("O valor de x' é: %.0f.\n", xLinha);
		
		double xDuasLinhas = 0;
		xDuasLinhas = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("O valor de x'' é: %.0f.\n", xDuasLinhas);
		

	}

}
