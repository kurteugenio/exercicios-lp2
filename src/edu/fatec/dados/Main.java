package edu.fatec.dados;

import java.io.IOException;
import java.util.*;

import edu.fatec.classes.Aluno;
import edu.fatec.classes.Calculo;
import edu.fatec.classes.LeituraArquivos;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Aluno> listaAlunos = LeituraArquivos.lerArquivo();
		Aluno.details(listaAlunos, "<nome1>", "deveres");
	}

}
