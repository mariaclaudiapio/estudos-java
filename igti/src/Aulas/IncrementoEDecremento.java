package aulas;

public class IncrementoEDecremento {

	public static void main(String[] args) {
		int x = 0;
		System.out.printf("Valor de x: %d.\n", x);
		x++;
		System.out.printf("Valor de x: %d.\n", x);
		x++;
		System.out.printf("Valor de x: %d.\n", x);
		x = x + 1;
		System.out.printf("Valor de x: %d.\n", x);
		x = x + 2;
		System.out.printf("Valor de x: %d.\n", x);
		
		int y = 500;
		System.out.printf("Valor de y: %d.\n", y);
		y = y - 1;
		System.out.printf("Valor de y: %d.\n", y);
		y--;
		System.out.printf("Valor de y: %d.\n", y);
		y--;
		System.out.printf("Valor de y: %d.\n", y);
		y = y - 2;
		System.out.printf("Valor de y: %d.\n", y);
	}
}
