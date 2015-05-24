package edu.fatec.classes;

import java.io.IOException;
import java.util.List;

public class Calculo {
	
	private static float calcMedia(String[] deveres) {
		if(deveres == null || deveres.length == 0) {
	        return 0;
	    }
		float valor = 0;
		for (String dever : deveres) {
			valor += Float.valueOf(dever);
		}
		return valor / deveres.length;
    }
	
	public static String letraNota (float nota) {
		if (nota >= 90)
			return ("A");
		if (nota > 80 && nota < 90)
			return ("B");
		if (nota > 70 && nota < 80)
			return ("C");
		if (nota > 60 && nota < 70)
			return ("D");
		return ("F");
	}
	
	public static void mediaTarefas(String tarefa) throws IOException {
		List <Aluno> l = LeituraArquivos.lerArquivo();
		for (Aluno a : l) {
			if (tarefa.equals("deveres")) {
				String[] deveres = a.getDeveres();
				System.out.println("Média dos Deveres do Aluno: " + a.getNome() + " é: " + Calculo.calcMedia(deveres));
			}
			
			if (tarefa.equals("quizzes")) {
				String[] quizzes = a.getQuizzes();
				System.out.println("Média dos Quizzes do Aluno: " + a.getNome() + " é: " + Calculo.calcMedia(quizzes));
			}
			
			if (tarefa.equals("testes")) {
				String[] testes = a.getTestes();
				System.out.println("Média dos Testes do Aluno: " + a.getNome() + " é: " + Calculo.calcMedia(testes));
			}
		}
	}
}
