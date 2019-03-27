package br.com.introducao.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        String[] nomes = new String[5];

        nomes[0] = "Marquin";
        nomes[1] = "fabiano";
        nomes[2] = "marcao";
        nomes[3] = "Dara";
        nomes[4] = " Silvana";

        for (int i = 0; i < nomes.length; i++) {

            System.out.println("NOMES MARCADOS: " + nomes[i]);
        }

        nomes = new String[4];

    }
}
