package edu.fatec.classes;

import java.util.*;

public class Aluno {
	public static String nome;
	public static String deveres[];
	public static String quizzes[];
	public static String testes[];
	
//	public static void details(List<Aluno> list) {
//		for (Aluno a:list) {
//			System.out.println("Nome: " + a.getNome());
//			System.out.println("Notas dos Deveres: " + Arrays.toString(a.getDeveres()));
//			System.out.println("Notas dos Quizzes: " + Arrays.toString(a.getQuizzes()));
//			System.out.println("Notas dos Testes: " + Arrays.toString(a.getTestes()));
//		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		Iterator<Aluno> alunoIterator = list.iterator();
//		while (alunoIterator.hasNext()) {
//			System.out.println(alunoIterator.next());
//		}
//	}
	
	public static void details(List<Aluno> list, String aluno, String tipoteste) {
		for(int x = 0; x < list.size() - 1; x++)
			if(list.equals(list.getNome("aluno")))
				System.out.println("Aluno: " + list.getNome(x));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Aluno.nome = nome;
	}
	public String[] getDeveres() {
		return deveres;
	}
	public void setDeveres(String[] string) {
		Aluno.deveres = string;
	}
	public String[] getQuizzes() {
		return quizzes;
	}
	public void setQuizzes(String[] quizzes) {
		Aluno.quizzes = quizzes;
	}
	public String[] getTestes() {
		return testes;
	}
	public void setTestes(String[] testes) {
		Aluno.testes = testes;
	}
}
	
	