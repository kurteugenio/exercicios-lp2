package edu.fatec.dados;

import java.io.IOException;
import java.util.List;

import edu.fatec.classes.Aluno;
import edu.fatec.classes.Calculo;
import edu.fatec.classes.LeituraArquivos;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Aluno> listAlunos = LeituraArquivos.lerArquivo();
		Aluno.details(listAlunos);
		
		

	}

}
