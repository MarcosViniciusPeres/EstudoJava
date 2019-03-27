package br.com.javacore.introducaoclasses.test;

import br.com.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor nardenio = new Professor();
        nardenio.cpf = "123123123";
        nardenio.matricula = "123123312";
        nardenio.nome = " NARDENIO";
        nardenio.rg = "1.2.3.412.31.2";


        System.out.println("CPF: "+nardenio.cpf);
        System.out.println("MATRICULA: "+nardenio.matricula);
        System.out.println("NOME: "+nardenio.nome);
        System.out.println("RG: "+nardenio.rg);
    }
}
