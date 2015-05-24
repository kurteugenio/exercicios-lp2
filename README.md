Identifique quais serão as classes necessárias a serem desenvolvidas para
atender o programa especificado abaixo. Implemente um projeto Java que
atenda todos os requisitos abaixo. A classe Main.java deverá ser implementada
separadamente no pacote edu.fatec.dados e deverá conter somente o método
public static void main(String[] x).
Observação: Lembre-se que cada classe implementada no projeto deverá
conter somente os atributos e comportamentos que competem à classe.
Tente seguir os passos:

Leia do arquivo dados.txt (obter template do arquivo no Moodle) as
informações necessárias para criar a estrutura especificada abaixo. O
número de registros contidos no arquivo é ilimitado;

Para cada grupo de registros do arquivo, deverá ser criado um dicionário
composto por “nome”, “dever de casa”, “quizzes” e “testes”, conforme
exemplo abaixo:
estudantes = {
{
"nome" : "Lloyd" ,
"deveres" : { 90,0 , 97,0 , 75,0 , 92,0 },
"quizzes" : { 88,0 , 40,0 , 94,0 },
"testes" : { 75.0 , 90.0 }
},
{
"nome" : "Alice" ,
"deveres" : { 100,0 , 92,0 , 98,0 , 100,0 },
"quizzes" : { 82,0 , 83,0 , 91,0 },
"testes" : { 89.0 , 97.0 }
},
{
"nome" : "Tyler" ,
"deveres" : { 0.0 , 87.0 , 75.0 , 22.0 },
"quizzes" : { 0,0 , 75,0 , 78,0 },
"testes" : { 100.0 , 100.0 }
}
}

Criar um método detail(), que para cada aluno em sua lista de
alunos, imprima os dados do aluno, da seguinte forma:
o imprimir o nome do aluno
o imprimir as notas dos trabalhos de casa do aluno
o imprimir as notas dos quizzes do aluno
o imprimir as notas dos testes do aluno
Escrever um método que leia uma lista de números e retorne o resultado
do cálculo de uma média simples. O método deverá ser único e será
usada para calcular qualquer média solicitada;

Escreva um método chamado getAverage() que receba como
parâmetro um dicionário que representa um registro de estudante como
entrada e retorna sua média ponderada, considerando:
o
Multiplicar as três médias por seus respectivos pesos e retornar a
soma dos três. Lição de casa corresponde a 10%, os
questionários correspondem a 30% e os testes correspondem a
60% da nota.

Defina um novo método chamado getLetterGrade() que tenha um
argumento chamado de pontuação e retorne a nota final do aluno em
termos de “conceito”, considerando:
Se a
Else
Else
Else
Caso

pontuação é 90 ou
if pontuação é de
if pontuação é de
if pontuação é de
contrário: return
acima: voltar "A"
80 ou acima: voltar "B"
70 ou acima: return "C"
60 ou acima: return "D"
"F" .
Definir um método chamado getClassAverage() que receba como
parâmetro uma lista de estudantes e para cada aluno faça:

o A impressão do detalhamento de cada aluno;
o A impressão da nota final do aluno e do seu conceito final; e
o Calcule e imprima a média geral (média simples) da classe.
O método main() criado dentro da classe Main.java será responsável
por orquestrar todas as chamadas às classes criadas do projeto.
