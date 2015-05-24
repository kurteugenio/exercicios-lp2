package edu.fatec.classes;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class LeituraArquivos {
 
    public static List<Aluno> lerArquivo() throws IOException {
        List<Aluno> listAlunos = new ArrayList<>();
        List<String> lista = new ArrayList<>();
        FileReader f = new FileReader("dados");
        BufferedReader in = new BufferedReader(f);
        String linha = "";
 
        while (linha != null) {
            linha = in.readLine();
            lista.add(linha);
        }
 
        for (int i = 0; i < lista.size(); i = i + 4) {
            String dado = lista.get(i);
            if (dado == null) {
                break;
            }
            if (!dado.equals("#")) {
                Aluno aluno = new Aluno();
                aluno.setNome(dado.split(":")[1]);
                aluno.setDeveres(lista.get(i + 1).split(":")[1].split(","));
                aluno.setQuizzes(lista.get(i + 2).split(":")[1].split(","));
                aluno.setTestes(lista.get(i + 3).split(":")[1].split(","));
                listAlunos.add(aluno);
            } else {
                i = i - 3;
            }
        }
        f.close();
        return listAlunos;
    }
}