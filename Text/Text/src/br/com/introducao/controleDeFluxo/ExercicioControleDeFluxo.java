package br.com.introducao.controleDeFluxo;

import java.sql.SQLOutput;

public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
       double salario = 900;

        if (salario < 1000) {
            salario = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000) {
            salario = salario * 0.1;
        } else if (salario >= 2000 && salario < 4000) {
            salario = salario * 0.15;
        } else {
            salario = salario * 0.2;

        }
        System.out.println("O imposto combrado sobre este salario eh: " +salario);
    }
}