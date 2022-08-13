package pacotePrincipal2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Scanner entCaracter = new Scanner(System.in);
		Scanner entNumerico = new Scanner(System.in);
		char imprimirEndereco;
		
		System.out.println("Digite o nome: ");
		p1.nome = entCaracter.nextLine();
		
		System.out.println("Digite a idade: ");
		p1.idade = entNumerico.nextInt();
		
		System.out.println("Digite o CPF: ");
		p1.CPF = entCaracter.nextLine();
		
		System.out.println("Digite a rua: ");
		p1.endereco.logradouro = entCaracter.nextLine();
		
		System.out.println("Digite o número: ");
		p1.endereco.numero = entNumerico.nextInt();
		
		System.out.println("Digite o complemento: ");
		p1.endereco.complemento = entCaracter.nextLine();
		
		System.out.println("Digite a cidade: ");
		p1.endereco.cidade = entCaracter.nextLine();
		
		System.out.println("Digite o estado: ");
		p1.endereco.estado = entCaracter.nextLine();
		
		System.out.println("Digite o CEP: ");
		p1.endereco.CEP = entCaracter.nextLine();
		
		System.out.println("Deseja imprimir os dados com o endereço?");
		imprimirEndereco = entCaracter.nextLine().charAt(0);
		
		System.out.printf("%s\n", p1.imprimirDadosPessoa(imprimirEndereco));
		
		Pessoa p2 = new Pessoa("Carlos Silva", 49, "123456789-15");
		p2.endereco.logradouro = "Avenida B";
		p2.endereco.numero = 890;
		p2.endereco.complemento = "Casa B";
		p2.endereco.cidade = "Manaus";
		p2.endereco.estado = "AM";
		p2.endereco.CEP = "56678-978";
		
		System.out.printf("%s\n", p2.imprimirDadosPessoa('S'));
		
		Pessoa p3 = new Pessoa("Beatriz Lima", 56, "098098098-98",
				 "Avenida Souza", 78, "Casa Fundos", "Curitiba",
				 "PR", "56789-90");
		System.out.printf("%s\n", p3.imprimirDadosPessoa('S'));
		
		
	}

}
