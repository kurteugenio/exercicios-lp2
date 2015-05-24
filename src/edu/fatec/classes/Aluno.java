package edu.fatec.classes;
 
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
 
public class Aluno {
    private String nome;
    private String deveres[];
    private String quizzes[];
    private String testes[];
 
    public static void details(String aluno) throws IOException {
        List <Aluno> list = LeituraArquivos.lerArquivo();
    	for (Aluno a : list) {
    		String n = a.getNome();
    		if (n.equals("aluno")) {
    			System.out.println("Aluno: " + a.getNome());
    			System.out.println("Notas dos Deveres: " + Arrays.toString(a.getDeveres()));
            	System.out.println("Notas dos Quizzes: " + Arrays.toString(a.getQuizzes()));
            	System.out.println("Notas dos Testes: " + Arrays.toString(a.getTestes()));
    		}
        }
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
 
    public void setDeveres(String[] deveres) {
        this.deveres = deveres;
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