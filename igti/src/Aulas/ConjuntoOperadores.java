package aulas;

public class ConjuntoOperadores {

	public static void main(String[] args) {
		// x� + 12x -13 = 0
		// 2x� - 16 - 18 = 0
		
		/* 1� opera��o:
		double a, b, c;
		a = 1;
		b = 12; 
		c = -13;
		
		double delta = 0;
		delta = (b * b) - (4 * a * c);		
		System.out.printf("O valor do delta �: %.0f.\n", delta);
		
		double xLinha = 0;
		xLinha = (-b + Math.sqrt(delta))/ (2 * a);
		System.out.printf("O valor de x' �: %.0f.\n", xLinha);
		
		double xDuasLinhas = 0;
		xDuasLinhas = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("O valor de x'' �: %.0f.\n", xDuasLinhas);
		*/
		
		//2� opera��o:
		double a, b, c;
		a = 2;
		b = -16; 
		c = -18;
		
		double delta = 0;
		delta = (b * b) - (4 * a * c);		
		System.out.printf("O valor do delta �: %.0f.\n", delta);
		
		double xLinha = 0;
		xLinha = (-b + Math.sqrt(delta))/ (2 * a);
		System.out.printf("O valor de x' �: %.0f.\n", xLinha);
		
		double xDuasLinhas = 0;
		xDuasLinhas = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("O valor de x'' �: %.0f.\n", xDuasLinhas);
		

	}

}
