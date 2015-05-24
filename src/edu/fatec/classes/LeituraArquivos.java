package edu.fatec.classes;

import java.io.*;
import java.util.*;

public class LeituraArquivos {

	public static List<Aluno> lerArquivo () throws IOException {
		List<Aluno> listAlunos = new ArrayList<>();
		List <String> lista = new ArrayList<>();
		String vetor[];
		FileReader f = new FileReader("/home/kurt/dados");
		BufferedReader in = new BufferedReader(f);
		String linha = in.readLine();
		while (linha != null) {
			if (!linha.equals("#")) {
				vetor = linha.split(":");
				lista.add(vetor[1]);
			}
			else {
				Aluno aluno = new Aluno();
				aluno.setNome(lista.get(0));
				aluno.setDeveres(lista.get(1).split(","));
				aluno.setQuizzes(lista.get(2).split(","));
				aluno.setTestes(lista.get(3).split(","));
				listAlunos.add(aluno);
				lista.clear();
			}
			linha = in.readLine();
		} 
		f.close();
		return listAlunos;
	}
	
}
