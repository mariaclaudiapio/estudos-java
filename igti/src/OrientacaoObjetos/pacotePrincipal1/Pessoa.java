package pacotePrincipal1;

public class Pessoa {
	
	int idade;
	double altura;
	double peso;
	String nome;
	
	String imprimirDados() { 
		return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) + 
				"\nPeso " + Double.toString(peso) + "\nAltura: " + Double.toString(altura);
	}
	
	int retornarAnoNascimento() {
		return 2022 - idade;
	}
}
