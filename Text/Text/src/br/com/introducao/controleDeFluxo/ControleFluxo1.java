package br.com.introducao.controleDeFluxo;

import java.sql.SQLOutput;

public class ControleFluxo1 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade <= 18 juvenil
        //idade > 18 adulta
        int idade = 20;
        String categoria;

        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade <= 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";

        }
        System.out.println(categoria);
    }
}