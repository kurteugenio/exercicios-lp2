package edu.fatec.dados;

import java.io.IOException;
import java.util.List;

import edu.fatec.classes.Aluno;
import edu.fatec.classes.Calculo;
import edu.fatec.classes.LeituraArquivos;

public class Main {

	public static void main(String[] args) throws IOException {
		Aluno.details("nome1");
//		Aluno.details(LeituraArquivos.lerArquivo());
//		List<Aluno> l = LeituraArquivos.lerArquivo();
//		for (Aluno a : l)
//			System.out.println(Calculo.letraNota(Calculo.calcMedia(a.getDeveres())));
//		Calculo.mediaTarefas("deveres");
//		Calculo.mediaTarefas("quizzes");
	}

}
