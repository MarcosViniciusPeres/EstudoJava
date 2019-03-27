package br.com.introducao.controleDeFluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade <= 18 juvenil
        // idade > 18 adulta

        int idade = 19;
        String status;



        //status = idade < 18 ? <true> : <false> ;
        status = idade < 15 ? "Infantil" : idade >= 15 && idade <= 18 ? "Juvenil" : "Adulto";
        System.out.println(status);
    }

}
