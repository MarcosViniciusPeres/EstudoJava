package br.com.javacore.introducaometodos.test;

import br.com.javacore.introducaometodos.Classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        //aluno.nome = " Marcao";
        //aluno.idade = 23;

        //aluno.notas = new int[]{70,80,70};
        //aluno.nota1 = 60;
        //aluno.nota2 = 60;
        //aluno.nota3 = 59;
        aluno.setNome("VINI");
        aluno.setIdade(20);
        aluno.setNotas(new int[]{40,20,100});

        aluno.imprimirOsDados();

        aluno.mediaAluno();

    }
}
