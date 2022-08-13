package aulas;

import java.io.*;

public class GravacaoArquivo {

	public static void main(String[] args) {
		
		try {
			FileWriter arquivo = new FileWriter("C:\\Users\\Usuario\\OneDrive\\Documentos\\CURSOS\\MENTORIA CONQUISTE SUA VAGA\\postagem_linkedIn_19JUL22.txt");
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			for (int i = 0; i < 1000; i++) {
				gravarArquivo.printf("Valor de i: %d.%n", i);
			}
			
			gravarArquivo.close();
			arquivo.close();
		
	} catch (IOException e) {
		System.out.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
	}
		System.out.println("Fim da execução.");
		
}
}


