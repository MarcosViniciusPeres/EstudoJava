package br.com.javacore.introducaoclasses.test;

import br.com.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "Joao";
        joao.matricula = "1212";
        joao.idade = 24;

        System.out.println("NOME : " +joao.nome);
        System.out.println("IDADE : " +joao.idade);
        System.out.println("MATRICULA : " +joao.matricula);
    }
}
