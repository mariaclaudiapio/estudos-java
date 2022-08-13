package aulas;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean emprestimosQuitados, rendaComprovada, dezEstrelas, restricaoCredito;
		
		emprestimosQuitados = false;
		rendaComprovada = true;
		dezEstrelas = false;
		restricaoCredito = false;
		
		boolean concederEmprestimo = (emprestimosQuitados && rendaComprovada || dezEstrelas) && !restricaoCredito;
		System.out.printf("Empréstimo concedido? \n%b.", concederEmprestimo);
		

	}

}
