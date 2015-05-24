package edu.fatec.classes;

import java.util.*;

public class Aluno {
	public static String nome;
	public static String deveres[];
	public static String quizzes[];
	public static String testes[];
	
	public static void details(List<Aluno> list) {
		for (Aluno s:listAlunos)
			System.out.println(Arrays.toString(s));
//		System.out.println("Nome: " + Aluno.getNome());
//		System.out.println("Notas dos Deveres: " + Arrays.toString(Aluno.getDeveres()));
//		System.out.println("Notas dos Quizzes: " + Arrays.toString(Aluno.getQuizzes()));
//		System.out.println("Notas dos Testes: " + Arrays.toString(Aluno.getTestes()));
	}
	
	public static String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Aluno.nome = nome;
	}
	public static String[] getDeveres() {
		return deveres;
	}
	public void setDeveres(String[] string) {
		Aluno.deveres = string;
	}
	public static String[] getQuizzes() {
		return quizzes;
	}
	public void setQuizzes(String[] quizzes) {
		Aluno.quizzes = quizzes;
	}
	public static String[] getTestes() {
		return testes;
	}
	public void setTestes(String[] testes) {
		Aluno.testes = testes;
	}
}
	
	