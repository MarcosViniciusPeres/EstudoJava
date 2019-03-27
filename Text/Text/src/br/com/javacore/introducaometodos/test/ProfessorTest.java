package br.com.javacore.introducaometodos.test;

import br.com.javacore.introducaometodos.Classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "1212.2.2.1.21";
        prof.nome  = " Nardenio";
        prof.rg = " 123123123-35";
        prof.matricula = " 123123123";

        Professor prof2 = new Professor();
        prof2.cpf = "1212.2.2.1.21";
        prof2.nome  = " ASD";
        prof2.rg = " 123123123-35";
        prof2.matricula = " 123123123";

        prof.imprime();
        prof2.imprime();

    }
}
