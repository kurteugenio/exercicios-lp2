package edu.fatec.classes;

import java.util.List;

public class Aluno {
	public static String nome;
	public static String deveres[];
	public static String quizzes[];
	public static String testes[];
	
	public static void details(List<Aluno> list) {
		System.out.println("Nome: " + nome);
		System.out.println("Notas dos Deveres: " + deveres);
		System.out.println("Notas dos Quizzes: " + quizzes);
		System.out.println("Notas dos Testes: " + testes);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String[] getDeveres() {
		return deveres;
	}
	public void setDeveres(String[] string) {
		this.deveres = string;
	}
	public String[] getQuizzes() {
		return quizzes;
	}
	public void setQuizzes(String[] quizzes) {
		this.quizzes = quizzes;
	}
	public String[] getTestes() {
		return testes;
	}
	public void setTestes(String[] testes) {
		this.testes = testes;
	}
}
	
	