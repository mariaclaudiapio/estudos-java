package aulas;

import java.io.*;
import java.util.*;

public class LeituraArquivo {

	public static void main(String[] args) {
		
		try {
			FileReader arquivo = new FileReader("C:\\Users\\Usuario\\OneDrive\\Documentos\\CURSOS\\MENTORIA CONQUISTE SUA VAGA\\postagem_linkedIn_19JUL22.txt");
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			String linha;
			linha = lerArquivo.readLine();
			
			while (linha != null ) {
				
				String[] dadosCliente = new String[5];
				dadosCliente = linha.split(";");
				
				System.out.printf("Código do cliente: %s.\n" +
						  "Nome do cliente: %s.\n" +
						  "Endereço: %s.\n" +
						  "Cidade: %s.\n" +
						  "Estado civil: %s.\n", dadosCliente[0], dadosCliente[1], dadosCliente[2], dadosCliente[3], dadosCliente[4]);
				
				linha = lerArquivo.readLine();
				System.out.println(" ");
				
				
				
			}
			lerArquivo.close();
			arquivo.close();
				
		} catch (IOException e) {
			System.out.println("Erro lendo dados: " + e.getMessage());
		}

	}

}
